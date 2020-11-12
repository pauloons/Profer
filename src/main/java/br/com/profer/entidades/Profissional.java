package br.com.profer.entidades;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.*;

@Entity
@Table(name="Profissional")
public class Profissional implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "tempo_exp",nullable = false)
    private LocalDate tempoExp;

    @Column(name = "profissao", nullable = false)
    private String profissao;

    public LocalDate getTempoExp() {
        return tempoExp;
    }

    public void setTempoExp(LocalDate tempoExp) {
        this.tempoExp = tempoExp;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}

