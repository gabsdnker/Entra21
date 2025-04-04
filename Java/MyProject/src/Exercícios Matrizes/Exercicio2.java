//Autor: Gabrielli Danker
public class Exercicio2 {

	public static void main(String[] args) {
		/*Calcule o determinante da matriz abaixo:
			4 12
			2 -3*/
		
		int matriz[][]= new int [2][2];

		matriz[0][0]= 4;
		matriz[0][1]= 12;
		
		matriz[1][0]= 2;
		matriz[1][1]= -3;
		
		int calculo1 = matriz[0][0] * matriz[1][1];
		int calculo2 = matriz[1][0] * matriz[0][1];
		
		int calculoFinal = calculo1 - calculo2;
		
		System.out.println("Calculo da determinate da matriz abaixo:");
		
		for(int i =0; i < matriz.length; i++) {
			for(int j= 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Primeiro você faz: " + matriz[0][0] + " x " + matriz[1][1]);
		System.out.println("Resultado: " + calculo1);
		System.out.println("Depois: " + matriz[1][0] + " x " + matriz[0][1]);
		System.out.println("Resultado: " + calculo2 );
		System.out.println("Logo em seguida você faz " + calculo1 + " - " + calculo2);
		System.out.println("Resultado: " + calculoFinal);
		

	}

}
