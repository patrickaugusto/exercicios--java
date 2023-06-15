/******************************************************************************

A prefeitura da cidade XXXX deseja fazer uma pesquisa entre seus habitantes. Faça um
programa para coletar dados sobre a renda e número de filhos de cada família e, após as
leituras, mostrar:
• A renda média da população;
• A média do número de filhos;
• O maior salário dos habitantes;
• O percentual de habitantes com renda menor que R$ 200,00.
OBS: O final da leitura dos dados se dará com a entrada de um “salário negativo”.

*******************************************************************************/
import java.util.Scanner;


public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//
		int familia, filhos, filhosT = 0, filhosM, renda200 = 0;
		float renda, rendaT = 0, rendaM, maiorS = 0, renda200P;
		
		System.out.print("Digite o número de familias na cidade: ");
		familia = scanner.nextInt();
		
		
		
		//Parte de repetição
		for(int i = 0; i < familia; i++){
		    
		    //Perguntar o numero e fazer o calculo total de todas as familias
		    System.out.print("Digite o numero de filhos da familia atual: ");
		    filhos = scanner.nextInt();
		    
		    
		    
		    //Perguntar a renda e fazer o calculo total de todas as familias
		    System.out.print("Digite o valor da renda mensal da familia atual: ");
		    renda = scanner.nextInt();
		    
		    
		    if(maiorS<=renda || i == 1){
		        maiorS = renda;
		    }
		    
		    if (renda < 200){
		        renda200++;
		    }
		    
		    filhosT = (filhos + filhosT);
		    rendaT = (renda + rendaT);
		    System.out.println("");
		    
		    
		}
		
		//fazer o calculo da media de filhos e renda e mosntrar na tela
		filhosM = filhosT/familia;
		rendaM = rendaT/familia;
		renda200P = (renda200/familia)*100;
		System.out.println("A média de filhos por familia é: " + filhosM);
		System.out.println("A média da renda mensal por familia é: " + rendaM);
		System.out.println("O percentual de familias com renda menor que R$200 é: "+renda200P);
		   
		    
		    
	}
}
