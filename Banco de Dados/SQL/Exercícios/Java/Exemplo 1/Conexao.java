
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao  {
    private static final String URL = "jdbc:mysql://localhost:3306/empresa";
    private static final String USUARIO = "root";
    private static final String SENHA = "@1@senac2021";

    public static Connection conectar() throws SQLException {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver JDBC não encontrado!");
            e.printStackTrace();
        }

        return DriverManager.getConnection(URL, USUARIO, SENHA);
    }
}
