package modelo.pessoas;

/**
 * Classe abstrata, herdada pelas classes:
 * (1) Cliente
 * (2) Vendedor
 * @author Mateus Vin�cius
 * @version 1.0 (Out 2021)
 *
 */
public abstract class Pessoa {
	protected String nome;
	protected String telefone;
	protected String cidade;
	protected String cpf;
	protected String email;
	
	public Pessoa(String nome, String telefone, String cpf, String email) {
		this.nome = nome;
		this.telefone = telefone;
		this.cpf = cpf;
		this.email = email;
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
}
