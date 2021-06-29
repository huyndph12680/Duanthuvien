/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sof2041.conect;
import java.sql.*;
/**
 *
 * @author Admin
 */
public class DBconnect {
    public static Connection getconnect(String databaseName){
        String url = "jdbc:sqlserver://127.0.0.1:1433;databaseName="+databaseName;
        String use = "sa";
        String pass = "";            
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           Connection con = DriverManager.getConnection(url, use, pass);
           Statement stm = con.createStatement();
            return con;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
       
    
    }
}
