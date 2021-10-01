package modelo.pessoas;

public class Cliente extends Pessoa {
	private String cidade;

	public Cliente(String nome, String telefone, String cidade, String cpf, String email) {
		super(nome, telefone, cpf, email);
		this.cidade = cidade;
	}
	
	@Override
	public String toString() {
		return "Dados do cliente: \n" + 
				"Nome: " + nome + "\n" +
				"CPF: " + cpf + "\n" +
				"Email: " + email + "\n" +
				"Telefone: " + telefone + "\n" + 
				"Cidade: " + cidade;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


}
