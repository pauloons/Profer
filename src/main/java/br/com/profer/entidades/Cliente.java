package br.com.profer.entidades;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
public class Cliente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int id_Cliente;
    @Column
    private String nome;
    @Column
    private String email;
    @Column
    private int telefone;
//    @Column
//    private int telefone2;

//    @Column(name = "telefone3")
//    private int telefone3;

    @Column
    private Date dtNasc;


    @Column
    private String comoConhec;

    public Cliente() {
    }

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
//    public int getTelefone3() {
//        return telefone3;
//    }
//
//    public void setTelefone3(int telefone3) {
//        this.telefone3 = telefone3;
//    }

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
        Cliente cliente = (Cliente) o;
        return id_Cliente == cliente.id_Cliente;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_Cliente);
    }
}
