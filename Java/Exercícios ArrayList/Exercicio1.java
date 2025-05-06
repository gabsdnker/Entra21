//Autora: Gabrielli Danker
//Questão 1: Coloque 5 elementos em uma ArrayList e ordene-os

import java.util.ArrayList;
import java.util.List;

public class Exercicio1 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<Integer>();

        lista.add(2);
        lista.add(3);
        lista.add(1);
        lista.add(5);
        lista.add(4);

        System.out.println(lista);

        lista.sort(null);

        System.out.println(lista);

        for (int i = 0; i < lista.size(); i++) {
           System.out.println(lista.get(i));
            
        }
        
    }    
}
