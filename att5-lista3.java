/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;


public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//
		int familia, filhos, filhosT = 0, filhosM;
		float renda, rendaT = 0, rendaM;
		
		System.out.print("Digite o número de familias na cidade: ");
		familia = scanner.nextInt();
		
		
		
		//Parte de repetição
		for(int i = 0; i < familia; i++){
		    
		    //Perguntar o numero e fazer o calculo total de todas as familias
		    System.out.print("Digite o numero de filhos da familia atual: ");
		    filhos = scanner.nextInt();
		    filhosT = (filhos + filhosT);
		    
		    
		    //Perguntar a renda e fazer o calculo total de todas as familias
		    System.out.print("Digite o valor da renda mensal da familia atual: ");
		    renda = scanner.nextInt();
		    rendaT = (renda + rendaT);
		    
		    
		    System.out.println("");
		    
		    
		}
		
		//fazer o calculo da media de filhos e renda e mosntrar na tela
		filhosM = filhosT/familia;
		rendaM = rendaT/familia;
		System.out.println("A média de filhos por familia é: " + filhosM);
		System.out.print("A média da renda mensal por familia é: " + rendaM);
		   
		    
		    
	}
}
