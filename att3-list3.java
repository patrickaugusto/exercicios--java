import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class att3_list3
{
	public static void main(String[] args) {
	    //declaração do scanner
	    Scanner dado;
	    dado = new Scanner(System.in);
	    
        //variavel
	    int opcao;
	    
        //laço de repetição
	    do{
            menu();
	        System.out.println("digita um numero"); 
            opcao = dado.nextInt();   

            //exibitir a tabuada de acordo com a escolha
            switch(opcao){

                case 1:
                tabuada1();
                System.out.println();
                break;

                case 2:
                tabuada2();
                System.out.println();
                break;

                //preguiça de escrever o resto =/
            }
	    }while(opcao!=0);//encerra o cod. caso escolha 0
		
	}

    public static void menu(){
        System.out.println("(1) Tabuada do 1");
        System.out.println("(2) Tabuada do 2");
        System.out.println("(3) Tabuada do 3");
        System.out.println("(4) Tabuada do 4");
        System.out.println("(5) Tabuada do 5");
        System.out.println("(6) Tabuada do 6");
        System.out.println("(7) Tabuada do 7");
        System.out.println("(8) Tabuada do 8");
        System.out.println("(9) Tabuada do 9");
        System.out.println("(10) Tabuada do 10");
        System.out.println("(0) Encerrar");
    }

    public static void tabuada1(){
        System.out.println("1x1=1");
        System.out.println("1x2=2");
        System.out.println("1x3=3");
        System.out.println("1x4=4");
        System.out.println("1x5=5");
        System.out.println("1x6=6");
        System.out.println("1x7=7");
        System.out.println("1x8=8");
        System.out.println("1x9=9");
        System.out.println("1x10=10");
        
    }

    public static void tabuada2(){
        System.out.println("2x1=2");
        System.out.println("2x2=4");
        System.out.println("2x3=6");
        System.out.println("2x4=8");
        System.out.println("2x5=10");
        System.out.println("2x6=12");
        System.out.println("2x7=14");
        System.out.println("2x8=16");
        System.out.println("2x9=18");
        System.out.println("2x10=20");
        
    }

//não vou fazer cada um desses até o 10.

}
