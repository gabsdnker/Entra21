//Autora: Gabrielli Danker
//Questão 2: Crie uma ArrayList e inverta ela

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicio2 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<Integer>();

        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);

        System.out.println(lista);

        Collections.reverse(lista);
        System.out.println(lista);

        lista.sort(Collections.reverseOrder());
        System.out.println(lista);

    }
}
