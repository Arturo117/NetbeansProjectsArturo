/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author cipri
 */
public class Conexion {
    
    public Connection getConection(){
        Connection c = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String serverDb="jdbc:mysql://localhost:3306/mydb";
            String user = "root";
            String password = "";
            c =  DriverManager.getConnection(serverDb, user, password);
        } catch (ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "The Driver was not Found");
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "There was a problem" + e.getMessage());
        } catch (InstantiationException ex) { 
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return c;
    } 
}
