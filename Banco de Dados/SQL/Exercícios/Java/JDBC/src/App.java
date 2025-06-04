
import java.sql.SQLException;

public class App {
    public static void main(String[] args) {
        DepartamentoDAO depDAO = new DepartamentoDAO();
        FuncionarioDAO funDAO = new FuncionarioDAO();

        try {
        	//depDAO.inserirDepartamento(new Departamento("Desenvolvimento"));
            //depDAO.inserirDepartamento(new Departamento("Recursos Humanos"));
        	//depDAO.inserirDepartamento(new Departamento("Limpeza"));
        	
        	//depDAO.atualizarDepartamento(new Departamento(3, "Analista"));
        	
        	//depDAO.deletarDepartamento(2);
        	
        	//System.out.println(depDAO.listarDepartamentos());
        	
        	//funDAO.inserirFuncionario(new Funcionario("José", "jose@email.com", 4000, 1));
        	//funDAO.inserirFuncionario(new Funcionario("Joana", "joana@email.com", 2000, 3));
        	//funDAO.inserirFuncionario(new Funcionario("Alexandre", "alexandre@email.com", 5000, 1));
        	
        	//funDAO.atualizarFuncionarios(new Funcionario(1, "Marcos", "marcos@gmail.com", 4500, 4));
        	
        	System.out.println(funDAO.listarFuncionarios());
        	
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
}
