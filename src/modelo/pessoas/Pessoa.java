package modelo.pessoas;

public abstract class Pessoa {
	protected String nome;
	protected String telefone;
	protected String endereco;
	protected String cpf;
	protected String email;
	
	public Pessoa(String nome, String cpf, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
	}
	
	public Pessoa(String nome, String telefone, String endereco, String cpf, String email) {
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
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
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
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
