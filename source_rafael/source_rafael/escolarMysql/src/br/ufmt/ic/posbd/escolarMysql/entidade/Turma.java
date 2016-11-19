/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufmt.ic.posbd.escolarMysql.entidade;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author raphael
 */
@Entity
@Table(name = "turma")
public class Turma implements ICRUD {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    @Column(name = "datainicio")
    @Temporal(value=TemporalType.DATE)
    private Date dataInicio;
    @Column(name = "fim")
    @Temporal(value=TemporalType.DATE)
    private Date dataFim;
    @ManyToOne
    @JoinColumn(name="professor")
    private Professor professor;
    @Column(name = "qtdmaxaluno")
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
