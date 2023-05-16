import java.util.Scanner;
 
 public class impar_par {
 
     public static void main(String[] args) {
         int n1, r;
         Scanner dado;
         dado = new Scanner(System.in);
         
         System.out.print("DIgite um número: ");
         n1 = dado.nextInt();
         
         r = n1%2;
         
         if (r==0){
             System.out.print("Este numero é par!");
         }
         
         else{
             System.out.print("Este numero é ímpar!");
         }
     }
 }
 