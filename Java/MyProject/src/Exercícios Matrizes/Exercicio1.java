//Autor: Gabrielli Danker
public class Exercicio1 {

	public static void main(String[] args) {
		/*Crie uma matriz com 12 linhas e 2 colunas
		A primeira coluna corresponde aos meses do ano
		A segunda corresponde ao lucro que a loja teve no mês.
		Imprima o seu resultado no formato:
		No mês 1 a loja teve 2000 de lucro
		No mês 2 a loja teve 1500 de lucro...*/
		
		int matriz[][] = new int [12][2];
		
		//meses
		matriz[0][0]= 1;
		matriz[1][0]= 2;
		matriz[2][0]= 3;
		matriz[3][0]= 4;
		matriz[4][0]= 5;
		matriz[5][0]= 6;
		matriz[6][0]= 7;
		matriz[7][0]= 8;
		matriz[8][0]= 9;
		matriz[9][0]= 10;
		matriz[10][0]= 11;
		matriz[11][0]= 12;

		//lucros
		matriz[0][1]= 2500;
		matriz[1][1]= 2000;
		matriz[2][1]= 1500;
		matriz[3][1]= 3000;
		matriz[4][1]= 1000;
		matriz[5][1]= 2600;
		matriz[6][1]= 3200;
		matriz[7][1]= 900;
		matriz[8][1]= 620;
		matriz[9][1]= 1560;
		matriz[10][1]= 2400;
		matriz[11][1]= 2000;

		
		for (int i = 0; i < matriz.length; i ++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("O lucro do mês " + matriz[i][0] + " é de R$ " + matriz[i][1] + ",00");
			}
		}
		
	}

}
