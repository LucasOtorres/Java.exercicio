import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */
public class LT01_EX09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
    int x,y,soma;
    x = Integer.parseInt(JOptionPane.showInputDialog("Insira o x"));     
    y = Integer.parseInt(JOptionPane.showInputDialog("Insira o y"));     
    
    soma = x * x + y * y;
    
    System.out.print(soma);
    }
}
