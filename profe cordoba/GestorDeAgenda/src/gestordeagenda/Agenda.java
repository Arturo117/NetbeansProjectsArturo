/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestordeagenda;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author iHunter
 */
public class Agenda implements Serializable {
    public static final int MAX=100;
    private ItemAgenda[]elArray;
    private int num;
    
    public Agenda(){
        elArray = new ItemAgenda[MAX];
        num=0;
    }
    
    public void insertar(ItemAgenda ia){
        elArray[num]=ia;// guarda los items en el array
        num++;//se suma 
    }
    
    public String toString(){
        String res= "";
        for (int i = 0; i < num; i++) {
            res += elArray[i] + "\n";//guarda el ia y lo guarda en el array
            res += "+-+-+-+--++--+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+-+-+-+ " + "\n";
        }
        return res;
        
    }
    public void GuardarArgenda(String fich){
        try {
            ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream(new File(fich)));//el new FILE(fich) apunta al archivo que deceamos
            oos.writeObject(this);
            oos.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "FILENOTFOUND" + ex.getMessage());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "IOEXCEPTION" + ex.getLocalizedMessage());
        }
       
    }
     public static Agenda leerAgenda (String fich){//se pone de tipo agenda para que lea la agenda y retorne la misma AGENDA no el archivo(marca error al inicio ya que aun no existe agenda)
            Agenda aux = null;
        try {
            ObjectInputStream ois= new ObjectInputStream(new FileInputStream(fich));
            aux =(Agenda) ois.readObject();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"FILENOTFOUND" + ex.getMessage());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "IPEXCEPTION" + ex.getLocalizedMessage());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"CLASSNOTFOUND" + ex.getMessage());
        }
        return aux;
     
     }
     /*
     Escribir dos metodos de busqueda uno por nombre y otro por telefono.
     Ambas operaciones devolveran el primer ItemAgenda que cumpla con la condicion en caso de que exista
     o null en el caso de no ser asi
     */
        
            
     
}
