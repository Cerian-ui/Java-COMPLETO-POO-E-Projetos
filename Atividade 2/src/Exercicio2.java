/*Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar*/
import java.util.Scanner;

public class Exercicio2 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        int x;

        System.out.println("Digite um número");
        x = sc.nextInt();

         if(x % 2 == 0){
             System.out.println("O número é par");
         }
        else{
            System.out.println("O número é impar");
         }

        sc.close();

    }
}
