package br.com.profer.entidades;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="Profissional")
public class Profissional implements Serializable {
    private static final long serialVersionUID = 1L;

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

