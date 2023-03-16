package Cadastros;

import java.util.List;

public class Menu {

	public static void main(String[] args) {
		PessoaDao pd = new PessoaDao();
		try {

			Pessoa pessoaExcluir1 = pd.ConsultarPessoa(1);
			if (pessoaExcluir1 != null) {
				pd.ExcluirPessoa(pessoaExcluir1);
			}

			Pessoa pessoaExcluir2 = pd.ConsultarPessoa(2);
			if (pessoaExcluir2 != null) {
				pd.ExcluirPessoa(pessoaExcluir2);
			}
			// Incluir pessoa
			Pessoa p1 = new Pessoa(1, "Martarelli", "email@email.com");
			Pessoa p2 = new Pessoa(2, "Renan", "exemplo@email.com");
			pd.IncluirPessoa(p1);
			pd.IncluirPessoa(p2);

			// alterar pessoa
			Pessoa pessoa = pd.ConsultarPessoa(2);
			if (pessoa != null) {
				System.out.println("Pessoa Alterar: " + pessoa.getEmail());
				pessoa.setEmail("alterado@email.com");
				System.out.println("Pessoa Alterada: " + pessoa.getEmail());
				pd.AlterarPessoa(pessoa);
			}

			// listar todas pessoas
			List<Pessoa> listaPessoas = pd.ListarPessoa();

			for (Pessoa p : listaPessoas) {
				System.out.println("id:" + p.getIdPessoa() + "\tNome: " + p.getNomePessoa() + "\tEmail: " + p.getEmail());

			}

			// excluir pessoa
			Pessoa pessoaExcluir = pd.ConsultarPessoa(2);
			pd.ExcluirPessoa(pessoaExcluir);
			// listar todas pessoas
			listaPessoas = pd.ListarPessoa();

			for (Pessoa p : listaPessoas) {
				System.out.println("id:" + p.getIdPessoa() + "\tNome: " + p.getNomePessoa() + "\tEmail: " + p.getEmail());

			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
