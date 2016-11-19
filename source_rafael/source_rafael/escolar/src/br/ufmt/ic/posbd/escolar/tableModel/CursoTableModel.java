/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufmt.ic.posbd.escolar.tableModel;


import br.ufmt.ic.posbd.escolarPostgresql.entidade.Curso;
import java.util.List;

/**
 *
 * @author raphael
 */
public class CursoTableModel extends TableModel<Curso> {


    public CursoTableModel(List<Curso> lista) {
        super(lista);
        titulos = new String[]{"Id","Nome","Modalidade","Carga Horária"};
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object ret = null;
        Curso curso = lista.get(rowIndex);
        
        switch(columnIndex){
            case 0:
                ret = curso.getId();
                break;
            case 1:
                ret = curso.getNome();
                break;
            case 2:
                ret = curso.getModalidade().getNome();
                break;
            case 3:
                ret = curso.getCargaHoraria();
                break;
        }
        
        return ret;
    }
}
