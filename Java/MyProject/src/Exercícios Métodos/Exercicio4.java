//Aluna: Gabrielli Danker
/*Faça um programa que descubra:
a) O maior elemento de um vetor
b) O menor elemento de um vetor
c) A média dos valores
(Criar um método para cada questão*/
import java.util.Scanner;

public  class Exercicio4{
    public static void maiorElemento(int[] vetor){
        int maior = Integer.MIN_VALUE;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior){
                maior = vetor[i];
            }
        }
         System.out.println("Maior elemento: " + maior);
    }
    public static void menorElemento(int[] vetor){
        int menor = Integer.MAX_VALUE;
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] < menor){
                menor = vetor[i];
            }
        }
        System.out.println("Menor elemento: " + menor);
        
    }
    public  static  void mediaValores(int[] vetor){
            int soma = 0;
            for (int i = 0; i < vetor.length; i++) {
                soma += vetor[i];
            }
            int media = soma/vetor.length;
            System.out.println("Média dos valores: " + media);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        int vetor[] = new int[5];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um número:");
            vetor[i]= input.nextInt();
        }

       maiorElemento(vetor);
       menorElemento(vetor);
       mediaValores(vetor);
        
    }
}