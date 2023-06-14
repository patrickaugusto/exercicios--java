import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class att
{
	public static void main(String[] args) {
	    final int TOTAL_VALORES = 50;
        int maiorValor = Integer.MIN_VALUE;
        int menorValor = Integer.MAX_VALUE;

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= TOTAL_VALORES; i++) {
            System.out.print("Digite o " + i + "º valor: ");
            int valor = scanner.nextInt();

            if (valor > maiorValor) {
                maiorValor = valor;
            }

            if (valor < menorValor) {
                menorValor = valor;
            }
        }

        System.out.println("Maior valor lido: " + maiorValor);
        System.out.println("Menor valor lido: " + menorValor);
	}

    
}
