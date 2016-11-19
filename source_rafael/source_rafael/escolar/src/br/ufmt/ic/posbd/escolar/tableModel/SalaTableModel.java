/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufmt.ic.posbd.escolar.tableModel;

import br.ufmt.ic.posbd.escolarMysql.entidade.Sala;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author raphael
 */
public class SalaTableModel extends AbstractTableModel {

    private List<Sala> lista;
    private final String[] titulos = new String[]{"Id"
            ,"Nome","Bloco"};
    
    public SalaTableModel(List<Sala> lista) {
        this.lista = lista;
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public String getColumnName(int column) {
        return titulos[column];
    }
    
    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object ret = null;
        Sala sala = lista.get(rowIndex);
        
        switch(columnIndex){
            case 0:
                ret = sala.getId();
                break;
            case 1:
                ret = sala.getNome();
                break;
            case 2:
                ret = sala.getBloco();
                break;
        }
        
        return ret;
    }
    
    public void atualizar(List<Sala> lista){
        this.lista = lista;
        fireTableDataChanged();
    }
    
    public Sala get(int index){
        return lista.get(index);
    }
    
}
