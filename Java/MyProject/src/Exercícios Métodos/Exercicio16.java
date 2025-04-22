//Autora: Gabrielli Danker
/*Faça um programa que descubra:
a) O maior elemento de um vetor
b) O menor elemento
c) A média dos valores
Retorne esses valores*/
import java.util.Scanner;

public class Exercicio16{
    public static int verificarMaiorElemento(int[] vetor){
       int numMax = Integer.MIN_VALUE;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > numMax){
                numMax = vetor[i];
            }
        }
        return numMax;
    }
    public static int verificarMenorElemento(int[] vetor){
        int numMin = Integer.MAX_VALUE;
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] < numMin){
                numMin = vetor[i];
            }
        }
        return numMin;
    }
    public static double verificarMedia(int[] vetor){
        double soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        double media = soma / vetor.length;
        return media;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int vetor[] = new int[5];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o valor:");
            vetor[i] =  input.nextInt();
        }

        System.out.println("O maior elemento do vetor: " + verificarMaiorElemento(vetor));
        System.out.println("O menor elemento: " + verificarMenorElemento(vetor));
        System.out.println("A média dos valores: " + verificarMedia(vetor));
    }
}