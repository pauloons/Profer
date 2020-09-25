package br.com.profer.utils;

import br.com.profer.entidades.Cliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        //Codigo a ser melhorado e estudado
        /*EntityManager em = JPAUtils.getEntityManager();
        EntityManager em = new JPAUtils().getEntityManager();
        em.getTransaction().begin();*/

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        tx.commit();
        em.close();
        emf.close();
    }
}