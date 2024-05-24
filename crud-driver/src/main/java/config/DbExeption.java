package config;

import java.sql.SQLException;

public class DbExeption extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public DbExeption(String mensagem){
        super(mensagem);
    }
}
