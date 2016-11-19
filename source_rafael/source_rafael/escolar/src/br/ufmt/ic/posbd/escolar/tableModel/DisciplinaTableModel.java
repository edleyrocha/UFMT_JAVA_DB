/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufmt.ic.posbd.escolar.tableModel;


import br.ufmt.ic.posbd.escolarPostgresql.entidade.Disciplina;
import java.util.List;

/**
 *
 * @author raphael
 */
public class DisciplinaTableModel extends TableModel<Disciplina> {


    public DisciplinaTableModel(List<Disciplina> lista) {
        super(lista);
        titulos = new String[]{"Id","Nome","Carga Horária"};
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object ret = null;
        Disciplina disciplina = lista.get(rowIndex);
        
        switch(columnIndex){
            case 0:
                ret = disciplina.getId();
                break;
            case 1:
                ret = disciplina.getNome();
                break;
            case 2:
                ret = disciplina.getCargaHoraria();
                break;
        }
        
        return ret;
    }
}
