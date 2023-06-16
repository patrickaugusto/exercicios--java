/*
 * Implemente um programa para calcular a potência (XY

). Este programa deve conter o

seguinte sub-programa:
• Uma função para calcular X elevado a Y. Esta função deve receber como parâmetro
de entrada dois números (X – real e Y – inteiro maior ou igual a zero) e deve calcular
e retornar, como saída, o valor de XY

. O método main deve se encarregar de exibir

o resultado ao usuário.
OBS1: NÃO utilize a função pré-definida pow. Implemente sua própria função.
Lembrete: X0 = 1, X1 = X e XY = X * X * X * ... * X
Y vezes
OBS2: Toda entrada e saída de dados deve ser feita pelo método main.
OBS3: O programa (método main) deverá ter um menu principal e um loop que permita
ao usuário executar o sub-programa quantas vezes desejar e só deverá terminar sua
execução se o usuário solicitar.
 */

package com.mycompany.main;

/**
 *
 * @author alunos: Patrick Nascimento e Antonio Rodrigues
 */
import java.util.Scanner;

public class main
{
	public static void main(String[] args) {
	    //declaração do scanner
	    Scanner scanner = new Scanner(System.in);
	    
            //variavel
	    int y, opcao;
            float x;
            
            
            do{
                //pegar o valor de x e y
                System.out.print("Digite o número base:");
		x = scanner.nextFloat();
		System.out.print("Digite a potência:");
		y = scanner.nextInt();
                
                
                System.out.println(potencia(x,y));

                //quebra de linha
                System.out.println("");
                
                //menu pro usuario continuar ou encerrar o programa
                menu();
                opcao = scanner.nextInt();
                
                
                
            }while(opcao!=0);

		
        }
        
        
        public static void menu(){
            System.out.println("[1]Continuar");
            System.out.println("[0]Encerrar");
        }

        
        private static float potencia(float x, int y){
            
            if (y == 0)
                return 1;
            
            if (y == 1)
                return x;
            
            float total = x;

		for (int i = 1; i < y; i++) {
			total *= x;
		}

		return total;
            
            
        }
}
