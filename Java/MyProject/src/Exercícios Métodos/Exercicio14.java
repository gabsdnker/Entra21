//Autora: Gabrielli Danker
/*Faça um programa que receba 3 notas do usuário e informe a média aritmética dessas 
notas.Retorne a média*/
import java.util.Scanner;

public class Exercicio14{
    public static double mediaAritimetica(double[] vetor){
        double soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }

        double media = soma / vetor.length;

        return media;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double vetor[] = new double[3];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite a nota " + (i + 1));
            vetor[i] = input.nextDouble();
        }

        System.out.println("A média é: " + mediaAritimetica(vetor));
    }
}