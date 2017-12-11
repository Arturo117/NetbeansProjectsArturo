/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestordeagenda;

/**
 *
 * @author iHunter
 */
public class GestorDeAgenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ItemAgenda ia1 = new ItemAgenda("ARTURO AMARO", "2381864435", 75790);
        ItemAgenda ia2 = new ItemAgenda("Mi compa Nahaman", "2381694569", 75740);
        ItemAgenda ia3 = new ItemAgenda("Valentin Zamora Rojas Mtz", "2385933744", 75742);
        
        //Crear una agenda
        Agenda a1 = new Agenda();
        a1.insertar(ia1);
        a1.insertar(ia2);
        a1.insertar(ia3);
        
        //Escribir el archivo
        a1.GuardarArgenda("myAgenda.dat");
        
        //Leer el archivo
        Agenda resAgenda = Agenda.leerAgenda("myAgenda.dat");
        
        System.out.println(resAgenda);
}
}
