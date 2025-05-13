
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;



public class ExemploData {
    public static void main(String[] args){
        //Printar data específica
        LocalDate data = LocalDate.of(2025, 5, 13);

        System.out.println(data);

        //Receber data do usuário
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a data");
        String str = input.next();

        LocalDate data2 = LocalDate.parse(str, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        System.out.println(data2);
    }
}
