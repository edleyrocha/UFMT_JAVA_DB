/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufmt.ic.posbd.escolarPostgresql.entidade;

import br.ufmt.ic.posbd.escolarMysql.entidade.ICRUD;
import br.ufmt.ic.posbd.escolarMysql.entidade.Turma;
import br.ufmt.ic.posbd.escolarMysql.entidade.Situacao;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author raphael
 */
@Entity
@Table(name = "historico")
@SequenceGenerator(allocationSize = 1, sequenceName = "historico_id_seq",name = "seqHistorico")
public class Historico implements ICRUD {
    
    @Id
    @GeneratedValue(generator = "seqHistorico", strategy = GenerationType.SEQUENCE)
    private int id;
    private float nota;
    private int falta;
    @Enumerated(EnumType.ORDINAL)
    private Situacao situacao;
    @ManyToOne
    @JoinColumn(name="aluno")
    private Aluno aluno;
    @ManyToOne
    @JoinColumn(name="turma")
    private Turma turma;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public int getFalta() {
        return falta;
    }

    public void setFalta(int falta) {
        this.falta = falta;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
    
    
    
}
