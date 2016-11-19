/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufmt.ic.posbd.escolarPostgresql.entidade;

import br.ufmt.ic.posbd.escolarMysql.entidade.ICRUD;
import br.ufmt.ic.posbd.escolarMysql.entidade.Turma;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author raphael
 */
@Entity
@Table(name = "frequencia")
@SequenceGenerator(allocationSize = 1, sequenceName = "frequencia_id_seq",name = "seqFrequencia")
public class Frequencia implements ICRUD {
    
    @Id
    @GeneratedValue(generator = "seqFrequencia", strategy = GenerationType.SEQUENCE)
    private int id;
    @ManyToOne
    @JoinColumn(name="aluno")
    private Aluno aluno;
    @ManyToOne
    @JoinColumn(name="turma")
    private Turma turma;
    @Temporal(TemporalType.DATE)
    private Date data;
    private boolean presenca;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public boolean isPresenca() {
        return presenca;
    }

    public void setPresenca(boolean presenca) {
        this.presenca = presenca;
    }
    
    
}
