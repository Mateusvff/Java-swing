package modelo.pessoas;

/**
 * Herda da classe Pessoa e define os atributos dos fornecedores
 * @author Mateus Vinícius
 * @version 1.0 (Out 2021)
 */
public class Fornecedor {
	private String nome;
	private String cnpj;
	private String telefone;
	private String cidade;
	private String email;

	public Fornecedor(String nome, String cnpj, String telefone, String cidade, String email) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.telefone = telefone;
		this.cidade = cidade;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Dados do fornecedor " + "\n" +
				"Nome: " + nome + "\n" +
				"CNPJ: " + cnpj + "\n" + 
				"Telefone" + telefone + "\n" +
				"Cidade" + cidade + "\n" +
				"Email: " + email + "\n";
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

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
