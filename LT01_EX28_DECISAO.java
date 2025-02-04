/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lt01_ex24_decisao;
import javax.swing.JOptionPane;
/**
 *
 * @author HOME
 */
public class LT01_EX28_DECISAO {
public static void main(String []args){
Double VM, PT, VMF, PTF, p1, p2 ;

VM = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da venda mensal: "));
PT = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do preco mensal: "));
if (VM < 500 && PT < 30){
    p1 = VM * 0.10;
    p2 = PT * 0.10;
    VMF = VM + p1;
    PTF = PT + p2;
System.out.print("O valor do preco final e da venda final e: "+ VMF +" "+ PTF);
}
else if (VM >= 500 && PT >= 30 || VM <= 1000 && PT <= 80){ 
   
       p1 = VM * 0.15;
    p2 = PT * 0.15;
    VMF = VM + p1;                                              
    PTF = PT + p2;
System.out.print("O valor do preco final e da venda final e: "+ VMF +" "+ PTF);
}
else if (VM >= 1000 && PT >= 80){  
    p1 = VM * 0.5;
    p2 = PT * 0.5;
    VMF = VM - p1;
    PTF = PT - p2;
System.out.print("O valor do preco final e da venda final e: "+ VMF +" " + PTF);    
             }
    else{ 
System.out.print("O valor do preco final e da venda final e: "+ VM +" " + PT);         
}
}
}



