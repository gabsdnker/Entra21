//Autora: Gabrielli Danker
/*Crie uma classe chamada Circulo que tenha o atributo raio
Calcule a área de 5 objetos diferentes de Circulo
Para obter o valor de PI, use a função Math.PI do Java*/

//A = PI* r²

public class Circulo {
    double raio;

    public double areaCirculo(){
        return Math.PI * Math.pow(raio, 2);
    }

}
