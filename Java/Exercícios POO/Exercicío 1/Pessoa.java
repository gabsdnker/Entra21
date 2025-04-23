//Autora: Gabrielli Danker
/*Em uma classe denominada Pessoa, deseja-se manter o nome, sexo, data de nascimento e 
estado civil de uma pessoa.
O sexo deve ser definido como um caractere.
A data deve ser definida como String.
Crie 2 objetos de Pessoa e atribua valores a esses objetos */

public class Pessoa {
    String nome;
    char genero;
    String dataNascimento;
    String estadoCivil;
}
public class Main {
    public static void main(String[] args) {
        Pessoa alexandre = new Pessoa();
        Pessoa gabrielli = new Pessoa();

        alexandre.nome = "Alexandre";
        alexandre.genero = 'M';
        alexandre.dataNascimento = "27/08/2001";
        alexandre.estadoCivil = "Casado";

        gabrielli.nome = "Gabrielli";
        gabrielli.genero  = 'F';
        gabrielli.dataNascimento = "24/02/2004";
        gabrielli.estadoCivil = "Divorciada";

        System.out.println("Nome: " + alexandre.nome + "\nGênero: " + alexandre.genero + "\nData de nascimento: " + alexandre.dataNascimento + "\nEstado Civil: " + alexandre.estadoCivil);
        System.out.println("Nome: " + gabrielli.nome + "\nGênero: " + gabrielli.genero + "\nData de nascimento: " + gabrielli.dataNascimento + "\nEstado Civil: " + gabrielli.estadoCivil);

    }
}