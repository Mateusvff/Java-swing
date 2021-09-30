package modelo.pessoas;

public class Vendedor extends Pessoa {
	private int quantVendida;
	private double salario;

	public Vendedor(String nome, String cpf, String email, double salario) {
		super(nome, cpf, email);
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return "Dados do vendedor " + "\n" +
				"nome: " + nome + "\n" +
				"cpf: " + cpf + "\n" + 
				"email: " + email + "\n" +
				"quantidade vendida: " + quantVendida + "\n" + 
				"salário: " + salario;
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
