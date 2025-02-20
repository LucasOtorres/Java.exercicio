import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */
public class LT01_EX15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
    int ct1, ct2, h,h1;
    ct1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o cateto 1")); 
    ct2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o cateto 2")); 
     
    h = ct1 * ct1 + ct2 * ct2;
    h1 = h * 2;
    System.out.print(h1);
    
        
}
}