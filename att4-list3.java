import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class att4_list3;
{
	public static void main(String[] args) {
	    int n1, fatoracao ;
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite um número que deseja ser fatorado");
        n1 = scanner.nextInt();

        fatoracao = fatoracao(n1);
         System.out.println("A fatoração do número é: " + fatoracao);

	}

    private static int fatoracao(int n1) {
        if (n1 == 0 || n1 == 1) {
            return 1;
        } else {
            int fatorial = 1;
            for (int i = 2; i <= n1; i++) {
                fatorial *= i;
            }
            return fatorial;
        }
    }
}
