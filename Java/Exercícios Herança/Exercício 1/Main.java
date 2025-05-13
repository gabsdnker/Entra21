//Autora: Gabrielli Danker
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        
        Cilindro cilindro = new Cilindro("Vermelho", 3, 10);

        System.out.println("Area do cilindro: " + df.format(cilindro.calcularArea()) + " cm²");
        System.out.println("Volume do cilindro: " + df.format(cilindro.calcularVolume()) + " cm³");
    }
}
