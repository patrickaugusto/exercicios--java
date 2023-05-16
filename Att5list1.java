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
public class Att5list1 {

    public static void main(String[] args) {
        int n1,r;
        Scanner dado;
        dado = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        n1 = dado.nextInt();
        
        r = n1%2;
                
        if (r==0){
            n1 = n1+5;
            System.out.print(n1);
        }
        
        else {
            n1 = n1+8;
            System.out.print(n1);
        }
    }
}
