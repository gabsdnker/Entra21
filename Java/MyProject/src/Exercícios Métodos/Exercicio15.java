//Autora: Gabrielli Danker
/*Faça um programa que diz se um número inserido está dentro de um limite imposto 
pelo usuário
Por exemplo:
Usuário inseriu o limite máximo como 100.
Usuário inseriu o limite mínimo como 70.
Depois ele inseriu o número 80.
O retorno deve ser: 80 está nos limites impostos*/
import java.util.Scanner;

public class Exercicio15{
    public static String verificarLimiteImposto(int numero, int limiteMaximo, int limiteMinimo){
        if (numero < limiteMinimo){
            return numero + " está no limite mínimo";
        } else if (numero >= limiteMinimo && numero <= limiteMaximo){
            return numero + " está nos limites impostos";
        } else{
            return numero + " está acima do limite máximo";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite limite mínimo:");
        int limiteMinimo = input.nextInt();

        System.out.println("Digite o limite máximo:");
        int limiteMaximo = input.nextInt();

        System.out.println("Digite um número para saber se esta no limite imposto:");
        int num = input.nextInt();

        System.out.println(verificarLimiteImposto(num, limiteMaximo, limiteMinimo));
    }
}