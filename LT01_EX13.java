import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */
public class LT01_EX13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
    double alimentos, duracao;
    
    alimentos = Double.parseDouble(JOptionPane.showInputDialog("Insira a qantidade de alimentos em kg"));
    
    duracao = alimentos / 0.05;
    
    System.out.print(duracao);
    }
}
