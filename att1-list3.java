import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
		Scanner dado;
		dado = new Scanner(System.in);
		
		
		int estudantes, i;
		float notas, mediaA, notafinal;
		i = 0;
		notafinal = 0;
		
		System.out.print("Digite o numero de estudantes cadastrados em sala: ");
		estudantes = dado.nextInt();
		
		    while(i < estudantes){
		    
		       System.out.print("Digite a nota do estudante: ");
			   notas = dado.nextFloat();
			   notafinal = notas + notafinal;
		    
		    
	       i++;
		   }
		   
		   
		   mediaA = notafinal/estudantes;
		System.out.print("A média aritimetica dos estudantes é: "+ mediaA);
}
}
