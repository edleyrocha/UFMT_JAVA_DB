/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufmt.ic.posbd.escolar.entidade;

import br.ufmt.ic.posbd.escolar.anotacao.ChavePrimaria;
import java.util.Date;

/**
 *
 * @author raphael
 */
public class Turma implements ICRUD {
    
    @ChavePrimaria
    private int id;
    private String nome;
    private Date dataInicio;
    private Date dataFim;
    private Professor professor;
    private int qtdMaxAluno;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public int getQtdMaxAluno() {
        return qtdMaxAluno;
    }

    public void setQtdMaxAluno(int qtdMaxAluno) {
        this.qtdMaxAluno = qtdMaxAluno;
    }
    
    
}
