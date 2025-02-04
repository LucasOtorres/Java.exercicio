/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lt01_EX19_DECISAO;

import javax.swing.JOptionPane;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class LT01_EX19_DECISAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    int a,b,resultado;
     a = Integer.parseInt(JOptionPane.showInputDialog("Insira valor de A"));
     b = Integer.parseInt(JOptionPane.showInputDialog("Insira valor de B"));
     if (a > b)
     {  
       JOptionPane.showMessageDialog(null,"O maior é A = " + a );   
     }    
     else
       JOptionPane.showMessageDialog(null,"O maior é B = " + b); 
    }
    }