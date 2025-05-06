//Autora: Gabrielli Danker
//Questão 4: Faça um algoritmo que descubra se uma ArrayList possui o número que o usuário entrou.
//Imprimava também o indice.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();

        lista.add(3);
        lista.add(8);
        lista.add(2);
        lista.add(6);
        lista.add(4);
        lista.add(9);
        lista.add(1);

        System.out.println("Digite o número: ");
        int numero = input.nextInt();
        
        int indice = lista.indexOf(numero);

        if(indice == -1){
            System.out.println("Não foi encontrado");
        }else{
            System.out.println("Está no indice: " + indice);
        }

    }
}
