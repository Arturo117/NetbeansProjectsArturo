/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
    private Object JOptionpane;
     public Connection getConnection(){
        Connection conexion=null;
        
        try{
        
            Class.forName("com.MySQL.JDBC.Driveer").newInstance();
            String serverDb ="jdbc:mysql://localhost:81/mybd";
            String userDb = "";
            String passwordDb = "";
            conexion = DriverManager.getConnection(userDb,userDb, passwordDb);
                    
        } catch (ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "The Driver was not found");
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "There was a problem" + e.getMessage());
        }finally{
            return conexion;
        }
     }
    
}
