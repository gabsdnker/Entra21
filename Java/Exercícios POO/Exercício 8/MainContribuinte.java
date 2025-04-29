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
        contribuintes[5] = new Contribuinte("Gustavo Franke", "154.699.458-23", "RS", 15000.0);

    }
}
