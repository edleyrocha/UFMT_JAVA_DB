    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.posbd.escolar.dao.mysql;

import br.ufmt.ic.posbd.escolar.anotacao.ChavePrimaria;
import br.ufmt.ic.posbd.escolar.dao.DAO;
import br.ufmt.ic.posbd.escolar.entidade.ICRUD;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author raphael
 */
public class DAOImpl<T extends ICRUD> implements DAO<T> {

    private String tabela;
    private List<Field> atributos;
    private Class cls;
    private BancoMySQL banco = new BancoMySQL();
    private String id;

    public DAOImpl() {
        cls = (Class<T>) ((ParameterizedType) getClass()
                .getGenericSuperclass())
                .getActualTypeArguments()[0];

        tabela = cls.getSimpleName().toLowerCase();
        atributos = Arrays.asList(cls.getDeclaredFields());
        for (Field field : atributos) {
            ChavePrimaria pk = 
                    field.getAnnotation(ChavePrimaria.class);
            if(pk != null){
                id = pk.nome();
                break;
            }
        }
    }

    @Override
    public boolean inserir(T t) {
        String sql = "INSERT INTO " + tabela + " (";
        for (int i = 0; i < atributos.size(); i++) {
            Field field = atributos.get(i);
            if (field.getAnnotation(ChavePrimaria.class) == null) {
                sql = sql + field.getName();
                if (i < atributos.size() - 1) {
                    sql = sql + ",";
                }
            }
        }
        sql = sql + ") VALUES (";
        for (int i = 0; i < atributos.size(); i++) {
            Field field = atributos.get(i);
            if (field.getAnnotation(ChavePrimaria.class) == null) {
                sql = sql + "?";
                if (i < atributos.size() - 1) {
                    sql = sql + ",";
                }
            }
        }
        sql = sql + ");";
        System.out.println(sql);

        execute(sql, t);
        return false;
    }

    @Override
    public boolean alterar(T t) {
        String sql = "UPDATE " + tabela + " SET ";
        for (int i = 0; i < atributos.size(); i++) {
            Field field = atributos.get(i);
            if (field.getAnnotation(ChavePrimaria.class) == null) {
                sql = sql + field.getName() + " = ?";
                if (i < atributos.size() - 1) {
                    sql = sql + ",";
                }
            }
        }
        sql = sql + " WHERE "+id+" = " + t.getId() + ";";
        System.out.println(sql);
        execute(sql, t);
        return false;
    }

    private void execute(String sql, T t) {
        PreparedStatement pstm = banco.prepareStatement(sql);
        int pos = 1;
        for (int i = 0; i < atributos.size(); i++) {
            Field field = atributos.get(i);
            if (field.getAnnotation(ChavePrimaria.class) == null) {
                String get = "get";
                String nome = field.getName();
                get = get + Character.toUpperCase(nome.charAt(0));
                get = get + nome.substring(1);
                try {
                    Method metodo = cls.getDeclaredMethod(get);
                    Object valor = metodo.invoke(t);
                    if (valor instanceof Enum) {
                        Enum enumerador = (Enum) valor;
                        pstm.setInt(pos, enumerador.ordinal());
                    } else {
                        pstm.setObject(pos, valor);
                    }
                    pos++;
                } catch (Exception ex) {
                    Logger.getLogger(DAOImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        try {
            pstm.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public boolean excluir(int id) {
        String sql = "DELETE FROM " + tabela + " WHERE "+this.id+" = " + id + ";";
        System.out.println(sql);
        banco.executar(sql);
        return false;
    }

    @Override
    public T consultar(int id) {
        String sql = "SELECT * FROM " + tabela + " WHERE "+this.id+"=" + id + ";";
        System.out.println(sql);
        ResultSet cursor = banco.executarQuery(sql);
        try {
            if (cursor.next()) {
                T t = preencher(cursor);
                cursor.close();
                return t;
            }
        } catch (Exception ex) {
            Logger.getLogger(DAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    @Override
    public List<T> listar() {
        List<T> lista = new ArrayList<T>();
        String sql = "SELECT * FROM " + tabela;
        ResultSet cursor = banco.executarQuery(sql);
        try {
            while (cursor.next()) {
                T t = preencher(cursor);
                lista.add(t);
            }
            cursor.close();
        } catch (Exception ex) {
            Logger.getLogger(DAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    private T preencher(ResultSet cursor) {
        try {
            T t = (T) cls.newInstance();
            t.setId(cursor.getInt(id));
            for (int i = 0; i < atributos.size(); i++) {
                Field field = atributos.get(i);

                String metodoSet = "set";
                String nome = field.getName();
                metodoSet = metodoSet + Character.toUpperCase(nome.charAt(0));
                metodoSet = metodoSet + nome.substring(1);

                Method metodo = cls.getDeclaredMethod(metodoSet, field.getType());
                if (field.getType().isEnum()) {
                    int ordinal = cursor.getInt(nome);

                    Enum enumerador = (Enum) field.getType()
                            .getEnumConstants()[ordinal];

                    metodo.invoke(t, enumerador);
                } else {
                    metodo.invoke(t, cursor.getObject(nome));
                }
            }
            return t;
        } catch (Exception ex) {
            Logger.getLogger(DAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
