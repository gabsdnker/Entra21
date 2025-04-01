//Autor: Gabrielli Danker
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		/*Descreva um algoritmo que leia 10 valores e os coloque em um vetor de 10 posições
		Em seguida, modifique o vetor de modo que os valores das posições ímpares sejam 
		aumentados em 5% e os das posições pares sejam aumentados em 2%.
		Imprima o vetor resultante*/
		
		Scanner input = new Scanner(System.in);
		DecimalFormat def = new DecimalFormat("0.00");
		
		double vetor[] = new double[10];

		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Digite o valor para a posição " + i + ":");
			vetor[i] = input.nextDouble();		
		}
		for (int i = 0; i < vetor.length; i++) {
			if (i % 2 == 0) {
				 vetor[i] *= 1.02;
			} else {
				 vetor[i] *= 1.05;
			}	
		}
		System.out.println("Vetor resultante: ");
        for(double valor : vetor) {
            System.out.println(def.format(valor) + " ");
        }

	}

}
