//Autora: Gabrielli Danker

/*Crie 5 objetos da classe Contribuinte e coloque-os em um vetor.
Calcule:
a) Quem mais paga imposto.
b) Quem menos paga imposto.
c) Qual o total de imposto pago entre os 5 contribuintes?*/

public class MainContribuinte {
    public static void main(String[] args) {
        Contribuinte[] contribuintes = new Contribuinte[5];

        contribuintes[0] = new Contribuinte("Gabrielli Danker", "156.846.953-54", "SC", 50000.0);
        contribuintes[1]= new Contribuinte("Alexandre Degang", "156.956.456-56", "PR", 10000.0);
        contribuintes[2] = new Contribuinte("Meri Kuster", "144.569.966-25", "RS", 35000.0);
        contribuintes[3] = new Contribuinte("Sarah Danker", "365.985.423-56", "SC", 3000.0);
        contribuintes[4] = new Contribuinte("Aline Degang", "145.956.652-26", "PR", 25000.0);

        //a) Quem paga mais imposto?
        System.out.println("a) Quem paga mais imposto?");
        Double maisPaga = Double.MIN_VALUE;
        String nomeMaisPaga = " ";

        for (int i = 0; i < contribuintes.length; i++) {
            double imposto = contribuintes[i].impostoPagar();
            if(contribuintes[i].impostoPagar() > maisPaga){
                maisPaga = imposto;
                nomeMaisPaga = contribuintes[i].nome;
            }
        }
        System.out.println(nomeMaisPaga);

        //b) Quem paga menos imposto?
        System.out.println("b) Quem paga menos imposto?");
        Double menosPaga = Double.MAX_VALUE;
        String nomeMenosPaga = " ";

        for (int i = 0; i < contribuintes.length; i++) {
            double imposto = contribuintes[i].impostoPagar();
            if(contribuintes[i].impostoPagar() < menosPaga){
                menosPaga = imposto;
                nomeMenosPaga = contribuintes[i].nome;
            }
        }
        System.out.println(nomeMenosPaga);

        //c) Qual o total de imposto pago entre os 5 contribuites?
        System.out.println("c) Qual o total de imposto pago entre os 5 contribuites?");
        double totalImposto = 0;

        for (int i = 0; i < contribuintes.length; i++) {
            double imposto = contribuintes[i].impostoPagar();
            totalImposto += imposto;
        }
        System.out.println(totalImposto);
    }
}
