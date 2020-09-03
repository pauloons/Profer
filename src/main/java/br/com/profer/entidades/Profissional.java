package br.com.profer.entidades;

import javax.persistence.*;

@Entity
public class Profissional {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int tempoExp;
    @Column
    private String profissao;

    public Profissional() {
    }

    public Profissional(int tempoExp, String profissao) {
        this.tempoExp = tempoExp;
        this.profissao = profissao;
    }

    public int getTempoExp() {
        return tempoExp;
    }

    public void setTempoExp(int tempoExp) {
        this.tempoExp = tempoExp;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}

