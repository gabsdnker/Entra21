//Autora: Gabrielli Danker
/*Faça um método booleano que retorne true se o número passado como parâmetro seja 
par.Retorne false caso seja ímpar */

import java.util.Scanner;

public class Exercicio10{
    public static boolean verificarParOuImpar(int numero){
        return numero % 2 == 0;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número:");
        int num = input.nextInt();

        System.out.println(verificarParOuImpar(num));
    }
}