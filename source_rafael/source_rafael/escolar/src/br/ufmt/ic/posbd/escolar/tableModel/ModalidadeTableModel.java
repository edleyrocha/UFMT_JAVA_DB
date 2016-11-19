/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufmt.ic.posbd.escolar.tableModel;

import br.ufmt.ic.posbd.escolarMysql.entidade.Modalidade;
import java.util.List;

/**
 *
 * @author raphael
 */
public class ModalidadeTableModel extends TableModel<Modalidade> {


    public ModalidadeTableModel(List<Modalidade> lista) {
        super(lista);
        titulos = new String[]{"Id","Nome","Tipos"};
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object ret = null;
        Modalidade modalidade = lista.get(rowIndex);
        
        switch(columnIndex){
            case 0:
                ret = modalidade.getId();
                break;
            case 1:
                ret = modalidade.getNome();
                break;
            case 2:
                ret = modalidade.getTipo();
                break;
        }
        
        return ret;
    }
}
