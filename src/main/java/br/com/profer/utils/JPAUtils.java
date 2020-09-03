package br.com.profer.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtils {
    //private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");
    /**
     * Retorna um Entity Manager de Conexao com o banco de dados
     *
     * @return
     */
    //public EntityManager getEntityManager() {
    //  return emf.createEntityManager();}
    private static final EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("postgres");

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
}
