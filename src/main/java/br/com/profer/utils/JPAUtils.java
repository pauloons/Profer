package br.com.profer.utils;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtils {

    /**
     * Retorna um Entity Manager de Conexao com o banco de dados
     *
     * @return
     */

    private static EntityManagerFactory factory;

    static {
        if (factory == null) {
            factory = Persistence.createEntityManagerFactory("postgres");
        }
    }

    public static EntityManager getEntityManager() {
        return factory.createEntityManager();
    }
}