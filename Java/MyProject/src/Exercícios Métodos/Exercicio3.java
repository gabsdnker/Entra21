//Aluna: Gabrielli Danker
/*Faça um programa que exiba o número que o usuário entrou como parâmetro e os 20 
números que vem após esse número
(O parâmetro do método deve ser o número inserido pelo usuário*/
import java.util.Scanner;

public class Exercicio3{
    public static  void  numeros(int num){
        for (int i = num; i <= num + 20; i++) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = input.nextInt();

        numeros(numero);
    }
}