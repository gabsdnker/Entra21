//Autora: Gabrielli Danker

//CLasses:
//Estruturas ou moldes que definem a forma e comportamento de um objeto

//Classe Veiculo
/* (atributos de classe)
   -Modelo
   -Comprimento
   -Passageiros
   -Velocidade Maxima
   -Cor  */

/*public class Veiculo{
    String modelo;
    double comprimento;
    int passageiros;
    int velMax;
    String cor;
}
public class Main {
    public static void main(String[] args) {
        Veiculo civic = new Veiculo(); //Criação de um objeto
        Veiculo sandero = new Veiculo(); //Classe objeto = new classe();
        Veiculo kwid = new Veiculo(); 

        civic.modelo = "Civic"; //Objeto.atributo = informação
        civic.comprimento = 4.7;
        civic.passageiros = 5;
        civic.velMax = 200;
        civic.cor = "Preto";

        System.out.println( civic.modelo + "Velocidade máxima: " + civic.velMax + " km/h");
    }
}*/

//Métodos em classes

/*public class Quadrilatero{
    double largura;
    double altura;

    public double calcularArea(){
        return largura * altura;
    }
}

public class Main {
    public static void main(String[] args){
        Quadrilatero q1 = new Quadrilatero();
        q1.altura = 2;
        q1.largura = 3;
    
        System.out.println(q1.calcularArea());
    }
}*/

//Método Construtor

//Terá o mesmo nome da classe
//Toda classe tem um construtor padrão
//Podem ser criados vários constriturores 

/*public class Veiculo{
    //atributos de classe
    String modelo;
    double comprimento;
    int passageiros;
    int velMax;
    String cor;
}*/

//Contrutor 
/*public Veiculo(String modelo, double comprimento, int passageiros, int velMax, String cor){
    this.modelo = modelo;
    this.comprimento = comprimento;
    this.passageiros = passageiros;
    this.velMax = velMax;
    this.cor = cor;
}

public class Main {
    public static void main(String[] args){
    Veiculo civic = new Veiculo("Civic", 10.6, 5, 200, "Preto");
    }
}*/

//SET = definir valor/ válidação
//GET= pegar valor

//Método Exceção
/*int vetor[] = new int[5];

vetor[5] = 20;*/

/*Nomeclatura Java
 * Uma exceção é lançada 
 * 
 * 
 */
