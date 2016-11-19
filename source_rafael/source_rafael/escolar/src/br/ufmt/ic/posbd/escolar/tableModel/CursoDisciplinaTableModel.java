/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufmt.ic.posbd.escolar.tableModel;


import br.ufmt.ic.posbd.escolarPostgresql.entidade.CursoDisciplina;
import br.ufmt.ic.posbd.escolarPostgresql.entidade.Disciplina;
import java.util.List;

/**
 *
 * @author raphael
 */
public class CursoDisciplinaTableModel extends TableModel<CursoDisciplina> {


    public CursoDisciplinaTableModel(List<CursoDisciplina> lista) {
        super(lista);
        titulos = new String[]{"Id","Curso","Disciplina"};
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object ret = null;
        CursoDisciplina cursoDisciplina = lista.get(rowIndex);
        
        switch(columnIndex){
            case 0:
                ret = cursoDisciplina.getId();
                break;
            case 1:
                ret = cursoDisciplina.getCurso().getNome();
                break;
            case 2:
                ret = cursoDisciplina.getDisciplina().getNome();
                break;
        }
        
        return ret;
    }
}
