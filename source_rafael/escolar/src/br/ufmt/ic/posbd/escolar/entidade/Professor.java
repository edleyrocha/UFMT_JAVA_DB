/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufmt.ic.posbd.escolar.entidade;

import br.ufmt.ic.posbd.escolar.anotacao.ChavePrimaria;

/**
 *
 * @author raphael
 */
public class Professor implements ICRUD {
    
    @ChavePrimaria
    private int id;
    private String nome;
    private String cpf;
    private String rg;
    private String graduacao;
    private String mestrado;
    private String doutorado;
    private String email;
    private String telefone;

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

    public String getGraduacao() {
        return graduacao;
    }

    public void setGraduacao(String graduacao) {
        this.graduacao = graduacao;
    }

    public String getMestrado() {
        return mestrado;
    }

    public void setMestrado(String mestrado) {
        this.mestrado = mestrado;
    }

    public String getDoutorado() {
        return doutorado;
    }

    public void setDoutorado(String doutorado) {
        this.doutorado = doutorado;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
}
