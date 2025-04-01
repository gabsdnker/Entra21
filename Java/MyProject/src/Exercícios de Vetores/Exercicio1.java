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
        
        for (int i = elemento.length - 1; i >= 0; i--) {
            System.out.println(elemento[i]);
        }

	}

}
