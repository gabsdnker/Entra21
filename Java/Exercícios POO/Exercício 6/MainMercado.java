//Autora: Gabrielli Danker
/*Utilizando a classe Mercado.
Atribua valores às variáveis da classe Mercado para cada um dos objetos de Mercado.
Calcule:
a) Quem teve a maior receita vendendo maçãs?
b) Quem teve a maior receita vendendo laranjas?
c) Qual das lojas teve a maior receita?
d) Qual das lojas teve a menor receita?
e) Qual das lojas ficou no "meio" em termos de receita?
f) Juntando as 3 lojas, a franquia teve uma receita maior vendendo maçãs ou laranjas?*/

public class MainMercado {
    public static void main(String[] args) {
        Mercado unidadeBlumenau = new Mercado();
        unidadeBlumenau.nomeMercado = "Komprão Blumenau";
        unidadeBlumenau.numMacaVendidas = 300;
        unidadeBlumenau.precoMaca = 2.50;
        unidadeBlumenau.numLaranjaVendidas = 250;
        unidadeBlumenau.precoLaranja = 3.29;

        Mercado unidadeJoinville = new  Mercado();
        unidadeJoinville.nomeMercado = "Komprão Joinville";
        unidadeJoinville.numMacaVendidas = 268;
        unidadeJoinville.precoMaca = 2.36;
        unidadeJoinville.numLaranjaVendidas = 352;
        unidadeJoinville.precoLaranja = 3.25;

        Mercado unidadeFlorianopolis = new Mercado();
        unidadeFlorianopolis.nomeMercado = "Komprão Florianopolis";
        unidadeFlorianopolis.numMacaVendidas = 245;
        unidadeFlorianopolis.precoMaca = 3.58;
        unidadeFlorianopolis.numLaranjaVendidas = 256;
        unidadeFlorianopolis.precoLaranja = 2.56;

        Mercado[] vetor = {unidadeBlumenau, unidadeJoinville, unidadeFlorianopolis};

        //a) Quem tem a maior receita vendendo maçãs?
        System.out.println("a) Quem tem a maior receita vendendo maçãs?");
        Double maiorReceitaMaca = Double.MIN_VALUE;
        String nomeMaiorReceitaMaca = " ";

        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i].receitaMaca() > maiorReceitaMaca){
                maiorReceitaMaca = vetor[i].receitaMaca();
                nomeMaiorReceitaMaca = vetor[i].nomeMercado;
            }
        }
        System.out.println(nomeMaiorReceitaMaca);

        //b) Quem teve a maior receita vendendo laranjas?
        System.out.println("b) Quem teve a maior receita vendendo laranjas?");
        Double maiorReceitaLaranja = Double.MIN_VALUE;
        String nomeMaiorReceitaLaranja = " ";

        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i].receitaLaranja() > maiorReceitaLaranja){
                maiorReceitaLaranja = vetor[i].receitaLaranja();
                nomeMaiorReceitaLaranja = vetor[i].nomeMercado;
            }
        }
        System.out.println(nomeMaiorReceitaLaranja);

        //c) Qual das lojas teve a maior receita?
        System.out.println("c) Qual das lojas teve a maior receita?");
        Double maiorReceitaTotal = Double.MIN_VALUE;
        String nomeMaiorReceitaTotal = " ";

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].receitaTotal() > maiorReceitaTotal){
                maiorReceitaTotal = vetor[i].receitaTotal();
                nomeMaiorReceitaTotal = vetor[i].nomeMercado;
            }
        }
        System.out.println(nomeMaiorReceitaTotal);

        //d) Qual das lojas teve a menor receita?
        System.out.println("d) Qual das lojas teve a menor receita?");
        Double menorReceitaTotal = Double.MAX_VALUE;
        String nomeMenorReceitaTotal = " ";

        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i].receitaTotal() < menorReceitaTotal){
                menorReceitaTotal = vetor[i].receitaTotal();
                nomeMenorReceitaTotal = vetor[i].nomeMercado;
            }
        }
        System.out.println(nomeMenorReceitaTotal);

        //e) Qual das lojas ficou no "meio" em termos de receita?
        System.out.println("e) Qual das lojas ficou no 'meio' em termos de receita?");
        double maiorReceitaTotal2 = 0;
        double receitaMeio = 0;
        String nomeReceitaMeio = " ";

        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i].receitaTotal() > maiorReceitaTotal2){
                maiorReceitaTotal2 = vetor[i].receitaTotal();
            }
        }

        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i].receitaTotal() > receitaMeio && vetor[i].receitaTotal() != maiorReceitaTotal2){
                receitaMeio = vetor[i].receitaTotal();
                nomeReceitaMeio = vetor[i].nomeMercado;
            }
        }
        System.out.println(nomeReceitaMeio); 

        //f) Juntando as 3 lojas, a franquia teve uma receita maior vendendo maçãs ou laranjas?
        System.out.println("f) Juntando as 3 lojas, a franquia teve uma receita maior vendendo maçãs ou laranjas?");
        double receitaLaranjas = 0;
        double receitaMacas = 0;

        for (int i = 0; i < vetor.length; i++) {
            receitaLaranjas += vetor[i].receitaLaranja();
            receitaMacas += vetor[i].receitaMaca();
        }

        if(receitaLaranjas > receitaMacas){
            System.out.println("Laranjas");
        } else if(receitaMacas > receitaLaranjas){
            System.out.println("Maçãs");
        } else{
            System.out.println("Maçãs e Laranjas");
        }
    }
}
