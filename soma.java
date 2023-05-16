/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject10;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class soma {

    public static void main(String[] args) {
       float a, b, c, s;
       Scanner dado;
       dado = new Scanner(System.in);

    System.out.print("Digite o valor de A:");
    a = dado.nextFloat();
    System.out.print("Digite o valor de B:");
    b = dado.nextFloat();
    System.out.print("Digite o valor de C:");
    c = dado.nextFloat();

    s = a+b;

    if (s>c){
        System.out.print("A soma entre A e B é maior que C.");
    }
    else {
        System.out.print("A soma ente A e B é menor que C.");
    }
    }
}
