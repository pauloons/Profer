package br.com.profer.dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.profer.utils.JPAUtils;

public class DaoGeneric <E>{

    public void salvar(E entidade){
        EntityManager entityManager = JPAUtils.getEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.persist(entidade);
        entityTransaction.commit();
        entityManager.close();
    }
}

