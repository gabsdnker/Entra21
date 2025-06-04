
public class Funcionario {
    private int funcionario;
    private String nome;
    private String email;
    private double salario;
    private Integer cdDepartamento;

    public Funcionario() {
    }

    public Funcionario(String nome, String email, double salario, Integer cdDepartamento) {
        setNome(nome);
        setEmail(email);
        setSalario(salario);
        setCdDepartamento(cdDepartamento);
    }

    public Funcionario(int funcionario, String nome, String email, double salario, Integer cdDepartamento) {
        setFuncionario(funcionario);
        setEmail(email);
        setNome(nome);
        setSalario(salario);
        setCdDepartamento(cdDepartamento);

    }

    public String getEmail() {
        return email;
    }
    public int getFuncionario() {
        return funcionario;
    }
    public String getNome() {
        return nome;
    }
    public double getSalario() {
        return salario;
    }

    public Integer getCdDepartamento() {
        return cdDepartamento;
    }


    public void setEmail(String email) {
        this.email = email;
    }
    public void setFuncionario(int funcionario) {
        this.funcionario = funcionario;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setCdDepartamento(Integer cdDepartamento) {
        this.cdDepartamento = cdDepartamento;
    }

    @Override
    public String toString() {
    	return funcionario + " - " + nome;
    }

}
