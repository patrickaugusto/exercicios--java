import java.util.Scanner;
public class att1_list2 {
    public static void main (String args[]){
        
        //declaração de váriaveis
        String id;
        float n1, n2, n3, me, ma;
        Scanner dado;
        dado = new Scanner(System.in);
        
        //informar dados das váriaveis
        System.out.print("Digite seu nome: ");
        id = dado.nextLine();
        System.out.print("Digite a primeira nota: ");
        n1 = dado.nextFloat();
        System.out.print("Digite a segunda nota: ");
        n2 = dado.nextFloat();
        System.out.print("Digite a terceira nota");
        n3 = dado.nextFloat();
        
        
        //medias
        me = (n1+n2+n3)/3;
        
        ma = (n1+(2*n2)+(3*n3)+me)/7;
        
        //estrutura de condição
        if (ma >= 9){
            System.out.print("A");
        }
        
        if (ma >= 7.5 && ma < 9){
            System.out.print("B");
        }
        
        if (ma >= 6 && ma < 7.5){
            System.out.print("C");
        }
        
        if (ma >= 4 && ma < 6){
            System.out.print("D");
        }
        
        if (ma < 4){
            System.out.print("E");
        }
    }
}
