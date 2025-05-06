//Autora: Gabrielli Danker
//Questão 3: Crie uma ArrayList.
//O usuário vai colocando valores decimais até ele colocar o número 0.
//Calcular:
//a) Qual o menor número?
//b) Qual o maior número?
//c) Calcular a média.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Double> listaValores = new ArrayList<Double>();

        System.out.println("Digite um valor decimal (0 para sair):");
        double valor = input.nextDouble();

        while (valor != 0){
            listaValores.add(valor);
            System.out.println("Digite um valor decimal (0 para sair):");
            valor = input.nextDouble();
        }

        if(!listaValores.isEmpty()){
            double menor = listaValores.get(0);
            double maior = listaValores.get(0);
            double soma = 0;

            for (double num : listaValores) {
               if (num < menor){
                menor = num;
               }
               if(num > maior){
                maior = num;
               }

               soma += num;
            }

            double media = soma /listaValores.size();
            
            System.out.println("Menor: " + menor);
            System.out.println("Maior: " + maior);
            System.out.println("Média: " + media);

            //Existe também para saber o maior e o menor os métodos:
            //Collections.max(lista)
            //Collections.min(lista)
            
        }else{
            System.out.println("Nenhum número foi inserido");
        }

    }
}
