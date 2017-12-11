/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author reneg
 */
public class PersonDAO {
    Conexion conexion;
    
    public PersonDAO(){
        conexion = new Conexion();
    }
    public ArrayList<Person> listPerson(){
    ArrayList listPerson = new ArrayList();
    Person person;
    try{
        Connection DbAccess = conexion.getConnection();
        PreparedStatement ps = DbAccess.prepareStatement("SELECT * FROM person");
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    person = new Person();
                    person.setDni(rs.getString(1));//Declaro Dni de la persona
                    person.setLastName(rs.getString(2));//Declaro su Apellido
                    person.setName(rs.getString(3));//Declaro su Nombre
                    person.setBirthDay(rs.getString(4));//Declaro BirthDay
                    person.setPlace(rs.getString(5));//Declaro Place
                    listPerson.add(person);//Añado al array a la persona
                }
                
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
            }
    return listPerson;
}//end listPerson
    public String insertPerson (String lastName, String name, String birthDay, String place){
        String queryResult = null;
        try{
            Connection DbAccess = conexion.getConnection();
            PreparedStatement ps = DbAccess.prepareStatement("INSERT INTO person (lastName, name, birthDay, place) VALUES(?,?,?,?)");
            ps.setString(1, lastName);
            ps.setString(2, name);
            ps.setString(3, birthDay);
            ps.setString(4, place);
            
            int numAffectedRows = ps.executeUpdate();
            
            if (numAffectedRows > 0){
                queryResult = "Registro Exitoso";
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
        }
        return queryResult;
    }
}
