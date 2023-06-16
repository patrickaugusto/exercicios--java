/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.main;

/**
 *
 * @author aluno
 */
import java.util.Scanner;

public class main1
{
	public static void main(String[] args) {
	    //declaração do scanner
	    Scanner scanner = new Scanner(System.in);
	    
        //variavel
	    int x;
            
            System.out.println("Qual tabuada você deseja saber?");
            x = scanner.nextInt();
	    
        //laço de repetição
	    for(int i = 1; i<=10; i++){
                System.out.printf("%d x %d = %d \n",x,i,(x*i));
            }
            
            
            
		
	}

}
