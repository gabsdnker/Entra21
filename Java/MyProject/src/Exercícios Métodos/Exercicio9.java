//Autora: Gabrielli Danker
/*Faça um método que receba 4 números como parâmetros, some os 4 números.
Retorne a soma.*/ 
import java.util.Scanner;

public class Exercicio9{
    public static double soma(double[] vetor){
        double somar = 0;
        for (int i = 0; i < vetor.length; i++) {
            somar += vetor[i];
        }
        return somar;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double vetor[] = new double[4];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um número:");
            vetor[i] = input.nextDouble();
        }

        System.out.println("A soma é: " + soma(vetor));
        
    }
}