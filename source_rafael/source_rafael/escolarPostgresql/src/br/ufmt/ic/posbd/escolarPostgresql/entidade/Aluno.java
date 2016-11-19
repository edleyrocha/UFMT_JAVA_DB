/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufmt.ic.posbd.escolarPostgresql.entidade;

import br.ufmt.ic.posbd.escolarMysql.entidade.ICRUD;
import br.ufmt.ic.posbd.escolarMysql.entidade.Responsavel;
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
@Table(name = "aluno")
@SequenceGenerator(allocationSize = 1, sequenceName = "aluno_id_seq",name = "seqAluno")
public class Aluno implements ICRUD {
    
    @Id
    @GeneratedValue(generator = "seqAluno", strategy = GenerationType.SEQUENCE)
    private int id;
    private String nome;
    private String endereco;
    @ManyToOne
    @JoinColumn(name="responsavel")
    private Responsavel responsavel;
    @ManyToOne
    @JoinColumn(name="curso")
    private Curso curso;
    private String cpf;
    private String rg;
    @Temporal(TemporalType.DATE)
    private Date dataNascimento;
    private String profissao;

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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Responsavel getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    
    
    
    
}
