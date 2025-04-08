//Autora: Gabrielli Danker
public class Exercicio6 {

	public static void main(String[] args) {
		/*Utilizando matrizes e laços de repetição, imprima as seguintes figuras:	*/
		
		int matrizA[][]= new int[4][4];
		int matrizB[][]= new int[4][4];
		int matrizC[][]= new int[4][4];
		
		/*
		a)
		* * * *
		* * * *
		* * * *
		* * * *
		*/
		System.out.println("Letra A:");
		// Preenche a matriz com 1 para representar '*'
		for(int i = 0; i < matrizA.length; i ++) {
			for(int j = 0; j < matrizA[i].length; j ++) {
					matrizA[i][j] = 1;
			}
		}
		
		for(int i = 0; i < matrizA.length; i ++) {
			for(int j = 0; j < matrizA[i].length; j ++) {
				// Imprime '*' para os elementos que são 1
				if (matrizA[i][j] == 1) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}	
		
		/*
		b)
		* * * *
		* *
		* *
		* * * * 
		*/
		System.out.println("Letra B:");
		// Preenche a primeira e última linha, e a primeira e última coluna com 1 para representar '*'
		for(int i = 0; i < matrizB.length; i ++) {
			for(int j = 0; j < matrizB[i].length; j ++) {
				if (i == 0 || i == 3 || j == 0 || j == 1) {
					matrizB[i][j] = 1;
				}
			}
		}
		for(int i = 0; i < matrizB.length; i ++) {
			for(int j = 0; j < matrizB[i].length; j ++) {
				// Imprime '*' para os elementos que são 1
				if (matrizB[i][j] == 1) {
					System.out.print("* ");
				} else {
					// Imprime espaço para os elementos que são 0
					System.out.print(" ");
				}	
			}
			System.out.println();
		}
		
		/*
		c) 
		*
		* *
		* * *
		* * * *
		*/
		System.out.println("Letra C:");

        // Preenche a matriz de forma que cada linha tenha um número crescente de 1 para representar '*
		for(int i = 0; i < matrizC.length; i ++) {
			for(int j = 0; j <= i; j ++) {
					matrizC[i][j] = 1;
				
			}
		}
		for(int i = 0; i < matrizC.length; i ++) {
			for(int j = 0; j < matrizC[i].length; j ++) {
				// Imprime '*' para os elementos que são 1
				if (matrizC[i][j] == 1) {
					System.out.print("* ");
				} else {
					// Imprime espaço para os elementos que são 0
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
	}

}
