/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lt01_ex21_decisao;

import javax.swing.JOptionPane;

/**
 *
 * @author HOME
 */
public class LT01_EX21_DECISAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
     double n1, n2, n3, n4, media;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a primeiro nota")); 
    n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a segunda nota")); 
    n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite a terceira")); 
    n4 = Integer.parseInt(JOptionPane.showInputDialog("Digite a quarta")); 
          
    media = (n1 + n2 + n3 + n4) / 4; 

        if (media >= 6) {
             JOptionPane.showMessageDialog(null, "APROVADO");
        }
             else if (media >= 3) {

                     JOptionPane.showMessageDialog(null, "EXAME");
            }
             else {
                 JOptionPane.showMessageDialog(null, "RETIDO");
        }


        }
    }

