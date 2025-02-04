import javax.swing.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HOME
 */
public class LT01_EX33_DECISAO {
public static void main(String[] args) {
double n,soma = 0;
n = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor"));
// tudo que tiver dentro da chave vai repetir com o for 
for (n = n; n > 0 ; n--)
{    
soma = 1/n + soma;
System.out.println("O resultado e "+soma);    
}
}
}