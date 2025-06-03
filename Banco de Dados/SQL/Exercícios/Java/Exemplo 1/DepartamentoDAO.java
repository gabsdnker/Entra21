
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DepartamentoDAO {
    
    //Create
    public void inserirDepartamento(Departamento d) throws SQLException{
        String sql = "INSERT INTO departamento (nm_depertamento) VALUES (?)";
        try(Connection con = Conexao.conectar();
            PreparedStatement ps = con.prepareStatement(sql)){
                ps.setString(1, d.getNomeDepartamento());
                ps.executeUpdate();
            }
    }

    //Read
    public List<Departamento> listarDepartamentos() throws SQLException{
        List<Departamento> listaDepartamentos = new ArrayList<>();
        String sql = "SELECT * FROM departamento";
        try(Connection con = Conexao.conectar();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql)){
                
                while(rs.next()){
                    Departamento d = new Departamento();
                    d.setCdDepartamento(rs.getInt("cd_departamento"));
                    d.setNomeDepartamento(rs.getString("nm_depertamento"));
                    listaDepartamentos.add(d);
                }
            }
        return listaDepartamentos;
    }

    //Update
    //Delete
}
