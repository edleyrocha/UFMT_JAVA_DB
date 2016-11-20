/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufmt.ic.posbd.escolar;

import br.ufmt.ic.posbd.escolar.dao.SalaDAO;
import br.ufmt.ic.posbd.escolar.dao.jpa.SalaDAOImpl;

/**
 *
 * @author raphael
 */
public class FabricaDAO {
    
    public static SalaDAO criarSalaDAO(){
        return new SalaDAOImpl();
    }
    
}
