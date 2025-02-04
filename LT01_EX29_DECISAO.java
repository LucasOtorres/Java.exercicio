/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lt01_ex24_decisao;
import javax.swing.*;
/**
 *
 * @author HOME
 */
public class LT01_EX29_DECISAO {
public static void main(String []args){    
       Double p1,p2,rp1,rp2,r,cp1,cp2;
       
      r = Double.parseDouble(JOptionPane.showInputDialog("Insira qual tipo de investimento deseja, sendo 0- Poupanca e 1- Renda fixa")) ;
      
      if (r < 1)
      {
          p1 =  Double.parseDouble(JOptionPane.showInputDialog("Insira o valor a ser depositado na poupanca: "));
      cp1 = p1 * 0.03;
      rp1 = p1 + cp1;
      System.out.print("O valor da poupanca apos 30 dias sera de: "+ rp1);
      }
      else 
      {    
      p2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor a ser depositado na renda fisica: "));   
      cp2 = p2 * 0.05;
      rp2 = p2 + cp2;
      System.out.print("O valor da renda fixa apos 30 dias sera de: "+ rp2);
      }
      }
      }
      