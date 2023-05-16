/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.att4list1;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Att4list1 {

    public static void main(String[] args) {
        int n1;
        Scanner dado;
        dado = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        n1 = dado.nextInt();
        
        
        if (n1>0){
            n1 = n1*2;
            System.out.print(n1);
        }
        
        else {
            n1 = n1*3;
            System.out.print(n1);
        }
    }
}
