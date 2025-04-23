//Autora: Gabrielli Danker

public class MainEmpregado {
    public static void main(String[] args) {
        Empregado funcionario = new Empregado();
        funcionario.identificacao = "156396746-52";
        funcionario.nome = "Gabrielli";
        funcionario.sobrenome = "Danker";
        funcionario.salario = 3000.00;

        System.out.println("Nome completo: " + funcionario.nomeCompleto());
        System.out.println("Salário anual: " + funcionario.salarioAnual());
        System.out.println("Salário mensal com aumento: " + funcionario.aumentarSalario(10));
    }
}
