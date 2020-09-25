package br.com.profer.utils;

import java.sql.DriverManager;
import java.sql.Connection;

public class TesteConexaoBD {
    private String url;
    private String usuario;
    private String senha;
    private Connection con;

    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5433/Profer1";

        String usuario = "postgres";
        String senha = "postgres";

        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão efetuada com sucesso");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

