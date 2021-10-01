package controle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JFormattedTextField;

import modelo.pessoas.Cliente;

public class ControleCliente {

	public static List<Cliente> clientes = new ArrayList<>();
	

	// CADASTRAR CLIENTES
	public void cadastroClientes(String nome, String telefone, String endereco, String cpf, String email) {
		Cliente cliente = new Cliente(nome, telefone, endereco, cpf, email);
		clientes.add(cliente);
	}

	// BUSCAR CLIENTES
	public String buscarClientes(String cpfBusca) {
		for (int i = 0; i < clientes.size(); i++) {
			if (clientes.get(i).getCpf().equals(cpfBusca)) {
				return clientes.get(i).toString();
			}
		}
		return "Usu�rio n�o encontrado ! ";
	}

	// VISUALIZAR CLIENTES
	public void verClientes() {
		for (int i = 0; i < clientes.size(); i++) {
			System.out.println(clientes.get(i).toString() + "\n");
		}
	}

	// ATUALIZAR CLIENTES
	public void atualizarClientes() {

		System.out.print("Digite o cpf do cliente que deseja alterar as informa��es: ");
		String cpf = sc.next();

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

			for (int i = 0; i < clientes.size(); i++) {
				if (clientes.get(i).getCpf().equals(cpf)) {
					clientes.get(i).setNome(nome);
				}
			}
			break;

		case 2:
			System.out.print("Digite o telefone para o qual deseja alterar: ");
			String telefone = sc.nextLine();

			for (int i = 0; i < clientes.size(); i++) {
				if (clientes.get(i).getCpf().equals(cpf)) {
					clientes.get(i).setTelefone(telefone);
				}
			}
			break;

		case 3:
			System.out.print("Digite o endere�o para o qual deseja alterar: ");
			String endereco = sc.nextLine();

			for (int i = 0; i < clientes.size(); i++) {
				if (clientes.get(i).getCpf().equals(cpf)) {
					clientes.get(i).setEndereco(endereco);
				}
			}
			break;

		case 4:
			System.out.print("Digite o email para o qual deseja alterar: ");
			String email = sc.nextLine();

			for (int i = 0; i < clientes.size(); i++) {
				if (clientes.get(i).getCpf().equals(cpf)) {
					clientes.get(i).setEmail(email);
				}
			}
			break;

		default:
			System.out.println("Sele��o Inv�lida");
		}

	}

	// DELETAR CLIENTES
	public void deletarClientes(JFormattedTextField cpfDelete) {
		for (int i = 0; i < clientes.size(); i++) {
			if (clientes.get(i).getCpf().equals(cpfDelete)) {
				clientes.remove(i);
			}
		}
	}
}
