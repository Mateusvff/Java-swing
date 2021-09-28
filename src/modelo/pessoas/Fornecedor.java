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


	public String getNomeEmpresa() {
		return nome;
	}
	
	public void setNomeEmpresa(String nomeEmpresa) {
		this.nome = nomeEmpresa;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getTelefoneEmpresa() {
		return telefone;
	}
	
	public void setTelefoneEmpresa(String telefoneEmpresa) {
		this.telefone = telefoneEmpresa;
	}
	
	public String getEnderecoEmpresa() {
		return endereco;
	}
	
	public void setEnderecoEmpresa(String enderecoEmpresa) {
		this.endereco = enderecoEmpresa;
	}
	
	public String getEmailEmpresa() {
		return email;
	}
	
	public void setEmailEmpresa(String emailEmpresa) {
		this.email = emailEmpresa;
	}
}
