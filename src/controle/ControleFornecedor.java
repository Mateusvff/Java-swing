package controle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modelo.pessoas.Cliente;
import modelo.pessoas.Fornecedor;

public class ControleFornecedor {

	public static List<Fornecedor> fornecedores = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	// CADASTRAR FORNECEDOR
	public void cadastroFornecedor(String nome, String cnpj, String telefone, String cidade, String email) {
		Fornecedor fornecedor = new Fornecedor(nome, cnpj, telefone, cidade, email);
		fornecedores.add(fornecedor);
	}

	// BUSCAR FORNECEDOR
	public String buscarFornecedor() {

		System.out.print("Digite o cnpj do fornecedor (somente n�meros) � ser verificado: ");
		String cnpjBusca = sc.next();

		for (int i = 0; i < fornecedores.size(); i++) {
			if (fornecedores.get(i).getCnpj().equals(cnpjBusca)) {
				return fornecedores.get(i).toString();
			}
		}
		return "Fornecedor n�o encontrado ! ";
	}

	// VISUALIZAR FORNECEDOR
	public void verFornecedor() {
		for (int i = 0; i < fornecedores.size(); i++) {
			System.out.println(fornecedores.get(i).toString() + "\n");
		}
	}

	// ATUALIZAR FORNECEDOR
	public void atualizarFornecedor() {

		System.out.print("Digite o cnpj do fornecedor que deseja alterar as informa��es: ");
		String cnpj = sc.next();

		System.out.println("SELECIONE A OP��O DESEJADA: ");
		System.out.println("1) ALTERAR NOME");
		System.out.println("2) ALTERAR TELEFONE");
		System.out.println("3) ALTERAR ENDERE�O");
		System.out.println("4) ALTERAR EMAIL");

		int opcao = sc.nextInt();
		sc.nextLine();

		switch (opcao) {
		case 1:
			System.out.print("Digite o nome para o qual deseja alterar: ");
			String nome = sc.nextLine();

			for (int i = 0; i < fornecedores.size(); i++) {
				if (fornecedores.get(i).getCnpj().equals(cnpj)) {
					fornecedores.get(i).setNome(nome);
				}
			}

			break;

		case 2:
			System.out.print("Digite o telefone para o qual deseja alterar: ");
			String telefone = sc.nextLine();

			for (int i = 0; i < fornecedores.size(); i++) {
				if (fornecedores.get(i).getCnpj().equals(cnpj)) {
					fornecedores.get(i).setTelefone(telefone);
				}
			}

			break;

		case 3:
			System.out.print("Digite o endere�o para o qual deseja alterar: ");
			String endereco = sc.nextLine();

			for (int i = 0; i < fornecedores.size(); i++) {
				if (fornecedores.get(i).getCnpj().equals(cnpj)) {
					fornecedores.get(i).setEndereco(endereco);
				}
			}

			break;

		case 4:
			System.out.print("Digite o email para o qual deseja alterar: ");
			String email = sc.nextLine();

			for (int i = 0; i < fornecedores.size(); i++) {
				if (fornecedores.get(i).getCnpj().equals(cnpj)) {
					fornecedores.get(i).setEmail(email);
				}
			}

			break;

		default:
			System.out.println("Sele��o Inv�lida");
		}
	}

	// DELETAR FORNECEDOR
	public void deletarFornecedor() {
		System.out.println("Digite o CNPJ do fornecedor (somente n�meros) � ser apagado: ");
		String cnpj = sc.next();

		for (int i = 0; i < fornecedores.size(); i++) {
			if (fornecedores.get(i).getCnpj().equals(cnpj)) {
				fornecedores.remove(i);
			}
		}
	}
}
