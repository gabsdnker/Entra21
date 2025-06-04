
import java.sql.SQLException;

public class App {
    public static void main(String[] args) {
        DepartamentoDAO depDAO = new DepartamentoDAO();

        try {
            depDAO.inserirDepartamento(new Departamento("Desenvolvimento"));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
}
