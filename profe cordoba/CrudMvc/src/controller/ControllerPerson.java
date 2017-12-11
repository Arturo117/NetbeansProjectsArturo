/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import model.PersonDAO;


/**
 *
 * @author reneg
 */
public class ControllerPerson {
    PersonDAO model = new PersonDAO();
    
    public void fillTable(JTable table){
        DefaultTableModel modelTable = new DefaultTableModel();//Se declara un modelo para controlar una tabla(no se ve por que es grfico)
        
        table.setModel(modelTable);
        
        modelTable.addColumn("dni");
        modelTable.addColumn("lastName");
        modelTable.addColumn("name");
        modelTable.addColumn("birthDay");
        modelTable.addColumn("place");
        
        Object [] column = new Object[5];
        int numRows = model.listPerson().size();
        
        for (int i = 0; i < numRows; i++) {
            column [0]= model.listPerson().get(i).getDni();//Se agregan al dni
            column [1]= model.listPerson().get(i).getLastName();
            column [2]= model.listPerson().get(i).getName();
            column [3]= model.listPerson().get(i).getBirthDay();
            column [4]= model.listPerson().get(i).getPlace();
            modelTable.addRow(column);
       
            //Termina controller
        }
        
    }
    
    public void insertPerson(String lastName, String name, String birthDay, String pace){
        String messageResult = model.insertPerson(pace, lastName, name, birthDay, pace);
        
        if (messageResult !=null){
            JOptionPane.showMessageDialog(null, messageResult);
            JOptionPane.showMessageDialog(null, "Registro Erroneo");
            
        }
    }
    
}
