package modelo.pessoas;

public class Vendedor extends Pessoa {
	private double salario;

	public Vendedor(String nome, String telefone, String cpf, String email, double salario) {
		super(nome, telefone, cpf, email);
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return "Dados do vendedor " + "\n" +
				"Nome: " + nome + "\n" +
				"CPF: " + cpf + "\n" + 
				"Email: " + email + "\n" +
				"Salário: " + salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
