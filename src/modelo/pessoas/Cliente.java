package modelo.pessoas;

public class Cliente extends Pessoa {
	private int quantComprada;

	public Cliente(String nome, String telefone, String cidade, String cpf, String email) {
		super(nome, telefone, cidade, cpf, email);
		this.quantComprada = quantComprada;
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

	public int getQuantComprada() {
		return quantComprada;
	}

	public void setQuantComprada(int quantComprada) {
		this.quantComprada = quantComprada;
	}

}
