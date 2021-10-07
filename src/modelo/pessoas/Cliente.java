package modelo.pessoas;

/**
 * Herda da classe Pessoa e define os atributos dos clientes
 * @author Mateus Vinícius
 * @version 1.0 (Out 2021)
 */
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
