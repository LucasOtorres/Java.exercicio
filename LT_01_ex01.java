import javax.swing.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */
public class LT_01_ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
    double lado1,lado2,area;
         lado1 = Double.parseDouble(JOptionPane.showInputDialog("Insira lado"));
         lado2 = Double.parseDouble(JOptionPane.showInputDialog("Insira lado"));
         area = lado1 * lado2;
         
         System.out.print(area);
    }
}
