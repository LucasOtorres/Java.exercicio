import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */
public class LT01_EX03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        double base,altura,area;
        
        base = Double.parseDouble(JOptionPane.showInputDialog("Insira base"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Insira altura"));
        area = base * altura / 2;

System.out.print(area);
    }
}
