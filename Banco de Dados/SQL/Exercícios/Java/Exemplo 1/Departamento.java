public class Departamento {
    private int cdDepartamento;
    private String nomeDepartamento;

    public Departamento(){

    }

    public Departamento(String nomeDepartamento){
        setNomeDepartamento(nomeDepartamento);
    }

    public Departamento(int cdDepartamento, String nomeDepartamento) {
        setCdDepartamento(cdDepartamento);
        setNomeDepartamento(nomeDepartamento);
    }

    public int getDepartamento() {
        return cdDepartamento;
    }

    public String getNomeDepartamento() {
        return nomeDepartamento;
    }

    public int getCdDepartamento() {
        return cdDepartamento;
    }

    public void setCdDepartamento(int cdDepartamento) {
        if (cdDepartamento <= 0) {
        throw new IllegalArgumentException("Código do departamento deve ser maior que zero.");
        }
        this.cdDepartamento = cdDepartamento;
    }

    public void setNomeDepartamento(String nomeDepartamento) {
        if (nomeDepartamento == null || nomeDepartamento.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do departamento não pode ser nulo ou vazio.");
        }
        this.nomeDepartamento = nomeDepartamento;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
