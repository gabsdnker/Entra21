import java.util.Scanner;
public class Exercicio19{
    public  static void main(String[] args){
        /*A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar
        mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo
        de 50%. Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o valor por
        hora e escreva o salário total do funcionário, que deverá ser acrescido das horas extras, caso
        tenham sido trabalhadas (considere que o mês possua 4 semanas exatas)*/
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o número de horas trabalhadas: ");
        double horasTrabalhadas = input.nextDouble();
        
        System.out.println("Digite o valor por hora: ");
        double valorHora = input.nextDouble();
        
        
        if (horasTrabalhadas == 160){
            double salarioTotal = horasTrabalhadas * valorHora;
            System.out.println("Salário Total: " + salarioTotal);
        } else if (horasTrabalhadas > 160){
            double horasExtras = horasTrabalhadas - 160;
            double valorExtras = horasExtras * 1.5;
            double salarioTotal = (160 * valorHora) + (horasExtras * valorExtras);
            System.out.println("Salário total: " + salarioTotal);
        } else {
            System.out.println("Horas trabalhadas não cumpridas!");
        }
    }
}