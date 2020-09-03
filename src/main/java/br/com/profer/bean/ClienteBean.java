package br.com.profer.bean;

import br.com.profer.entidades.Cliente;
import br.com.profer.utils.JPAUtils;

import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import java.util.Date;
import java.util.Objects;

@ManagedBean(name = "clienteBean")

public class ClienteBean {
    private int id_Cliente;
    private String nome;
    private String email;
    private int telefone;
//    private int telefone2;
//    private int telefone3;
    private Date dtNasc;
    private String comoConhec;


    public ClienteBean() {
    }
    private Cliente cliente = new Cliente();

    public int getId_Cliente() {
        return id_Cliente;
    }

    public void setId_Cliente(int id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

//    public int getTelefone2() {
//        return telefone2;
//    }
//
//    public void setTelefone2(int telefone2) {
//        this.telefone2 = telefone2;
//    }
//
//    public int getTelefone3() {return telefone3;}
//
//    public void setTelefone3(int telefone3) {this.telefone3 = telefone3;}

    public Date getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(Date dtNasc) {
        this.dtNasc = dtNasc;
    }

    public String getComoConhec() {
        return comoConhec;
    }

    public void setComoConhec(String comoConhec) {
        this.comoConhec = comoConhec;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClienteBean that = (ClienteBean) o;
        return id_Cliente == that.id_Cliente;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_Cliente);
    }

    public void salvar(){
        System.out.println("teste");
    }
}
