public class MainPessoa {
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
