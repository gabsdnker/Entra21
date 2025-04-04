
public class Exercicio4 {

	public static void main(String[] args) {
		/*Determinar:
		a) Qual é a média dos preços das casas?
		b) Quanto custa a menor casa?
		c) Quantos quartos tem a casa mais cara?
		d) Qual a diferença de tamanho da casa com o maior número de quartos para a casa com o 
		menor número de quartos?
		e) Qual a média do tamanho das casas que custam mais de 300.000 mil? */
		
		int matriz[][] = {
				 {2104, 3, 399900},
				 {1600, 3, 329900},
				 {2400, 3, 369000},
				 {1416, 2, 232000},
				 {3000, 4, 539900},
				 {1985, 4, 299900},
				 {1534, 3, 314900},
				 {1427, 3, 199000},
				 {1380, 3, 212000},
				 {1494, 3, 242500},
				 {1940, 4, 240000},
				 {2000, 3, 347000},
				 {1890, 3, 330000},
				 {4478, 5, 699900},
				 {1268, 3, 259900}
		};
		//A primeira coluna é o tamanho da casa
		//A segunda coluna é a quantidade de quartos
		//A terceira coluna é o preço
		
		//Soma de preços
		int somaPreco = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			somaPreco += matriz[i][2];
		}
		
		//Media de preços
		int mediaPreco = somaPreco/ matriz.length;
		System.out.println("A média dos preços das casas é: R$ " + mediaPreco + ",00");
		
		//Menor preços
		int menorPreco = matriz[0][2];
		
		for(int i = 0; i < matriz.length; i ++) {
			if(matriz[i][2] < menorPreco) {
				menorPreco = matriz[i][2];
			}
		}
		System.out.println("A menor casa custa: R$ " + menorPreco + ",00");
		
		//Quantos quartos tem a casa mais cara
		int maiorPreco = matriz[0][2];
		int quartosCasa = matriz[0][1];
		
		for(int i = 1; i < matriz.length; i++) {
			if (matriz[i][2] > maiorPreco){
				maiorPreco = matriz[i][2];
				quartosCasa = matriz[i][1];
			}
		}
		System.out.println("A casa mais cara tem " + quartosCasa + " quartos");
		
		//Diferença de tamanho da casa mais quartos com a casa menos quartos
		int menorTamanho = matriz[0][0];
		int maiorTamanho = matriz[0][0];
		int maiorQuarto = matriz[0][1];
		int menorQuarto = matriz[0][1];
		
		for(int i = 1; i < matriz.length; i ++) {
			if (matriz[i][1] < menorQuarto) {
				menorQuarto = matriz[i][1];
				menorTamanho = matriz[i][0];
			} 
			if (matriz[i][1] > maiorQuarto) {
				maiorQuarto = matriz[i][1];
				maiorTamanho = matriz[i][0];
			}
			
		}
		int diferencaTamanho = maiorTamanho - menorTamanho;
		System.out.println("A diferença de tamanho da casa maior e da casa menor é " + diferencaTamanho);
		
		//Media tamanho que vale mais que 300.000mil
		int mediaTamanho = 0;
		int valorMaior = matriz[0][2];
		int precoCasa = matriz[0][2];
		
		for(int i = 0; i < matriz.length; i ++) {
			if(precoCasa > 300000) {
				
			}
		}
		
	}

}
