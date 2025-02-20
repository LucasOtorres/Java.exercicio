import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */
public class LT01_EX10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    double x,y,r;
    x = Double.parseDouble(JOptionPane.showInputDialog("Insira o x")); 
    y = Double.parseDouble(JOptionPane.showInputDialog("Insira o y")); 
    r = x - y;
// r = resultado
    System.out.print(r);
    
    }
}
