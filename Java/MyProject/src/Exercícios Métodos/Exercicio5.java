//Aluna: Gabrielli Danker
/*Faça um código que receba duas entradas do usuário
Imprima essas duas entradas ao cubo se:
Algum dos dois números for 5 ou a soma deles for 5 ou a diferença deles for 5
Se nenhuma dessas condições forem satisfeitas, imprima o quadrado dos números*/
import java.util.Scanner;

public class Exercicio5{
    public  static void aoCubo(double  numero1, double numero2){
            double resultado1 = numero1 * numero1 * numero1;
            double resultado2 = numero2 * numero2 * numero2;

            System.out.println("Número 1: " + numero1 + " ao cubo: " + resultado1);
            System.out.println("Número 2: " + numero2 + " ao cubo: " + resultado2);
    }
    public static void aoQuadrado(double numero1, double numero2){
            double resultado1 = numero1 * numero1;
            double resultado2 = numero2 * numero2;

            System.out.println("Número 1: " + numero1 + " ao quadrado: " + resultado1);
            System.out.println("Número 2: " + numero2 + " ao quadrado: " + resultado2);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o número 1:");
        double num1 = input.nextDouble();

        System.out.println("Digite o número 2:");
        double num2 = input.nextDouble();

        if ((num1 == 5 || num2 == 5) || (num1 + num2 == 5) || (num1 - num2 == 5)){
            aoCubo(num1, num2);
        } else{
            aoQuadrado(num1, num2);
        }


    }
}