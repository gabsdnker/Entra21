//Em orientação a objetos
  /* public class Aluno{
        private String nome;
        private int idade;
        private double media;
  
        public Aluno(String nome, int idade, double media){
            setNome(nome);
            setIdade(idade);
            setMedia(media);
        }
  }

public class SalaDeAula{
    private List<Aluno> listaAlunos;

    public Aluno acharAlunoMaiorMedia(){
        double maiorMedia = 0;
        Aluno alunoMaiorMedia = null;
        for(Aluno a : listaAlunos){
            if(a.getMedia() > maiorMedia){
                maiorMedia = a.getMedia();
                alunoMaiorMedia = a;
            }
        }
        return alunoMaiorMedia;
    }

    public SalaDeAula(){
        listaAlunos = new ArrayList<>();
    }
    public void adicionarAlunos(Alunos a ){
        listaAlunos.add(a);
    }
    public  List<Aluno> listarAlunos(){
        return listaAlunos;
    }        
}

  public class Main{
    public static void main(String[] args){
        Aluno a1 = new Aluno("Enzo", 15, 7.7);
        Aluno a2 = new Aluno("Gabriel", 16, 8.9);
        Aluno a3 = new Aluno("Maria", 14, 9.9);

        SalaDeAula s1 = new SalaDeAula();
        s1.adicionarAlunos(a1);
        s1.adicionarAlunos(a2);
        s1.adicionarAlunos(a3);

        System.out.println(s1.listarAlunos)
    }
    
  }
   */

//For Iterable
/* for each, simplifica a iteração sobre coleções, eliminando a necessidade de um contador explícito
 * Tem 2 seções:
 * Criação da variável
 * Qual será a lista a ser iterada
 * 
 * public void exibirAlunos(){
 *      for(Aluno a : listaAlunos){
 *          System.out.println(a);
 *      }
 * }
 */
