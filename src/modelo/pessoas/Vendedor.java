package modelo.pessoas;

/**
 * Herda da classe Pessoa e define os atributos dos vendedores
 * @author Mateus Vinícius
 * @version 1.0 (Out 2021)
 */
public class Vendedor extends Pessoa {
	private double salario;

	public Vendedor(String nome,String cpf, String telefone, String email, double salario) {
		super(nome, telefone, cpf, email);
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return "Dados do vendedor " + "\n" +
				"Nome: " + nome + "\n" +
				"Telefone: " + telefone + "\n" +
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
