package br.com.profer.bean;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean(name = "profissionalBean")
public class ProfissionalBean{
    private int tempoExp;
    private String profissao;

    public ProfissionalBean() {
    }

    public ProfissionalBean(int tempoExp, String profissao) {
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
