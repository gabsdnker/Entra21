//Autor: Gabrielli Danker
import java.util.Scanner;

public class Exercício15 {

	public static void main(String[] args) {
		/*
		 * O índice de massa corporal (IMC) é uma medida internacional usada para calcular se uma 
		pessoa está no peso ideal. O IMC é determinado pela divisão da massa do indivíduo pelo 
		quadrado de sua altura, onde a massa está em quilogramas e a altura está em metros, de 
		acordo com a fórmula:
		IMC = Massa / Altura²
		Faça um algoritmo para classificar o IMC e dizer o grau de obesidade do indivíduo, de acordo 
		com a seguinte tabela:
		< 18.5 Magreza
		18.5 – 24.9 Saudável
		25.0 – 29.9 Sobrepeso
		30.0 – 34.9 Obesidade Grau I
		35.0 – 39.9 Obesidade Grau II (severa)
		> 40.0 Obesidade Grau III (morbida)
		 */
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Digite seu peso: ");
		double peso = input.nextDouble();
		
		System.out.println("Digite sua altura: ");
		double altura = input.nextDouble();
		
		double IMC = peso / Math.pow(altura, 2);
		
		if (IMC <= 18.5) {
			System.out.println("18.5 Magreza");
		} else if (IMC >= 18.5 && IMC <= 24.9) {
			System.out.println("18.5 – 24.9 Saudável");
		} else if(IMC >= 25.0 && IMC <= 29.9) {
			System.out.println("25.0 – 29.9 Sobrepeso");
		} else if(IMC >= 30.0 && IMC <= 34.9) {
			System.out.println("30.0 – 34.9 Obesidade Grau I");
		} else if (IMC >= 35.0 && IMC <= 39.9) {
			System.out.println("35.0 – 39.9 Obesidade Grau II (severa)");
		} else if (IMC > 40.0) {
			System.out.println("> 40.0 Obesidade Grau III (morbida)");
		} else {
			System.out.println("Invalido");
		}

	}

}
