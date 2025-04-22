//Autora: Gabrielli Danker
/*Faça um programa que receba 2 números do usuário.
Faça um método que descubra qual dos números é maior e retorne esse valor.
Se os dois números forem iguais, retorne: número iguais.*/
import java.util.Scanner;

public class Exercicio11{
    public static String verificarMaiorOuMenor(int numero1, int numero2){
            if(numero1 > numero2){
                return "O maior número é o primeiro número: " + numero1;
            } else if(numero2 > numero1){
                return "O maior número é o segundo número: " + numero2;
            } else{
                return "Números iguais";
            }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int num1 = input.nextInt();

        System.out.println("Digite o segundo número:");
        int num2 = input.nextInt();

        System.out.println(verificarMaiorOuMenor(num1, num2));
    }

}