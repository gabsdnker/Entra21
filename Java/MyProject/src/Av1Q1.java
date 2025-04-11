//Aluna: Gabrielli Danker
/*Questão 1:Escreva um programa onde o usuário informa os dados dos lados de um triangulo depois 
		verifique e imprima se ele é: Equilátero (três lados iguais), Isósceles (dois lados iguais), ou 
		Escaleno (três lados diferentes).*/

import java.util.Scanner;

public class Av1Q1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double array[]= new double[3];
		int i = 0;
		
		for( i = 0; i < array.length; i ++) {
			System.out.println("Digite o valor do lado " + (i + 1) + ": ");
			array[i] = input.nextDouble();
			
		}
		if ((array[0] == array[1]) && (array[0] == array[2]) && (array[1] == array[2])) {
			System.out.println("Equilátero");
		} else if (((array[0] == array[1]) && (array[1] != array[2])) || ((array[0] == array[2]) && (array[1] != array[2]))) {
			System.out.println("Isósceles");
		} else {
			System.out.println("Escaleno");
		}
		
	}

}
