/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex05.pkg22.pkg08_aula05;

import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class EX052208_AULA05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Escreva um programa em Java que recebe dois números e realize duas operações matemáticas com eles apenas se forem maiores que 10. 
        
        Scanner leitor = new Scanner(System.in);
        double n1,n2,resultado1,resultado2;
        
        System.out.print("Digite o primeiro número: ");
        n1 = leitor.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        n2 = leitor.nextDouble();
        
        if (n1 > 10 && n2 > 10) {
        resultado1 = n1 + n2;
        resultado2 = n1 - n2;
        
        System.out.print("\nO resultado da soma é :" + resultado1);
        System.out.print("\nO resultado da subtração é :" + resultado2);
        
        } else {
             System.out.println("\nNenhum resultado");
            
        }
        
        
        
        
        
        
        
        
    }
    
}
