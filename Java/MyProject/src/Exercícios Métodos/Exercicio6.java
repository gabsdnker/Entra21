// Aluna: Gabrielli Danker
/*Faça um método que receba um número, esse será o número "base"
Dentro do método, faça o usuário entrar com mais dois números
Imprima qual dos dois últimos números está mais perto do primeiro número "base"*/
import java.util.Scanner;

public class Exercicio6{
    public static void receberBase(int base){
            Scanner input = new Scanner(System.in);

            System.out.println("Digite a número 1: ");
            int num1 = input.nextInt();

            System.out.println("Digite o número 2: ");
            int num2 = input.nextInt();

            int diferenca1 = Math.abs(num1 - base);
            int diferenca2 = Math.abs(num2  - base);

            if (diferenca1 < diferenca2){
                System.out.println("O número " + num1 + " está mais próximo da base " + base);
            } else if (diferenca1 > diferenca2){
                System.out.println("O número " + num2 + " está mais próximo da base " + base);
            } else {
                System.out.println("Os números " + num1 + " e " + num2 + " estão igualmente próximos da base " + base);
            }            
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número base: ");
        int base = input.nextInt();

        receberBase(base);

    }
}