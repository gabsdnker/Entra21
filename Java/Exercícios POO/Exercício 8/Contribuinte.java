//Autora: Gabrielli Danker
/*Para efetuar o recolhimento do Imposto de Renda a Receita Federal tem o NOME, CPF, UF (RS, 
PR e SC) e RENDA ANUAL */

/*Nível de Renda Anual Alíquota
0 a 4.000 0%
4.001 a 9.000 5,8%
9.001 a 25.000 15%
25.001 a 35.000 27,5%
acima de 35.000 30% */

/*Sendo assim, deve-se calcular o imposto a pagar do seguinte modo:
Imposto a pagar = Renda Anual * Alíquota */

public class Contribuinte {
    public String nome;
    public String cpf;
    public String uf;
    public double rendaAnual;

    public Contribuinte(String nome, String cpf, String uf, double rendaAnual){
        this.nome = nome;
        this.cpf = cpf;
        this.uf = uf;
        this.rendaAnual = rendaAnual;
    }

    public double aliquota(){
        if (rendaAnual >= 0 && rendaAnual <= 4000){
            return 0;
        }
        else if(rendaAnual >= 4001 && rendaAnual <= 9000){
            return 5.8;
        }
        else if(rendaAnual >= 9001 && rendaAnual <= 25000){
            return 15;
        } 
        else if(rendaAnual >= 25001 && rendaAnual <= 35000){
            return 27.5;
        }
        else {
            return 30;
        }
    }

    public double impostoPagar = rendaAnual * aliquota();
}
