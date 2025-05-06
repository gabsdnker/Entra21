//Autora: Gabrielli Danker

/*Crie 5 objetos da classe Contribuinte e coloque-os em um vetor.
Calcule:
a) Quem mais paga imposto.
b) Quem menos paga imposto.
c) Qual o total de imposto pago entre os 5 contribuintes?*/

public class MainContribuinte {
    public static void main(String[] args) {
        Contribuinte c1 = new Contribuinte("Henrique", "11111111111", "sc", 2000);
		Contribuinte c2 = new Contribuinte("Jorge", "11111111111", "sc", 5000);
		Contribuinte c3 = new Contribuinte("Carlos", "11111111111", "sc", 10000);
		Contribuinte c4 = new Contribuinte("Gustavo", "11111111111", "sc", 26000);
		Contribuinte c5 = new Contribuinte("Maria", "11111111111", "sc", 40000);

		Contribuinte vetor[] = { c1, c2, c3, c4, c5 };

		// Quem mais paga imposto

		double maiorImposto = 0;
		Contribuinte contMaisImposto = null;

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].calcularImposto() > maiorImposto) {
				maiorImposto = vetor[i].calcularImposto();
				contMaisImposto = vetor[i];
			}
		}

		System.out.println(contMaisImposto);

		// Quem menos paga imposto

		double menorImposto = Double.MAX_VALUE;
		Contribuinte contMenosImposto = null;

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].calcularImposto() < menorImposto) {
				menorImposto = vetor[i].calcularImposto();
				contMenosImposto = vetor[i];
			}
		}

		System.out.println(contMenosImposto);

		// Qual o total de imposto pago entre os 5 contribuintes?

		double totalImposto = 0;
		for (int i = 0; i < vetor.length; i++) {
			totalImposto += vetor[i].calcularImposto();
		}

		System.out.println("O leão está muito feliz com R$" + totalImposto);
    }
}
