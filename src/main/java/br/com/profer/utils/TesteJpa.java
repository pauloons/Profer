package br.com.profer.utils;


import javax.persistence.Persistence;

public class TesteJpa {
    public static void main(String[] args){

        Persistence.createEntityManagerFactory("postgres");
    }

}
