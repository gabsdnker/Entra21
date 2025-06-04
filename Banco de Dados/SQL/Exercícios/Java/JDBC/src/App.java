
import java.sql.SQLException;

public class App {
    public static void main(String[] args) {
        DepartamentoDAO depDAO = new DepartamentoDAO();

        try {
        	//depDAO.inserirDepartamento(new Departamento("Desenvolvimento"));
             //depDAO.inserirDepartamento(new Departamento("Recursos Humanos"));
        	//depDAO.inserirDepartamento(new Departamento("Limpeza"));
        	
        	//depDAO.atualizarDepartamento(new Departamento(3, "Analista"));
        	
        	//depDAO.deletarDepartamento(2);
        	
        	System.out.println(depDAO.listarDepartamentos());
        	
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
}
