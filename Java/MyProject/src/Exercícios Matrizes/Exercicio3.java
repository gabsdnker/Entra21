//Autor: Gabrielli Danker
public class Exercicio3 {

	public static void main(String[] args) {
		/*Faça um código que some duas matrizes de inteiros de tamanhos iguais*/
		
		int matriz[][]= new int [3][4];
		int matriz2[][]= new int [3][4];
		int matriz3[][]= new int [3][4];
		
		//Matriz 1
		
		//linha1
		matriz[0][0]= 2;
		matriz[0][1]= 4;
		matriz[0][2]= 6;
		matriz[0][3]= 8;
		
		//linha2
		matriz[1][0]= 2;
		matriz[1][1]= 4;
		matriz[1][2]= 6;
		matriz[1][3]= 8;
		
		//linha3
		matriz[2][0]= 2;
		matriz[2][1]= 4;
		matriz[2][2]= 6;
		matriz[2][3]= 8;
		
		//Matriz 2
		
		//linha1
		matriz2[0][0]= 2;
		matriz2[0][1]= 4;
		matriz2[0][2]= 6;
		matriz2[0][3]= 8;
		
		//linha2
		matriz2[1][0]= 2;
		matriz2[1][1]= 4;
		matriz2[1][2]= 6;
		matriz2[1][3]= 8;
		
		//linha3
		matriz2[2][0]= 2;
		matriz2[2][1]= 4;
		matriz2[2][2]= 6;
		matriz2[2][3]= 8;
		
		System.out.println("Matriz 1:");
		
		for(int i = 0; i < matriz.length; i ++) {
			for( int j = 0; j < matriz[i].length; j++) {
				System.out.print("[ " + matriz[i][j] + " ]");
			}
			System.out.println();
		}
		
		System.out.println("Matriz 2:");
		
		for(int i = 0; i < matriz2.length; i ++) {
			for( int j = 0; j < matriz2[i].length; j++) {
				System.out.print("[ " + matriz2[i][j] + " ]");
			}
			System.out.println();
		}
		
		System.out.println("Matriz 3:");
		
		for(int i = 0; i < matriz3.length; i ++) {
			for(int j = 0; j < matriz3[i].length; j ++) {
				matriz3[i][j] = matriz[i][j] + matriz2[i][j];
				System.out.print("[ " + matriz3[i][j] + " ]");
			}
			System.out.println();
		}
	}

}
