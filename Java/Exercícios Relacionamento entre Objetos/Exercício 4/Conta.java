//Autora: Gabrielli Danker

public class Conta {
    private String nomeTitular;
    private double saldo;

    //Contrutor
    public Conta(String nomeTitular, double saldo){
        setNomeTitular(nomeTitular);
        setSaldo(saldo);
    }
    //Getter
   public String getNomeTitular(){
    return nomeTitular;
   }

   public double getSaldo(){
    return saldo;
   }
   
   //Setter
   public void setNomeTitular(String nomeTitular){
    if(nomeTitular != null && !nomeTitular.isEmpty()){
        this.nomeTitular = nomeTitular;
    } else{
        throw new IllegalArgumentException("Digite um nome que não seja vazio!");
    }
   }

   public void setSaldo(double saldo){
    this.saldo = saldo;
   }

   //Sacar dinheiro
   public void sacarDinheiro(double quantidade){
    if(quantidade <= 0){
        throw new IllegalArgumentException("Quantidade inválida");
    }
    if(quantidade > saldo){
        throw new IllegalArgumentException("Quantidade maior que o seu saldo");
    } 
    saldo -= quantidade;
   }

   //Depositar 
   public void depositarDinheiro(double quantidade){
    if(quantidade <= 0){
        throw new IllegalArgumentException("Quantidade inválida");
    }
    saldo += quantidade;
   }

   //Transferir
   public void tranferirDinheiro(Conta destinatario, double quantidade){
    if(quantidade <= 0){
        throw new IllegalArgumentException("Quantidade inválida");
    }

    if(quantidade > saldo){
        throw new IllegalArgumentException("Quantidade maior que o seu saldo");
    }
    saldo -= quantidade;
    destinatario.setSaldo(destinatario.getSaldo()+ quantidade);
   }

   //ToString
   @Override
   public String toString(){
    return "Conta [nome= " + nomeTitular + "], [saldo= " + saldo +"]";
   }
}
