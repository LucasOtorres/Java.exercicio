import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */
public class LT01_EX11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
    double r,c;
    r = Double.parseDouble(JOptionPane.showInputDialog("Insira o raio"));
    
    c = 2 * 3.14 * r;
    
    System.out.print(c);
    
    }
}
