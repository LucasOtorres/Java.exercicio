import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */
public class LT01_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
    int anoA , anoN, idade;
    anoA = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano atual")); 
    anoN = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano de nascimento")); 
    idade = anoA - anoN;
    // anoA = ano atual
    // anoN = ano de nascimento
    
    System.out.print(idade);
    }
}
