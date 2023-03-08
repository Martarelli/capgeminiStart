package Cadastros;

public class Menu {

	public static void main(String[] args) {
		PessoaDao pd = new PessoaDao();
		try {
			Pessoa p1 = new Pessoa(1,"Martarelli","email@email.com");
			Pessoa p2 = new Pessoa(2,"Renan","exemplo@email.com");
			pd.IncluirPessoa(p1);
			pd.IncluirPessoa(p2);
		} catch(Exception e) {
			System.out.println(e);
		}

	}

}
