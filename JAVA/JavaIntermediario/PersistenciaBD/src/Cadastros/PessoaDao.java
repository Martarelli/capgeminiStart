package Cadastros;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PessoaDao extends Dao{
	
	public void IncluirPessoa(Pessoa p) throws Exception{
		open();
		stmt = con.prepareStatement("insert into pessoa values(?,?,?)");
		stmt.setInt(1, p.getIdPessoa());
		stmt.setString(2, p.getNomePessoa());
		stmt.setString(3, p.getEmail());
		stmt.execute();
		stmt.close();
		close();
	}
	
	public boolean AlterarPessoa(Pessoa p) throws Exception{
		open();
		stmt = con.prepareStatement("update pessoa set nomePessoa = ?, email = ? where idPessoa = ?");	
		try {
			stmt.setString(1, p.getNomePessoa());
			stmt.setString(2, p.getEmail());
			stmt.setInt(3, p.getIdPessoa());
			stmt.execute();
		} catch (SQLException ex) {
			System.out.println("Erro: " + ex.getMessage() + stmt);
			stmt.close();
			close();
			return false;
		}
		stmt.close();
		close();
		return true;
	}
	
	public void ExcluirPessoa(Pessoa p) throws Exception{
		open();
		stmt = con.prepareStatement("delete from pessoa where idPessoa = ?");
		stmt.setInt(1, p.getIdPessoa());
		stmt.execute();
		stmt.close();
		close();
	}
	
	public Pessoa ConsultarPessoa(int cod) throws Exception{
		open();
		stmt = con.prepareStatement("select * from pessoa where idPessoa = ?");
		stmt.setInt(1, cod);
		rs = stmt.executeQuery();
		Pessoa p = null;
		if(rs.next()) {
			p = new Pessoa();
			p.setIdPessoa(rs.getInt("idPessoa"));
			p.setNomePessoa(rs.getString("nomePessoa"));
			p.setEmail(rs.getString("email"));
		} else {
			System.out.println("Registro n�o encontrado");
		}
		close();
		return p;
	}
	
	public List<Pessoa> ListarPessoa() throws Exception{
		
		
		open();
		stmt = con.prepareStatement("select * from pessoa");
		rs = stmt.executeQuery();
		List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
		while(rs.next()) {
			Pessoa p = new Pessoa();
			p.setIdPessoa(rs.getInt("idPessoa"));
			p.setNomePessoa(rs.getString("nomePessoa"));
			p.setEmail(rs.getString("email"));
			listaPessoas.add(p);
		}
		close();
		return listaPessoas;
	}
}
