/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufmt.ic.posbd.escolar.dao.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author raphael
 */
public class BancoMySQL {
    private String url = "jdbc:mysql://localhost:3306/escolar";
    private String usuario = "root";
    private String senha = "123";
    private Connection conexao;
    
    private void abreConexao(){
        try {
            conexao = DriverManager.getConnection
                (url, usuario, senha);
        } catch (SQLException ex) {
            Logger.getLogger(BancoMySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void fechaConexao(){
        try {
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(BancoMySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean executar(String sql){
        abreConexao();
        try {
            conexao.createStatement().execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(BancoMySQL.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        fechaConexao();
        return true;
    }
    
    public ResultSet executarQuery(String sql){
        ResultSet retorno = null;
        abreConexao();
        try {
            retorno = conexao.createStatement().
                    executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(BancoMySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
//        fechaConexao();
        return retorno;
    }
    
    public PreparedStatement prepareStatement(String sql){
        abreConexao();
        try {
            return conexao.prepareStatement(sql);
        } catch (SQLException ex) {
            Logger.getLogger(BancoMySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
