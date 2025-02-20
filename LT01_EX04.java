import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */
public class LT01_EX04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
    double c,f;
    
    c = Double.parseDouble(JOptionPane.showInputDialog("Insira o celcius"));
            
    f = (9*c+160) /5;
    System.out.print(f);
    
    }
}
