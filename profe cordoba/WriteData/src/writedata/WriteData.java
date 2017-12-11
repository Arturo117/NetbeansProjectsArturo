/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package writedata;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 *
 * @author iHunter
 */
public class WriteData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        File file= new File("scores.txt");
        if (file.exists()){//verificamos si existe el archivo
            System.out.println("File alredy exists");
            //System.exit(0);
        }
        PrintWriter output= new PrintWriter(new FileOutputStream(file,true));//crea un archivo
        
        //Escribir salida formateada a el archivo
        
        output.print("John T Smith ");
        output.println(90);
        output.print("Erick K jones ");
        output.println(85);
        output.print("Arturo Amaro");
        output.println(19);
        
        output.close();//se cierra flujo para poder se usado en otras cosas
        
        Scanner input = new Scanner(file);//lee los archivos 
        
        while(input.hasNext()){
            String firstName= input.next();
            String mi= input.next();
            String lastName= input.next();
            int score= input.nextInt();
            
            System.out.println(firstName +""+ mi+""+ lastName+ "" + score + "");
        }
        input.close();
    }
    
}
