package pessoas;

public class Cliente extends Pessoa {
	
	private int quantComprada;
	
	public Cliente(String nome, String cpf, String email, int quantComprada) {
		super(nome, cpf, email);
		this.quantComprada = quantComprada;
	}
	
	
	@Override
	public String toString() {
		return "Dados do cliente: \n" + 
				"nome: " + nome + "\n" + 
				"cpf: " + cpf + "\n" +
				"email: " + email + "\n" +
				"quantidade comprada: " + quantComprada;
	}

	public int getQuantComprada() {
		return quantComprada;
	}

	public void setQuantComprada(int quantComprada) {
		this.quantComprada = quantComprada;
	}
	
}
