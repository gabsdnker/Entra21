//Autor: Gabrielli Danker
import java.util.Scanner;

public class EntradaAreaPerimetro {

	public static void main(String[] args) {
		
		System.out.println("Digite a base: ");
		Scanner input = new Scanner(System.in);
		double base = input.nextDouble();
		
		System.out.println("Digite a altura: ");
		Scanner input2 = new Scanner(System.in);
		double altura = input2.nextDouble();
		
		double area = base * altura;
		double perimetro = (base*2) + (altura*2);
		
		System.out.println("A área é: " + area);
		System.out.println("O perímetro é: " + perimetro);
	}
}
