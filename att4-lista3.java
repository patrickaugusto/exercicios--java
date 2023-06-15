/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.main;

/**
 *
 * @Patrick Nascimento
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner;
		scanner = new Scanner(System.in);
		
		
		int familias, filhos, i;
		float mediaF, filhos_final;
		float renda, mediaR, renda_final;
                i = 0;
		filhos_final = 0;
		renda_final = 0;
		System.out.print("Digite o numero de estudantes cadastrados em sala: ");
		familias = scanner.nextInt();
		
		    while(i < familias){
		    
		       System.out.print("Digite o número de filhos da familia atual: ");
			   filhos = scanner.nextInt();
			   filhos_final = filhos + filhos_final;
		    
                           System.out.println("Digite a renda mensal da familia atual: ");
                           renda = scanner.nextFloat();
                           renda_final = renda + renda_final;
                           
                           
                           
	       i++;
		   }
		   mediaF = filhos_final/familias;
		System.out.print("A média de filhos por familia é: "+ mediaF);
                mediaR = renda_final/familias;
                System.out.print("A media da renda mensal pro famlia é: "+mediaR);
}
}
