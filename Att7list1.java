/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.att6list1;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Att7list1 {

    public static void main(String[] args) {
        boolean a1, b1;
        int a, b;
        Scanner dado;
        dado = new Scanner(System.in);
        
        System.out.print("Atribua un valor para A: ");
        a = dado.nextInt();
        System.out.print("Atribua um valor para B: ");
        b = dado.nextInt();
        
        a1 = (a>0);
        System.out.println("A é maior que 0?"+a1);
        b1 = (b>0);
        System.out.print("B é maior que 0?"+b1);
        
    }
}
