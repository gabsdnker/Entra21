//Autora: Gabrielli Danker

public class MainCirculo {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo();
        circulo1.raio = 5;

        Circulo circulo2 = new Circulo();
        circulo2.raio = 4;

        Circulo circulo3 = new Circulo();
        circulo3.raio = 3;

        Circulo circulo4 = new  Circulo();
        circulo4.raio = 2;

        Circulo circulo5 = new Circulo();
        circulo5.raio = 1;

        System.out.println("Ârea circulo 1: " + circulo1.areaCirculo());
        System.out.println("Ârea circulo 2: " + circulo2.areaCirculo());
        System.out.println("Ârea circulo 3: " + circulo3.areaCirculo());
        System.out.println("Ârea circulo 4: " + circulo4.areaCirculo());
        System.out.println("Ârea circulo 5: " + circulo5.areaCirculo());
    }
}
