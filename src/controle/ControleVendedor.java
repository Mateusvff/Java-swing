package controle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modelo.pessoas.Vendedor;

/**
 * Realiza a comunicação entre o pacote modelo e o pacote view do vendedor por meio dos métodos de:
 * (1) Cadastro
 * (2) Busca
 * (3) Visualização
 * (4) Deleção
 * @author Mateus Vinícius
 * @version 1.0 (Out 2021)
 *
 */
public class ControleVendedor {

	public static List<Vendedor> vendedores = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	/**
	 * Realiza o cadastro de um novo vendedor na lista a partir dos dados informados
	 * @param nome uma string que contém o nome do vendedor
	 * @param telefone uma string que contém um número para contato
	 * @param cpf uma string que contém o CPF do colaborador
	 * @param email uma string que contém o endereço eletrônico
	 * @param salario um double que possui o salário do vendedor
	 * @author Mateus Vinícius
	 * @version 1.0 (Out 2021)
	 */
	public void cadastroVendedor(String nome, String telefone, String cpf, String email, double salario) {
		Vendedor vendedor = new Vendedor(nome, telefone, cpf, email, salario);
		vendedores.add(vendedor);
	}

	/**
	 * Realiza a busca de um vendedor na lista de vendedores a partir de um CPF informado
	 * @param cpf uma string que contém o CPF a ser procurado na lista
	 * @return informa caso o CPF pesquisado não esteja associado a nenhum vendedor cadastrado
	 * @author Mateus Vinícius
	 * @version 1.0 (Out 2021)
	 */
	public String buscarVendedorString(String cpf) {

		for (int i = 0; i < vendedores.size(); i++) {
			if (vendedores.get(i).getCpf().equals(cpf)) {
				return vendedores.get(i).toString();
			}
		}
		return "Vendedor não encontrado ! ";
	}
	
	/**
	 * Realiza a busca de um vendedor na lista de vendedores a partir de um CPF informado
	 * @param cpf uma string que contém o CPF a ser procurado na lista
	 * @return puxa os dados do vendedor associado ao CPF pesquisado
	 * @author Mateus Vinícius
	 * @version 1.0 (Out 2021)
	 */
	public Vendedor buscarVendedor(String cpf) {
		for (int i = 0; i < vendedores.size(); i++) {
			if (vendedores.get(i).getCpf().equals(cpf)) {
				return vendedores.get(i);
			}
		}
		return null;
	}

	/**
	 * Puxa os dados de fornecedores pré carregados e cadastrados e apresenta em forma de lista
	 * @author Juan Cerqueira
	 * @version 1.0 (Out 2021)
	 */
	public void verVendedor() {
		for (int i = 0; i < vendedores.size(); i++) {
			System.out.println(vendedores.get(i).toString() + "\n");
		}
	}

	/**
	 * Realiza a edição dos dados de um vendedor já cadastrado
	 * @param vendedorAtual puxa os dados atuais do vendedor
	 * @param nome uma string que contém o nome que substituirá os dados atuais
	 * @param telefone uma string que contém o telefone que substituirá os dados atuais
	 * @param cpf uma string que contém o novo cpf
	 * @param email uma string que contém o novo endereço de email
	 * @param salario um double que contém o novo salário
	 * @author Mateus Vinícius
	 * @version 1.0 (Out 2021)
	 */
	public void atualizarVendedor(Vendedor vendedorAtual, String nome, String telefone, String cpf, String email, double salario) {
		for (int i = 0; i < vendedores.size(); i++) {
			if (vendedores.get(i).getCpf().equals(vendedorAtual.getCpf())) {
				vendedores.get(i).setNome(nome);
				vendedores.get(i).setEmail(email);
				vendedores.get(i).setCpf(cpf);
				vendedores.get(i).setSalario(salario);
				vendedores.get(i).setTelefone(telefone);
			}
		}
	}

	/**
	 * Realiza a deleção de um vendedor da lista a partir do seu CPF
	 * @param cpf uma string que contém o CPF do vendedor que será removido da lista
	 * @author Juan Cerqueira
	 * @version 1.0 (Out 2021)
	 */
	public void deletarVendedor(String cpf) {
		for (int i = 0; i < vendedores.size(); i++) {
			if (vendedores.get(i).getCpf().equals(cpf)) {
				vendedores.remove(i);
			}
		}
	}
	
	/**
	 * Carrega dados de teste na lista de vendedores
	 * @author Mateus Vinícius
	 * @version 1.0 (Out 2021)
	 */
	public void dados() {

		Vendedor vendedor1 = new Vendedor("Ricardo", "61 99999-8888", "114.103.710-69", "ricardo@gmail.com", 2000 );
		Vendedor vendedor2 = new Vendedor("Jairo", "61 98888-9999", "063.315.680-93", "jairo@gmail.com", 2100);
		Vendedor vendedor3 = new Vendedor("Arthur", "61 99865-7586", "380.538.330-47", "arthur@gmail.com", 2500);
		Vendedor vendedor4 = new Vendedor("Cristiano", "61 98563-5632", "429.382.740-41", "cristiano@gmail.com", 1800);
		Vendedor vendedor5 = new Vendedor("Leonardo", "61 986325478", "661.333.770-62", "leonardo@gmail.com", 1600);
		
		vendedores.add(vendedor1);
		vendedores.add(vendedor2);
		vendedores.add(vendedor3);
		vendedores.add(vendedor4);
		vendedores.add(vendedor5);
		
	}
}
