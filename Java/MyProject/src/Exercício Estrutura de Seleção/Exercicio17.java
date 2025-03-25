//Autor: Gabrielli Danker
import java.util.Scanner;
public class Exercicio17{
    public  static void main(String[] args){
        /*Leia uma data (dia, mês e ano) e determine se ela é válida.
		Lembre dos anos bissextos!
		Faça com que o programe informe que a data é inválida assim que o usuário informar um valor 
		inexistente.
		Por exemplo, assim que o usuário informar o dia 50 o programa já deve parar e não deve 
		receber o mês e ano.*/
        
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
                        System.out.println(dia + "/" + mes + "/" + ano + " -Data válida!");
                    }
                }else {
                    if (dia > 31 && mes > 12){
                        System.out.println("Data Inválida!");
                        
                    } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia < 0 || dia > 30)){
                        System.out.println("Data Inválida!");
                        
                    }  else if(mes == 2 && dia > 28){
                        System.out.println("Data Inválida!");
                        
                    } else {
                        System.out.println(dia + "/" + mes + "/" + ano + " -Data válida!");
                    }
                }
            }else {
                System.out.println("Mês Inválido!");
            }
        }else if (dia > 31 || dia <= 0) {
            System.out.println("Dia Inválido!");
        }

    }
}
