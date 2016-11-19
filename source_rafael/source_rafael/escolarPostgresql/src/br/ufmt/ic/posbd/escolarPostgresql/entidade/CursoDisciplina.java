/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufmt.ic.posbd.escolarPostgresql.entidade;

import br.ufmt.ic.posbd.escolarMysql.entidade.ICRUD;
import javax.persistence.Entity;
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
@Table(name = "cursodisciplina")
@SequenceGenerator(allocationSize = 1, sequenceName = "cursodisciplina_id_seq",name = "seqCursoDisciplina")
public class CursoDisciplina implements ICRUD {
    
    @Id
    @GeneratedValue(generator = "seqCursoDisciplina", strategy = GenerationType.SEQUENCE)
    private int id;
    @ManyToOne
    @JoinColumn(name="curso")
    private Curso curso;
    @ManyToOne
    @JoinColumn(name="disciplina")
    private Disciplina disciplina;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    
    
}
