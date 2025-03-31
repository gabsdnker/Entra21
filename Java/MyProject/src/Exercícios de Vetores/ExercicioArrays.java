//Autor: Gabrielli Danker
import java.util.Scanner;

public class ExercicioArrays {

	public static void main(String[] args) {
		/*Criem um vetor de n elementos que contêm a idade dos seus familiares*/
		Scanner input = new  Scanner(System.in);
			
		int idades[] = new int[5];	

		for (int i = 0; i < idades.length; i++) {			
			
			System.out.println("Digite a idade: ");
			idades[i]= input.nextInt();
			
		}
		for (int i = 0; i < idades.length; i++) {
			System.out.println("Idade do familiar  é " + idades[i]);
		}
			
		}
		

	}
