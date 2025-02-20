import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */
public class LT01_EX14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
    double a1, a2, r;
    
    a1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro angulo")); 
    a2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo angulo")); 
    
    r = (a1 + a2) - 180  ;
    // a1 = primeiro angulo
    //a2 = segundo angulo 
    // r = terceiro angulo
    System.out.print(r);
    }
}
