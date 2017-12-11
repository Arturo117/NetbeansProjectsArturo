/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import java.util.Scanner;
import javax.swing.JFileChooser;

/**
 *
 * @author iHunter
 */
public class PersonFile {

    private String filename;
    private PrintWriter output;
    static private File file;

    public void createFile(String name) throws FileNotFoundException {
        this.filename = name;
        this.file = new File(this.filename);
        if (!this.file.exists()) {
            this.output = new PrintWriter(new FileOutputStream(this.file, true));
        } else {
            JOptionPane.showMessageDialog(null, "The file already exists");
        }
    }
    //lee los archivos mandados desde el menu que se almacenan en las variables correspondientes
    public void WritePerson(String id, String name, String lastName, String birthDay, String place) throws FileNotFoundException {
        if (this.file.exists()) {//verifica si el archivo existe
            this.output = new PrintWriter(new FileOutputStream(this.file, true));//imprime y sobrescribe lo que tenga el archivo
            this.output.println(id + " " + name + " " + lastName + " " + birthDay + " " + place);
        } else {
            JOptionPane.showMessageDialog(null, "The file already exists");
        }
        this.output.close();//se cierra flujo
    }

    public void ReadPersonFile() {
        JFileChooser fileChooser = new JFileChooser(); // Se crea un objeto de tipo JFlieChooser
        if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            // Get the selected file
            File file = fileChooser.getSelectedFile(); // Obtenemos todo lo relcionado al archivo, no el archivo en si
            try {
                //Create a Scanner for the file
                Scanner input = new Scanner(file);

                //Read text from the file(leer el texto del archivo)
                int contador = 0;
                while (input.hasNext()/*hasNext detecta si el archivo tiene renglones*/) {
                    System.out.println(input.next());
                    contador++;
                }
                JOptionPane.showMessageDialog(null, contador);
                input.close();
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null/*se refiere a la posiscion en la que aparece el error*/, ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "No file Selected");
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        int num;
        PersonFile person = new PersonFile();
        String nameFiel = " ", name = " ", id = " ", lastname = " ", birthDay = " ", place = " ";
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog("Seleccione Un Numero: \n 1.Crear archivo \n 2.Escriba Datos \n 3.Leer archivo \n 4.Salir de consola"));//se especifica que mostrara el menu de inicio
            switch (num) {
                case 1:
                    nameFiel = JOptionPane.showInputDialog(nameFiel);
                    person.createFile(nameFiel);
                    break;
                case 2://Ingresa los datos de cada campo 
                    id = JOptionPane.showInputDialog("ingresa el id", id);
                    name = JOptionPane.showInputDialog("Ingresa el Nombre", name);
                    lastname = JOptionPane.showInputDialog("Ingresa el Apellido", lastname);
                    birthDay = JOptionPane.showInputDialog("ingresa el Cumpleaños", birthDay);
                    place = JOptionPane.showInputDialog("Ingresa el Lugar", place);
                    person.WritePerson(id, name, lastname, birthDay, place);
                    break;
                case 3://lee el archivo y cuenta el numero de palabras que contiene el archivo
                    JOptionPane.showMessageDialog(null, "Eliga el archivo a leer");
                    person.ReadPersonFile();
                    break;
                case 4://se cierra el programa
                    JOptionPane.showMessageDialog(null, "Cerrando...Confirm");
                    break;
            }
        } while (num != 4);
    }

}
