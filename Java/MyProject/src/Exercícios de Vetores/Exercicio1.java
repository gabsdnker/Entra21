//Autor: Gabrielli Danker
public class Exercicio1 {

	public static void main(String[] args) {
		/*Crie uma array de 5 elementos e imprima os últimos elementos por primeiro*/
		
		int elemento[] = new int[5];
		elemento[0] = 3;
		elemento[1] = 8;
		elemento[2] = 5;
		elemento[3] = 12;
		elemento[4] = 24;
		
		for (int i =  elemento.length -1 ;i >= 0; i--) {
			System.out.println(elemento[i]);
		}
		
		/*Funciona, prém dá esse erro no final:
		24
		12
		8
		5
		3
		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 5
			at Exercicio1.main(Exercicio1.java:14) */

	}

}
