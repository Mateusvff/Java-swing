package modelo.pessoas;

public class Cliente extends Pessoa {
	private int quantComprada;
	
	public Cliente(String nome, String cpf, String email, int quantComprada) {
		super(nome, cpf, email);
		this.quantComprada = quantComprada;
	}
	
	public Cliente(String nome, String telefone, String endereco, String cpf, String email) {
		super(nome, telefone, endereco, cpf, email);
	}
	
	
	@Override
	public String toString() {
		return "Dados do cliente: \n" + 
				"Nome: " + nome + "\n" +
				"CPF: " + cpf + "\n" +
				"Email: " + email + "\n" +
				"Telefone: " + telefone + "\n" + 
				"Endereço: " + endereco;
	}

	public int getQuantComprada() {
		return quantComprada;
	}

	public void setQuantComprada(int quantComprada) {
		this.quantComprada = quantComprada;
	}
	
}
