//Autor: Gabrielli Danker
public class Exercicio4 {

	public static void main(String[] args) {
		/*Faça um algoritmo que atribua valores a um vetor de 100 posições de acordo com o quadrado 
		do seu índice.
		Ex:
		[0] = 0
		[1] = 1
		[2] = 4
		[3] = 9*/
		
		int vetor[] = new int[101];
		
		for (int i =0; i < vetor.length; i ++) {
			vetor[i] = i * i;
		}
		for (int i = 0; i < vetor.length; i ++) {
			System.out.println("[" + i + "] = " + vetor[i]);
		}

	}

}
