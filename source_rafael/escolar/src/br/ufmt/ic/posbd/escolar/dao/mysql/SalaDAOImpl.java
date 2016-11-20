/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufmt.ic.posbd.escolar.dao.mysql;

import br.ufmt.ic.posbd.escolar.dao.SalaDAO;
import br.ufmt.ic.posbd.escolar.entidade.Sala;
import java.util.List;

/**
 *
 * @author raphael
 */
//public class SalaDAOImpl implements SalaDAO{
//    
//    private BancoMySQL banco = new BancoMySQL();
//
//    @Override
//    public boolean inserir(Sala t) {
//        String sql = "INSERT INTO sala (nome,bloco)"
//                + " VALUES ('"+t.getNome()+"','"+t.getBloco()+"');";
//        return banco.executar(sql);
//    }
//
//    @Override
//    public boolean alterar(Sala t) {
//        String sql = "UPDATE sala SET nome = '"+t.getNome()
//                +"', bloco = '"+t.getBloco()+"' "
//                + "WHERE id = "+t.getId();
//        return banco.executar(sql);
//    }
//
//    @Override
//    public boolean excluir(int id) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public Sala consultar(int id) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public List<Sala> listar() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//    
//}
public class SalaDAOImpl extends DAOImpl<Sala>
    implements SalaDAO{

}