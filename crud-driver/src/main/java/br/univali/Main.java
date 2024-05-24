package br.univali;

import config.Config;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        Connection connection = Config.getConnection();
        if(connection != null) System.out.println("Connection true");
        Config.closeConnection();
    }
}