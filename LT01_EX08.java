import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */
public class LT01_EX08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
    // api = aplicação
    // napi = novo valor da aplicação 
        double api, napi, juros;

    api = Double.parseDouble(JOptionPane.showInputDialog("Insira o api")); 
    juros = api * 0.13;
    napi = api + juros;
    
   System.out.print(napi);
   
   
            
    
            
    }
}
