package principal;

/**
 * Valida os seguintes dados preenchidos pelo usuário:
 * (1) Nome do cliente
 * (2) Quantidade vendida
 * (3) Telefone
 * @author Mateus Vinícius
 * @version 1.0 (Out 2021)
 */
public class Validador {
	

	/**
	 * Checa se o campo de texto está vazio
	 * @param nome uma string que contém o nome do cliente a ser checado
	 * @return true caso o campo de texto não esteja vazio
	 * @return false caso o campo de texto esteja vazio
	 * @author Juan Cerqueira
	 * @version 1.0 (Out 2021)
	 */
	public boolean validaNomeCliente(String nome) {
		boolean aux = true;
		
		if (nome.isEmpty()) {
			aux =  false;
		} else {
			aux = true;
		}
		return aux;
	}
	
	/**
	 * Checa se a quantidade vendida de um produto é maior que zero
	 * @param quantidadeVenda um int que contém a quantidade vendida
	 * @return false caso a quantidade inserida seja igual a 0
	 * @return true caso a quantidade inserida seja diferente de 0
	 * @author Juan Cerqueira
	 * @version 1.0 (Out 2021)
	 */
	public boolean validaQuantidadeVenda(int quantidadeVenda) {
		
		boolean aux = true;
		
		if(quantidadeVenda == 0) {
			aux = false;
		} else {
			aux = true;
		}
		
		return aux;
	}
	
	/**
	 * Checa se o telefone digitado possui caracteres não numéricos
	 * @param telefone uma string que contém o número de contato
	 * @return false caso o telefone digitado possua "@" ou "!"
	 * @return true caso o telefone possua apenas números
	 * @author Mateus Vinícius
	 * @version 1.0 (Out 2021)
	 */
	public boolean validaTelefone(String telefone) {
		boolean aux = true;
		
		if(telefone.contains("@")) {
			aux = false;
		} else if (telefone.contains("!")) {
			aux = false;
		} else {
			aux = true;
		}
		
		return aux;
	}

}
