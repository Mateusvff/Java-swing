package principal;

/**
 * Valida os seguintes dados preenchidos pelo usu�rio:
 * (1) Nome do cliente
 * (2) Quantidade vendida
 * (3) Telefone
 * @author Mateus Vin�cius
 * @version 1.0 (Out 2021)
 */
public class Validador {
	

	/**
	 * Checa se o campo de texto est� vazio
	 * @param nome uma string que cont�m o nome do cliente a ser checado
	 * @return true caso o campo de texto n�o esteja vazio
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
	 * Checa se a quantidade vendida de um produto � maior que zero
	 * @param quantidadeVenda um int que cont�m a quantidade vendida
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
	 * Checa se o telefone digitado possui caracteres n�o num�ricos
	 * @param telefone uma string que cont�m o n�mero de contato
	 * @return false caso o telefone digitado possua "@" ou "!"
	 * @return true caso o telefone possua apenas n�meros
	 * @author Mateus Vin�cius
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
