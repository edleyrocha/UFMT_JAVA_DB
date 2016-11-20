/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufmt.ic.posbd.escolar.entidade;

/**
 *
 * @author raphael
 */
public enum Situacao  implements ICRUD{
    APROVADO, REPROVADO, CURSANDO;

    @Override
    public int getId() {
        return this.ordinal();
    }

    @Override
    public void setId(int id) {
        
    }
}
