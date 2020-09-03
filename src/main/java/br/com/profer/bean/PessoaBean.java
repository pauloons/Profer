package br.com.profer.bean;

import javax.faces.bean.ManagedBean;
import java.util.Date;

@ManagedBean(name = "pessoaBean")

public class PessoaBean {

    public int id;
    public String nome;
    public String cpf;
    public int telefone;
    //public int telefone2;
    public String nacionalidade;
    public int idade;
    public String sexo;
    public Date dtNasc;

    public int getId() {
        return id;
    }

//    public int getTelefone2() {
//        return telefone2;
//    }
//
//    public void setTelefone2(int telefone2) {
//        this.telefone2 = telefone2;
//    }

    public Date getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(Date dtNasc) {
        this.dtNasc = dtNasc;
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

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}