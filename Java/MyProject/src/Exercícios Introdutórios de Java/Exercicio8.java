//Autor: Gabrielli Danker
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		/**
		 * Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C.
		Em seguida, calcule e mostre: 
		a) a área do triângulo retângulo que tem base A e altura C. 
		b) a área do círculo de raio C. 
		c) a área do trapézio que tem A e B por bases e C por altura. 
		d) a área do quadrado que tem lado B. 
		e) a área do retângulo que tem lados A e B
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um valor A: ");
		double A = input.nextFloat();
		
		System.out.println("Digite um valor B: ");
		double B = input.nextFloat();
		
		System.out.println("Digite um valor C: ");
		double C = input.nextFloat();
		
		double trianguloRetangulo = (A * C)/2;
		
		double circulo = Math.PI * Math.pow(C, 2);
		
		double trapezio = ((A * B) * C)/2;
		
		double quadrado = B * 4;
		
		double retangulo = A * B;
		
		System.out.println("A área do triângulo retângulo com base A e altura C: " + trianguloRetangulo);
		System.out.println("A área do círculo com raio C: " + circulo);
		System.out.println("A área do trapézio com bases A e B e altura C: " + trapezio);
		System.out.println("A área do quadrado com lado B: " + quadrado);
		System.out.println("A área do retângulo com lados A e B: " + retangulo);

	}

}
