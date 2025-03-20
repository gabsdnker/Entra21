//Autor: Gabrielli Danker
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		/*
		 Faça um programa que funciona como um conversor universal.
		Primeiro o usuário escolhe se ele quer converter: temperatura, peso, comprimento ou volume.
		Depois, ele escolhe qual a unidade do valor que ele deseja converter
		Após isso, o usuário entra com o valor desejado
		Depois, ele escolhe para qual ele quer converter.
		As opções de temperatura, são: celsius, fahrenheit e kelvin.
		As opções de peso são: quilos, libras e onças
		As opções de comprimento são: metros, pés e polegadas
		As opções de volume são: litros, galão líquido e onças líquidas
		 */
		
		System.out.println("Conversor Universal:");
		
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");
		DecimalFormat def = new DecimalFormat("0.00");
		
		System.out.println("Você que converter o que?\n 1- Temperatura\n 2- Peso\n 3- Comprimento\n 4- Volume");
		int conversor = input.nextInt();
		
		if (conversor == 1) {
			//As opções de temperatura, são: celsius, fahrenheit e kelvin.
			
			System.out.println("Escolha a opção de qual temperatura para qual você quer converter:\n 1- Celsius\n 2- Fahrenheit\n 3- Kelvin");
			int temperatura = input.nextInt();
			
			if (temperatura == 1) {
				//celsius
				System.out.println("Você quer converter para qual as opções a seguir:\n 1- Fahrenheit\n 2- Kelvin ");
				int converterTemp = input.nextInt();
				
				if (converterTemp == 1) {
					//celsius p/ fahrenheit
					System.out.println("Digite a temperatura em Celsius:");
					double c = input.nextDouble();
					
					double CF = c * 1.8 + 32;
					
					System.out.println("Conversão: " + df.format(CF) + " F");
					
				} else if (converterTemp == 2) {
					//celsius p/ kelvin 
					System.out.println("Digite a temperatura em Celsius:");
					double c = input.nextDouble();
					
					double CK = c + 273.15;
					
					System.out.println("Conversão: " + df.format(CK) + " K");
					
				} else {
					System.out.println("Opção inválida!");
				}
			} else if (temperatura == 2) {
				//fahrenheit
				System.out.println("Você quer converter para qual as opções a seguir:\n 1- Celsius\n 2- Kelvin ");
				int converterTemp = input.nextInt();
				
				if (converterTemp == 1) {
					//fahrenheit p/ celsius
					System.out.println("Digite a temperatura em Fahrenheit:");
					double f = input.nextDouble();
					
					double FC = (f - 32)/1.8;
					
					System.out.println("Conversão: " + df.format(FC) + " °C");
					
				} else if (converterTemp == 2) {
					//fahrenheit p/ kelvin 
					System.out.println("Digite a temperatura em Fahrenheit:");
					double f = input.nextDouble();
					
					double FK = (f - 32)* 0.555556 + 273.15;
					
					System.out.println("Conversão: " + df.format(FK) + " K");
					
				} else {
					System.out.println("Opção inválida!");
				}
				
			} else if (temperatura == 3) {
				//kelvin
				System.out.println("Você quer converter para qual as opções a seguir:\n 1- Celsius\n 2- Fahrenheit");
				int converterTemp = input.nextInt();
				
				if (converterTemp == 1) {
					//kelvin p/ celsius 
					System.out.println("Digite a temperatura em Kelvin:");
					double k = input.nextDouble();
					
					double KC = k -273.15 ;
					
					System.out.println("Conversão: " + df.format(KC) + " °C");
					
				} else if (converterTemp == 2) {
					//kelvin p/ fahreinheit 
					System.out.println("Digite a temperatura em Kelvin:");
					double k = input.nextDouble();
					
					double KF = (k - 273.15) * 1.8 + 32;
					
					System.out.println("Conversão: " + df.format(KF) + " F");
					
				} else {
					System.out.println("Opção inválida!");
				}
				
			} else {
				System.out.println("Essa temperatura está inválida!");
			}
			
	} else if (conversor == 2) { 
		//As opções de peso são: quilos, libras e onças
			
			System.out.println("Escolha a opção de qual peso para qual você quer converter:\n 1- Quilos\n 2- Libras\n 3- Onças");
			int peso = input.nextInt();
			
			if (peso == 1) {
				//quilos
				
				System.out.println("Você quer converter para qual as opções a seguir:\n 1- Libras\n 2- Onças");
				int converterPeso = input.nextInt();
				
				if (converterPeso == 1) {
					//quilos p/ libras
					System.out.println("Digite os quilos: ");
					double q = input.nextDouble();
					
					double QL = q * 2.204623;
					
					System.out.println("Conversão: " + def.format(QL) + " lb");
				} else if (converterPeso == 2) {
					//quilos p/ onças
					System.out.println("Digite os quilos: ");
					double q = input.nextDouble();
					
					double QO = q * 35.274;
					
					System.out.println("Conversão: " + def.format(QO) + " oz");
				} else {
					System.out.println("Opção inválida!");
				}
				
			} else if (peso == 2) {
				//libras
				System.out.println("Você quer converter para qual as opções a seguir:\n 1- Quilos\n 2- Onças ");
				int converterPeso = input.nextInt();
				
				if (converterPeso == 1) {
					//libras p/ quilos
					System.out.println("Digite os libras: ");
					double l = input.nextDouble();
				
					double LQ = l * 0.45359237;
					
					System.out.println("Conversão: " + def.format(LQ) + " kg");
				} else if (converterPeso == 2) {
					//libras p/ onças
					System.out.println("Digite os libras: ");
					double l = input.nextDouble();
					
					double LO = l * 16;
					
					System.out.println("Conversão: " + def.format(LO) + " oz");
				} else {
					System.out.println("Opção inválida!");
				}
				
			} else if (peso ==3) {
				//onças
				System.out.println("Você quer converter para qual as opções a seguir:\n 1- Quilos\n 2- Libras");
				int converterPeso = input.nextInt();
				
				if (converterPeso == 1) {
					//onças p/ quilos
					System.out.println("Digite as onças: ");
					double o = input.nextDouble();
				
					double OQ = o / 35.27;
					
					System.out.println("Conversão: " + def.format(OQ) + " kg");
				} else if (converterPeso == 2) {
					//onças p/ libras
					System.out.println("Digite as onças: ");
					double o = input.nextDouble();
					
					double OL = o / 16;
					
					System.out.println("Conversão: " + def.format(OL) + " lb");
				} else {
					System.out.println("Opção inválida!");
				}
				
			} else {
				System.out.println("Opção inválida!");
			}
			
			
		} else if (conversor == 3) {
			//As opções de comprimento são: metros, pés e polegadas			
			System.out.println("Escolha a opção de qual comprimento para qual você quer converter:\n 1- Metros\n 2- Pés\n 3- Polegadas");
			int comprimento = input.nextInt();
			
			if (comprimento == 1) {
				//metros
				System.out.println("Você quer converter para qual as opções a seguir:\n 1- Pés\n 2- Polegadas");
				int converterComp = input.nextInt();
				
				if (converterComp == 1) {
					//metros p/ pés
					System.out.println("Digite os metros: ");
					double m = input.nextDouble();
					
					double MP = m * 3.28084;
					
					System.out.println("Conversão: " + def.format(MP) + " ft");
					
				} else if (converterComp == 2) {
					//metros p/ polegadas
					System.out.println("Digite os metros: ");
					double m = input.nextDouble();
					
					double MPo = m * 39.37008;
					
					System.out.println("Conversão: " + def.format(MPo) + " in");
					
				} else {
					System.out.println("Opção inválida!");
				}
				
			} else if (comprimento == 2) {
				//pés
				System.out.println("Você quer converter para qual as opções a seguir:\n 1- Metros\n 2- Polegadas");
				int converterComp = input.nextInt();
				
				if (converterComp == 1) {
					//pés p/ metros
					System.out.println("Digite os pés: ");
					double pe = input.nextDouble();
					
					double PM = pe * 0.3048;
					
					System.out.println("Conversão: " + def.format(PM) + " m");
					
				} else if (converterComp == 2) {
					//pés p/ polegadas
					System.out.println("Digite os pés: ");
					double pe = input.nextDouble();
					
					double PPo = pe * 12;
					
					System.out.println("Conversão: " + def.format(PPo) + " in");
					
				} else {
					System.out.println("Opção inválida!");
				}
			} else if (comprimento == 3) {
				//polegadas
				System.out.println("Você quer converter para qual as opções a seguir:\n 1- Metros \n 2- Pés");
				int converterComp = input.nextInt();
				
				if (converterComp == 1) {
					//polegadas p/ metros
					System.out.println("Digite as polegadas: ");
					double po = input.nextDouble();
					
					double PoM = po * 0.0254;
					
					System.out.println("Conversão: " + def.format(PoM) + " m");
					
				} else if (converterComp == 2) {
					//polegadas p/ pés
					System.out.println("Digite as polegadas: ");
					double po = input.nextDouble();
					
					double PoP = po * 0.08333333;
					
					System.out.println("Conversão: " + def.format(PoP) + " ft");
					
				} else {
					System.out.println("Opção inválida!");
				}
				
			} else {
				System.out.println("Opção inválida!");
			}
			
		} else if (conversor == 4) {
			//As opções de volume são: litros, galão líquido e onças líquidas		
			System.out.println("Escolha a opção de qual volume para qual você quer converter:\n 1- Litros\n 2- Galão\n 3- Onças líquidas");
			int volume = input.nextInt();
			
			if (volume == 1) {
				//litros
				System.out.println("Você quer converter para qual as opções a seguir:\n 1- Galão\n 2- Onças líquidas");
				int converterVol = input.nextInt();
				
				if (converterVol == 1) {
					//litros p/ galão
					System.out.println("Digite os litros: ");
					double li = input.nextDouble();
					
					double LG = li * 0.264172;
					
					System.out.println("Conversão: " + def.format(LG) + " gal");
					
				} else if (converterVol == 2) {
					//litros p/ onças líquidas
					System.out.println("Digite os litros: ");
					double li = input.nextDouble();
					
					double LOL = li * 33.814;
					
					System.out.println("Conversão: " + def.format(LOL) + " oz");
					
				} else {
					System.out.println("Opção inválida!");
				}
			} else if (volume == 2) {
				//galão
				System.out.println("Você quer converter para qual as opções a seguir:\n 1- Litros\n 2- Onças líquidas");
				int converterVol = input.nextInt();
				
				if (converterVol == 1) {
					//galão p/ litros VERIFICAR G= 1 L= 4.55
					System.out.println("Digite os galões: ");
					double ga = input.nextDouble();
					
					double GL = ga / 0.26417;
					
					System.out.println("Conversão: " + def.format(GL) + " L");
					
				} else if (converterVol ==2) {
					//galão p/ onças liquidas 
					System.out.println("Digite os galões: ");
					double ga = input.nextDouble();
					
					double GOL = ga * 128;
					
					System.out.println("Conversão: " + def.format(GOL) + " oz");
					
				} else {
					System.out.println("Opção inválida!");
				}
			} else if (volume == 3) {
				//onças líquidas
				System.out.println("Você quer converter para qual as opções a seguir:\n 1- Litros\n 2- Galão");
				int converterVol = input.nextInt();
				
				if (converterVol == 1) {
					//onças liquidas p/ litros
					System.out.println("Digite as onças liquidas: ");
					double ol = input.nextDouble();
					
					double OLL = ol / 33.814;
					
					System.out.println("Conversão: " + def.format(OLL) + " L");				
					
				} else if (converterVol == 2) {
					//onças liquidas p/ galao
					System.out.println("Digite as onças liquidas: ");
					double ol = input.nextDouble();
					
					double OLG = ol / 128;
					
					System.out.println("Conversão: " + def.format(OLG) + " gal");	
							
				} else {
					System.out.println("Opção inválida!");
				}
			} else {
				System.out.println("Opção inválida!");
			}
			
		} else {
			System.out.println("Opção inválida!");
		}

	}

}
