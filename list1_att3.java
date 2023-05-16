/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject22;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class list1_att3 {

    public static void main(String[] args) {
       int a, b, c;
    Scanner dado;
    dado = new Scanner(System.in);
    
    System.out.print("Digite o valor de A: ");
    a = dado.nextInt();
    System.out.print("Digite o valor de B: ");
    b = dado.nextInt();
    
    if (a==b){
        c = a+b;
    }
    
    else {
    c = a*b;
}
    
    System.out.print(c);
    }
}
