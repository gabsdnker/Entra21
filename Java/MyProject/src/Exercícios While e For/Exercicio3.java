//Autor: Gabrielli Danker
public class Exercicio3 {

	public static void main(String[] args) {
		/*Escreva um algoritmo que escreva o número 0, 3, 6, 9, 12 ... até o número 30*/
		
		for (int i = 0; i <= 30; i +=3) {
			if (i == 31) {
				break;
			} 
			System.out.println(i);
		}
	}

}
