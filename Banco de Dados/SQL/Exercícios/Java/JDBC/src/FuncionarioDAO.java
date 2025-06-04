import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioDAO {
	
	//Create
	public void inserirFuncionario(Funcionario f) throws SQLException {
		String sql = "INSERT INTO funcionario (nome, email, salario, cd_departamento) VALUES (?, ?, ?, ?)";
		try (Connection con = Conexao.conectar();
			 PreparedStatement ps = con.prepareStatement(sql)){
			ps.setString(1, f.getNome());
			ps.setString(2, f.getEmail());
			ps.setDouble(3, f.getSalario());
			
			if (f.getCdDepartamento() != null) {
				ps.setInt(4, f.getCdDepartamento());
			} else {
				ps.setNull(4, Types.INTEGER);
			}
			
			ps.executeUpdate();

		}
	}
	
	//Read
    public List<Funcionario> listarFuncionarios() throws SQLException{
    	List<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();
    	String sql = "SELECT * FROM funcionario";
    	try(Connection con = Conexao.conectar();
    		Statement st = con.createStatement();
    			ResultSet rs = st.executeQuery(sql)){
    		
    		while(rs.next()) {
    			Funcionario f = new Funcionario();
    			f.setFuncionario(rs.getInt("cd_funcionario"));
    			f.setNome(rs.getString("nome"));
    			f.setEmail(rs.getString("email"));
    			f.setSalario(rs.getDouble("salario"));
    			
    			int cdDept = rs.getInt("cd_departamento");
    			
    			if (rs.wasNull()) {
    				f.setCdDepartamento(null);
    			} else {
    				f.setCdDepartamento(cdDept);
    			}
    		
    			listaFuncionarios.add(f);
    		}
    	}
    	return listaFuncionarios;
    }
    
	//Update
    public void atualizarFuncionarios(Funcionario f) throws SQLException{
    	String sql = "UPDATE funcionario SET nome = ?, email = ?, salario = ?, cd_departamento = ? WHERE cd_funcionario = ?";
    	try(Connection con = Conexao.conectar();
    		PreparedStatement ps = con.prepareStatement(sql)){
    		ps.setString(1, f.getNome());
    		ps.setString(2, f.getEmail());
    		ps.setDouble(3, f.getSalario());

			if (f.getCdDepartamento() != null) {
				 ps.setInt(4, f.getCdDepartamento());
			 } else {
				 ps.setNull(4, Types.INTEGER);
			 }
			
			ps.setInt(5, f.getFuncionario());

    		ps.executeUpdate();
    	}
    }
    
	//Delete
}
