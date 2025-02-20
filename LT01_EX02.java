import javax.swing.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */
public class LT01_EX02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    // TODO code application logic here
    double salario,ajuste,novo;
    
    salario = Double.parseDouble(JOptionPane.showInputDialog("Insira salario"));
    ajuste = salario * 0.15;
    
    novo = salario + ajuste;
            
            System.out.print(novo);
    
    }
}
