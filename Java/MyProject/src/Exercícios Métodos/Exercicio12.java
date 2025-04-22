//Autora: Gabrielli Danker
/*Faça um programa que calcule o quadrado de um número caso esse número seja par e
o dobro desse número caso esse número seja ímpar.
Retorne o resultado*/
import java.util.Scanner;

public class Exercicio12{
    public static String calcularQuadrado(int numero){
            int quadrado = numero * numero;

            if (quadrado % 2 == 0){
                return "O quadradro de " + numero + " é " + quadrado + " é par";
            } else {
                return "O quadrado de " + numero + " é " + quadrado + " é ímpar";
            }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = input.nextInt();

        System.out.println(calcularQuadrado(num));

    }
}