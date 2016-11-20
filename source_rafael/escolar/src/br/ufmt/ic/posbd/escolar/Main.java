/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.posbd.escolar;

import br.ufmt.ic.posbd.escolar.dao.ModalidadeDAO;
import br.ufmt.ic.posbd.escolar.dao.ResponsavelDAO;
import br.ufmt.ic.posbd.escolar.dao.mysql.ModalidadeDAOImpl;
import br.ufmt.ic.posbd.escolar.dao.mysql.ResponsavelDAOImpl;
import br.ufmt.ic.posbd.escolar.dao.mysql.SalaDAOImpl;
import br.ufmt.ic.posbd.escolar.entidade.Modalidade;
import br.ufmt.ic.posbd.escolar.entidade.Responsavel;
import br.ufmt.ic.posbd.escolar.entidade.Sala;
import br.ufmt.ic.posbd.escolar.entidade.Tipo;
import br.ufmt.ic.posbd.escolar.gui.PrincipalJFrame;
import java.util.List;

/**
 *
 * @author raphael
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        PrincipalJFrame tela = new PrincipalJFrame();
        tela.setVisible(true);

    }

}
