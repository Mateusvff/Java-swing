package controle;

import java.util.ArrayList;
import java.util.List;

import modelo.pessoas.Cliente;

/**
 * Realiza a comunica��o entre o pacote modelo e o pacote view do cliente por meio dos m�todos de:
 * (1) Cadastro
 * (2) Busca
 * (3) Visualiza��o
 * (4) Dele��o
 * @author Mateus Vin�cius
 * @version 1.0 (Out 2021)
 */

public class ControleCliente {

	public static List<Cliente> clientes = new ArrayList<>();
	
	/**
	 * Carrega dados de teste na lista de clientes
	 * @author Mateus Vin�cius
	 * @version 1.0 (Out 2021)
	 */
	public void dados() {
		Cliente cliente1 = new Cliente("Mateus", "305.303.860-97", "mateus@gmail.com", "61 99999-9999", "Bras�lia");
		Cliente cliente2 = new Cliente("Jo�o", "856.583.570-71", "joao@gmail.com", "11 98888-8888", "S�o Paulo");
		Cliente cliente3 = new Cliente("Pedro", "711.665.910-26", "pedro@gmail.com", "19 97777-7777", "Campinas");
		Cliente cliente4 = new Cliente("Ana", "184.505.980-87", "ana@gmail.com", "83 96666-6666", "Jo�o Pessoa");
		Cliente cliente5 = new Cliente("J�lia", "322.036.940-50", "julia@gmail.com", "82 95555-5555", "Macei�");
		
		clientes.add(cliente1);
		clientes.add(cliente2);
		clientes.add(cliente3);
		clientes.add(cliente4);
		clientes.add(cliente5);
	}
	

	/** 
	 * Cadastra as informa��es do cliente na lista
	 * @param nome uma string que cont�m o nome do cliente
	 * @param telefone uma string que cont�m o email
	 * @param endereco uma string que cont�m o endere�o residencial
	 * @param cpf uma string que cont�m o CPF
	 * @param email uma string que cont�m o endere�o eletr�nico
	 * @author Mateus Vin�cius
	 * @version 1.0 (Out 2021)
	 */
	public void cadastroClientes(String nome, String telefone, String endereco, String cpf, String email) {
		Cliente cliente = new Cliente(nome, telefone, endereco, cpf, email);
		clientes.add(cliente);
	}

	/**
	 * Realiza a busca de um cliente na lista por meio de um CPF
	 * @param cpfBusca uma string que cont�m o CPF que ser� pesquisado na lista
	 * @return informa que o cliente procurado n�o est� cadastrado
	 * @author Mateus Vin�cius
	 * @version 1.0 (Out 2021)
	 */
	public String buscarClientes(String cpfBusca) {
		for (int i = 0; i < clientes.size(); i++) {
			if (clientes.get(i).getCpf().equals(cpfBusca)) {
				return clientes.get(i).toString();
			}
		}
		return "Usu�rio n�o encontrado ! ";
	}
	
	/**
	 * Realiza a busca de um cliente na lista por meio de um CPF
	 * @param cpfBusca uma string que cont�m o CPF que ser� pesquisado na lista
	 * @return puxa os dados do cliente procurado por meio de uma lista
	 * @author Mateus Vin�cius
	 * @version 1.0 (Out 2021)
	 */
	public Cliente buscarClientes1(String cpfBusca) {
		for (int i = 0; i < clientes.size(); i++) {
			if (clientes.get(i).getCpf().equals(cpfBusca)) {
				return clientes.get(i);
			}
		}
		return null;
	}


	/**
	 * Deleta o cliente da lista a partir do seu CPF
	 * @param cpfDelete percorre a lista de clientes e remove o cliente que possuir CPF id�ntico ao que foi digitado no campo de texto
	 * @author Juan Cerqueira
	 * @version 1.0 (Out 2021)
	 */
	public void deletarClientes(String cpfDelete) {
		for (int i = 0; i < clientes.size(); i++) {
			if (clientes.get(i).getCpf().equals(cpfDelete)) {
				clientes.remove(i);
			}
		}
	}
	

}
