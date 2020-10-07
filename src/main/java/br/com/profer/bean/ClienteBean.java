package br.com.profer.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import br.com.profer.dao.DaoGeneric;
import br.com.profer.entidades.Cliente;

//utilizar CDI apos o conhecimento pleno da anotação
@ViewScoped
@ManagedBean(name = "clienteBean")

public class ClienteBean {

    private Cliente cliente = new Cliente();
    private DaoGeneric<Cliente> daoGeneric = new DaoGeneric<Cliente>();

    public String salvar() {
        daoGeneric.salvar(cliente);
        return "";
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public DaoGeneric<Cliente> getDaoGeneric() {
        return daoGeneric;
    }

    public void setDaoGeneric(DaoGeneric<Cliente> daoGeneric) {
        this.daoGeneric = daoGeneric;
    }
}