import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */
public class LT01_EX07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
    double comprimento, largura, altura,area;
    comprimento = Double.parseDouble(JOptionPane.showInputDialog("Insira o y")); 
    largura = Double.parseDouble(JOptionPane.showInputDialog("Insira o y")); 
    altura = Double.parseDouble(JOptionPane.showInputDialog("Insira o y")); 
    
    area = comprimento * largura * altura;
    
    System.out.print(area);
    }
}
