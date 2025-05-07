//Autora: Gabrielli Danker

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Retangulo> listaRetangulos = new ArrayList<>();

        //Criando objetos 
        listaRetangulos.add(new Retangulo(2.0, 3.0));
        listaRetangulos.add(new Retangulo(4.0, 5.0));
        listaRetangulos.add(new Retangulo(6.0, 7.0));
        listaRetangulos.add(new Retangulo(8.0, 9.0));
        listaRetangulos.add(new Retangulo(10.5, 11.5));

        //Descobrindo qual tem maior area
        Retangulo maiorArea = listaRetangulos.get(0);
        for(Retangulo retangulo : listaRetangulos){
            if(retangulo.calcularArea() > maiorArea.calcularArea()){
                maiorArea = retangulo;
            }
        }

        //Descobrindo qual tem maior perímetro
        Retangulo maiorPerimetro = listaRetangulos.get(0);
        for (Retangulo retangulo : listaRetangulos){
            if(retangulo.calcularPerimetro() > maiorPerimetro.calcularPerimetro()){
                maiorPerimetro = retangulo;
            }
        }

        System.out.println("Retangulo com maior ârea: " + maiorArea);
        System.out.println("Retangulo com maior  perímetro: " + maiorPerimetro);

    }
}
