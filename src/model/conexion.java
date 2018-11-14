package model;

import java .sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class conexion {
    private String user ="valle";
    private String password =  "K9B091hNIfLPzJxb";
    private String hostname = "localhost";
    private String port = "8889";
    private String database = "finperi";
    private String classname = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://"+hostname+":"+port+"/"+database;
    private  Connection con;


    public conexion() {
        try {
            Class.forName(classname);
            con = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e){
            System.out.println(e.getMessage());

        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
    public  Connection getConection() { return con; }
}
