import java.util.Scanner;

public class Av1Q3 {

	public static void main(String[] args) {
		/*Questão 3: Crie um programa Java para encontrar a primeira sequência de números seguidos em um 
		vetor.
		Por exemplo, o vetor {6, 0, 1, 2, 1, 2, 3, 4, 5, 1, 6} tem a primeira sequência sendo {0, 1, 2}.
		Exiba essa sequência.
		Peça para o usuário inserir os valores em um vetor de 8 posições.*/
		
		Scanner input = new Scanner(System.in);
		
		int vetor[] = new int[8];
		int sequencia = 0;
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Digite um valor:");
			vetor[i] = input.nextInt();

			
		}
		for(int i = 1; i < vetor.length; i ++) {
			while(i != 0) {
				if(vetor[i] <= i+1);{
					System.out.println(vetor[i]);
				}
			}
			
		}
		
	}

}
