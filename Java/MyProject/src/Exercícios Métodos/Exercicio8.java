//Autora: Gabrielli Danker
/*Faça um programa em que o usuário entre com um número de 1 a 4
Com o número 1 sendo verão, 2 sendo outono...
Dependendo de o que o usuário informa, retorne:
É verão
E o tempo está quente.
Ou
É inverno
E está frio.
Faça um método para cada estação do ano*/
import java.util.Scanner;

public class Exercicio8{
    public static String verao(int estacao){
        return "É verão!";
    }
    public static String outono(int estacao){
        return  "É outono!";

    }
    public static String inverno(int estacao){
        return "É inverno!";

    }
    public static String primaveira(int estacao){
        return "É primavera!";
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número:");
        int estacao = input.nextInt();
        
        if (estacao == 1){
            System.out.println (verao(estacao));
        } else if (estacao == 2){
            System.out.println(outono(estacao));
        } else if (estacao == 3) {
            System.out.println(inverno(estacao));
        } else if (estacao == 4){
            System.out.println(primaveira(estacao));
        } else {
            System.out.println("Número Inválido!");
        }
    }
}