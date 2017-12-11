
package practica;
import javax.swing.JOptionPane;

public class Practica {

    public static void main(String[] args) 
    {
        //
        JOptionPane.showMessageDialog(null, "Bienvenido al programa");
        System.out.println("Bienvenido al programa");
        
        //
        int valor = Integer.parseInt
        (JOptionPane.showInputDialog(null, "introduce un valor"));
        
        //
        
        String tuColor = JOptionPane.showInputDialog("¿cual es tu color favorito?");
        JOptionPane.showMessageDialog(null,"Tu color favorito es: " + tuColor, "color",JOptionPane.PLAIN_MESSAGE);
         
        //
        
        Object[] botones= {"res","pollo","tripa"};
        int tacos= JOptionPane.showOptionDialog(null, "¿De que fueron los tacos?",
                "Warning", JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, botones,botones[0]);
                JOptionPane.showMessageDialog(null, " los tacos fueron de "+botones[tacos],
                        "tacos", JOptionPane.WARNING_MESSAGE);
                //
                
                
                
                }


    }
    
}
