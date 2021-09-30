package modelo.pessoas;

public class Fornecedor {
	
	private String nome;
	private String cnpj;
	private String telefone;
	private String endereco;
	private String email;
	
	
	public Fornecedor(String nome, String cnpj, String telefone, String endereco, String email) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.telefone = telefone;
		this.endereco = endereco;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Dados do fornecedor " + "\n" +
				"nome: " + nome + "\n" +
				"cnpj: " + cnpj + "\n" + 
				"telefone" + telefone + "\n" +
				"endereco" + endereco + "\n" +
				"email: " + email + "\n";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
