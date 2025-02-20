import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */
public class LT01_EX06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
    double x,y,troca;
    x = Double.parseDouble(JOptionPane.showInputDialog("Insira o x"));
    y = Double.parseDouble(JOptionPane.showInputDialog("Insira o y")); 
    troca = 1;
    x = troca;
    y = x;
    troca = y;
    
    System.out.print(x);
    System.out.print(y);
           
    
        
    
   
            
    
    }
}
