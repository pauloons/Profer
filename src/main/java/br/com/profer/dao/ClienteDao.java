package br.com.profer.dao;

import javax.persistence.EntityManager;

import br.com.profer.utils.JPAUtils;

public class ClienteDao {

    public void criar(){

        EntityManager em = new JPAUtils().getEntityManager();
        em.getTransaction().begin();

        em.getTransaction().commit();
        em.close();
    }
}
