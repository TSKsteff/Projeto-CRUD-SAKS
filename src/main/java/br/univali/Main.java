package br.univali;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class Main {
        public static void main(String[] args){

            Connection connection = null;
            Statement statement = null;
            ResultSet resultSet = null;

            String createUsuarioTable = "CREATE TABLE IF NOT EXISTS usuario (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY, " +
                    "nome VARCHAR(255) NOT NULL, " +
                    "email VARCHAR(255) NOT NULL UNIQUE, " +
                    "password VARCHAR(255) NOT NULL, " +
                    "departamento VARCHAR(255), " +
                    "status BOOLEAN NOT NULL" +
                    ")";

            String createAdminTable = "CREATE TABLE IF NOT EXISTS admin (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY, " +
                    "nome VARCHAR(255) NOT NULL, " +
                    "email VARCHAR(255) NOT NULL UNIQUE, " +
                    "password VARCHAR(255) NOT NULL, " +
                    "departamento VARCHAR(255), " +
                    "status BOOLEAN NOT NULL" +
                    ")";


            try {

                connection = DB.getConnection();
                statement = connection.createStatement();


                resultSet = statement.executeQuery(createUsuarioTable);
                resultSet = statement.executeQuery(createAdminTable);


            }catch (SQLException e){
                e.printStackTrace();
            }finally {
                DB.closeStatement(statement);
                DB.closeResultset(resultSet);
                DB.closeConnection();
            }
        }
}