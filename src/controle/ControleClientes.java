package controle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modelo.pessoas.Cliente;

public class ControleClientes {

	public List<Cliente> clientes = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	// CADASTRAR CLIENTES
	public void cadastroClientes() {
		System.out.print("Digite o nome do cliente: ");
		String nome = sc.nextLine();

		System.out.print("Digite a idade do cliente: ");
		int idade = sc.nextInt();
		sc.nextLine();

		System.out.print("Digite o telefone do cliente: ");
		String telefone = sc.nextLine();

		System.out.print("Digite o endereco do cliente: ");
		String endereco = sc.nextLine();

		System.out.print("Digite o cpf do cliente: ");
		String cpf = sc.nextLine();

		System.out.print("Digite o email do cliente: ");
		String email = sc.nextLine();

		Cliente cliente = new Cliente(nome, idade, telefone, endereco, cpf, email);
		clientes.add(cliente);
	}

	// BUSCAR CLIENTES
	public String buscarClientes() {

		System.out.print("Digite o CPF do cliente (somente números) à ser verificado: ");
		String cpfBusca = sc.next();

		for (int i = 0; i < clientes.size(); i++) {
			if (clientes.get(i).getCpf().equals(cpfBusca)) {
				return clientes.get(i).toString();
			}
		}
		return "Usuário não encontrado ! ";
	}

	// VISUALIZAR CLIENTES
	public void verClientes() {
		for (int i = 0; i < clientes.size(); i++) {
			System.out.println(clientes.get(i).toString() + "\n");
		}
	}

	// ATUALIZAR CLIENTES
	public void atualizarClientes() {

		System.out.print("Digite o cpf do cliente que deseja alterar as informações: ");
		String cpf = sc.next();

		System.out.println("SELECIONE A OPÇÃO DESEJADA: ");
		System.out.println("1) ALTERAR NOME");
		System.out.println("2) ALTERAR IDADE");
		System.out.println("3) ALTERAR TELEFONE");
		System.out.println("4) ALTERAR ENDEREÇO");
		System.out.println("5) ALTERAR EMAIL");

		int opcao = sc.nextInt();
		sc.nextLine();

		switch (opcao) {
		case 1:
			System.out.print("Digite o nome para o qual deseja alterar: ");
			String nome = sc.nextLine();

			for (int i = 0; i < clientes.size(); i++) {
				if (clientes.get(i).getCpf().equals(cpf)) {
					clientes.get(i).setNome(nome);
				}
			}
			break;

		case 2:
			System.out.print("Digite a idade para o qual deseja alterar: ");
			int idade = sc.nextInt();

			for (int i = 0; i < clientes.size(); i++) {
				if (clientes.get(i).getCpf().equals(cpf)) {
					clientes.get(i).setIdade(idade);
				}
			}
			break;

		case 3:
			System.out.print("Digite o telefone para o qual deseja alterar: ");
			String telefone = sc.nextLine();

			for (int i = 0; i < clientes.size(); i++) {
				if (clientes.get(i).getCpf().equals(cpf)) {
					clientes.get(i).setTelefone(telefone);
				}
			}
			break;

		case 4:
			System.out.print("Digite o endereço para o qual deseja alterar: ");
			String endereco = sc.nextLine();

			for (int i = 0; i < clientes.size(); i++) {
				if (clientes.get(i).getCpf().equals(cpf)) {
					clientes.get(i).setEndereco(endereco);
				}
			}
			break;

		case 5:
			System.out.print("Digite o email para o qual deseja alterar: ");
			String email = sc.nextLine();

			for (int i = 0; i < clientes.size(); i++) {
				if (clientes.get(i).getCpf().equals(cpf)) {
					clientes.get(i).setEmail(email);
				}
			}
			break;

		default:
			System.out.println("Seleção Inválida");
		}

	}

	// DELETAR CLIENTES
	public void deletarClientes() {
		System.out.println("Digite o CPF do cliente (somente números) à ser apagado: ");
		String cpfBusca = sc.next();

		for (int i = 0; i < clientes.size(); i++) {
			if (clientes.get(i).getCpf().equals(cpfBusca)) {
				clientes.remove(i);
			}
		}
	}
}
