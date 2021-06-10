/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cristian.configuration;



import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author oncel
 */
public class Conexion {
    Connection con = null;
    String url = "jdbc:mysql://localhost:3306/bdcaritocompras";
    String usuario = "root";
    String password = "1991";
    public Connection conexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,usuario,password);
            System.out.println("conexion establecida");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return con;
    }
}
