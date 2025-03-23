import java.util.Scanner;
public class Exercicio18{
    public  static void main(String[] args){
        /*Elabore um algoritmo para exibir o valor de reajuste que um funcionário receberá no seu
        salário. A empresa irá conceder 5% de reajuste para o funcionário que for admitido há menos
        de 12 meses. Para funcionário admitido entre 13 e 48 meses, irá conceder 7% de reajuste. O
        seu algoritmo deve solicitar ao usuário que digite a quantidade de meses que o funcionário foi
        admitido.*/
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de meses que o funcionário foi admitido:");
        int mesesAdmissao = input.nextInt();
        
        double reajuste;

        if (mesesAdmissao <= 12) {
    
            reajuste = 0.05;
    
         } else if (mesesAdmissao >= 13 && mesesAdmissao <= 48) {
    
            reajuste = 0.07;
    
         } else {
    
            reajuste = 0;
    
         }
    
         if (reajuste > 0) {
    
            System.out.printf("O funcionário receberá um reajuste de %.0f%% no salário.%n", reajuste * 100);
    
         } else {
    
            System.out.println("O funcionário não tem direito a reajuste.");
    
         }
    }
}