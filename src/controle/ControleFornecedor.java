package controle;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;
import modelo.pessoas.Fornecedor;

/**
 * Realiza a comunicação entre o pacote modelo e o pacote view do fornecedor por meio dos métodos de:
 * (1) Cadastro
 * (2) Busca
 * (3) Visualização
 * (4) Deleção
 * @author Mateus Vinícius
 * @version 1.0 (Out 2021)
 */


public class ControleFornecedor {

	public static List<Fornecedor> fornecedores = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	/**
	 * Realiza o cadastro de um novo fornecedor na lista
	 * @param nome uma string que contém o nome do fornecedor
	 * @param cnpj uma string que contém o CNPJ
	 * @param telefone uma string que contém o número de contato
	 * @param cidade uma string que contém a cidade em que o fornecedor se encontra
	 * @param email uma string que contém o endereço eletrônico
	 * @author Mateus Vinícius
	 * @version 1.0 (Out 2021)
	 */
	public void cadastroFornecedor(String nome, String cnpj, String telefone, String cidade, String email) {
		Fornecedor fornecedor = new Fornecedor(nome, cnpj, telefone, cidade, email);
		fornecedores.add(fornecedor);
	}

	/**
	 * Realiza a busca de um fornecedor na lista por meio do CNPJ
	 * @param cnpjBusca uma string que contém o cnpj que será buscado
	 * @return informa que o fornecedor pesquisado não está cadastrado
	 * @author Mateus Vinícius
	 * @version 1.0 (Out 2021)
	 */
	public String buscarFornecedor(String cnpjBusca) {

		for (int i = 0; i < fornecedores.size(); i++) {
			if (fornecedores.get(i).getCnpj().equals(cnpjBusca)) {
				return fornecedores.get(i).toString();
			}
		}
		return "Fornecedor não encontrado ! ";
	}
	
	/**
	 * Realiza a busca de um fornecedor na lista por meio do CNPJ
	 * @param cnpjBusca uma string que contém o cnpj que será buscado
	 * @return puxa os dados do fornecedor pesquisado por meio de uma lista
	 * @author Mateus Vinícius
	 * @version 1.0 (Out 2021)
	 */
	public Fornecedor buscarFornecedor1(String cnpjBusca) {

		for (int i = 0; i < fornecedores.size(); i++) {
			if (fornecedores.get(i).getCnpj().equals(cnpjBusca)) {
				return fornecedores.get(i);
			}
		}
		return null;
	}

	/**
	 * Puxa os dados de fornecedores pré carregados e cadastrados e apresenta em forma de lista
	 * @author Juan Cerqueira
	 * @version 1.0 (Out 2021)
	 */
	public void verFornecedor() {
		for (int i = 0; i < fornecedores.size(); i++) {
			System.out.println(fornecedores.get(i).toString() + "\n");
		}
	}

	/**
	 * Realiza a deleção de um fornecedor da lista a partir do CNPJ digitado
	 * @param cnpj uma string que contém o CNPJ do fornecedor que será deletado
	 * @author Mateus Vinícius
	 * @version 1.0 (Out 2021)
	 */
	public void deletarFornecedor(String cnpj) {
		for (int i = 0; i < fornecedores.size(); i++) {
			if (fornecedores.get(i).getCnpj().equals(cnpj)) {
				fornecedores.remove(i);
			}
		}
	}
	
	/**
	 * Carrega dados de teste na lista de fornecedores
	 * @author Mateus Vinícius
	 * @version 1.0 (Out 2021)
	 */
	public void dados() {
		
		Fornecedor fornecedor1 = new Fornecedor("Óticas Grassi", "46.029.170/0001-08", "49 52961-9739", "Santa Catarina", "grassi@fornecedor.com");
		Fornecedor fornecedor2 = new Fornecedor("LBA Shop", "69.851.150/0001-05", "85 17608-1644", "Fortaleza", "lbashop@fornecedor.com");
		Fornecedor fornecedor3 = new Fornecedor("Abstrato", "77.745.556/0001-31", "73 67638-3585", "Aiquara", "abstrato@fornecedor.com");
		Fornecedor fornecedor4 = new Fornecedor("YouCom", "67.596.749/0001-14", "24 60730-8760", "Rio de Janeiro", "youcom@fornecedor.com");
		Fornecedor fornecedor5 = new Fornecedor("Woodz", "44.448.520/0001-37", "24 45948-7418", "Angra dos Reis", "woodz@fornecedor.com");
		
		fornecedores.add(fornecedor1);
		fornecedores.add(fornecedor2);
		fornecedores.add(fornecedor3);
		fornecedores.add(fornecedor4);
		fornecedores.add(fornecedor5);
	}
}
