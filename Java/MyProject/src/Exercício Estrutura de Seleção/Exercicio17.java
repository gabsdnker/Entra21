//Autor: Gabrielli Danker
import java.util.Scanner;
public class Exercicio17{
    public  static void main(String[] args){
        /*A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar
        mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo
        de 50%. Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o valor por
        hora e escreva o salário total do funcionário, que deverá ser acrescido das horas extras, caso
        tenham sido trabalhadas (considere que o mês possua 4 semanas exatas)*/
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Dia: ");
        int dia = input.nextInt();
        
        if (dia <= 31 && dia >= 1){
            System.out.println("Mês: ");
            int mes = input.nextInt();
            
            if (mes <= 12 && mes >= 1){
                System.out.println("Ano: ");
                int ano = input.nextInt();
                
                if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)){
                	
                    if (dia > 31 && mes > 12){
                        System.out.println("Data Inválida!");
                        
                    } else if ((mes == 4) || (mes == 6 || mes == 9 || mes == 11) && (dia < 0 || dia > 30)){
                        System.out.println("Data Inválida!");
                        
                    } else if (mes == 2 && dia > 29){
                        System.out.println("Data Inválida");
                        
                    } else {
                        System.out.println("Data Válida!");
                    }
                }else {
                    if (dia > 31 && mes > 12){
                        System.out.println("Data Inválida!");
                        
                    } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia < 0 || dia > 30)){
                        System.out.println("Data Inválida!");
                        
                    }  else if(mes == 2 && dia > 28){
                        System.out.println("Data Inválida!");
                        
                    } else {
                        System.out.println("Data Válida!");
                    }
                }
            }else {
                System.out.println("Mês Inválida!");
            }
        }else if (dia > 31 || dia <= 0) {
            System.out.println("Data Inválida!");
        }

    }
}
