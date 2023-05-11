/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.primeiroprograma;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class PrimeiroPrograma {

    public static void main(String[] args) {
        
      float nota1, nota2, nota3, media;
      
      Scanner dado;
      dado = new Scanner(System.in);
      
      
      System.out.print("Digite a primeira nota: ");
      nota1 = dado.nextFloat();
      
      System.out.print("Digite a segunda nota: ");
      nota2 = dado.nextFloat();
      
      System.out.print("Digite a terceira nota nota: ");
      nota3 = dado.nextFloat();
      
      
      media = (nota1 + nota2 + nota3)/3;
      
      System.out.print("Sua média é: "+media);
             
        if (media >= 6){
            System.out.print("Aprovado");
                    }
        else {
            System.out.print("Reprovado");
             }
    }
}
