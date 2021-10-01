package modelo.pessoas;

public class Vendedor extends Pessoa {
	private int quantVendida;
	private double salario;

	public Vendedor(String nome, String telefone, String cidade, String cpf, String email, int quantVendida,
			double salario) {
		super(nome, telefone, cidade, cpf, email);
		this.quantVendida = quantVendida;
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return "Dados do vendedor " + "\n" +
				"Nome: " + nome + "\n" +
				"CPF: " + cpf + "\n" + 
				"Email: " + email + "\n" +
				"Quantidade vendida: " + quantVendida + "\n" + 
				"Salário: " + salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getQuantVendida() {
		return quantVendida;
	}

	public void setQuantVendida(int quantVendida) {
		this.quantVendida = quantVendida;
	}

}
