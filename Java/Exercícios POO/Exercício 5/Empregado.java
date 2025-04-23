//Autora: Gabrielli Danker
/*Crie uma classe Empregado que terá como atributos:
Identificação
Nome
Sobrenome
Salário (mensal)
Crie métodos para:
Saber o salário anual do empregado
Saber o nome completo do empregado
Modificar o salário, o parâmetro do método deve ser o percentual de aumento*/

public class Empregado {
    String identificacao;
    String nome;
    String sobrenome;
    double salario;

    public double salarioAnual(){
        return salario * 12;
    }

    public String nomeCompleto(){
        return nome + " " + sobrenome;
    }

    public double aumentarSalario( int percentual){
        if (percentual > 0){
            salario += salario * (percentual /100.0);
        }
        return salario;
    }
    
    public static void main(String[] args) {
        Empregado funcionario = new Empregado();
        funcionario.identificacao = "156396746-52";
        funcionario.nome = "Gabrielli";
        funcionario.sobrenome = "Danker";
        funcionario.salario = 3000.00;

        funcionario.aumentarSalario(10);

        System.out.println("Nome completo: " + funcionario.nomeCompleto());
        System.out.println("Salário anual: " + funcionario.salarioAnual());
        System.out.println("Salário mensal com aumento: " + funcionario.salario);
    }

}