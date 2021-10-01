package controle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modelo.pessoas.Cliente;
import modelo.pessoas.Vendedor;

public class ControleVendedor {

	public static List<Vendedor> vendedores = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	// CADASTRAR VENDEDOR
	public void cadastroVendedor(String nome, String telefone, String cpf, String email, double salario) {
		Vendedor vendedor = new Vendedor(nome, telefone, cpf, email, salario);
		vendedores.add(vendedor);
	}

	// BUSCAR VENDEDOR
	public String buscarVendedor() {

		System.out.print("Digite o CPF do vendedor (somente números) à ser verificado: ");
		String cpf = sc.next();

		for (int i = 0; i < vendedores.size(); i++) {
			if (vendedores.get(i).getCpf().equals(cpf)) {
				return vendedores.get(i).toString();
			}
		}
		return "Vendedor não encontrado ! ";
	}

	// VISUALIZAR VENDEDOR
	public void verVendedor() {
		for (int i = 0; i < vendedores.size(); i++) {
			System.out.println(vendedores.get(i).toString() + "\n");
		}
	}

	// ATUALIZAR VENDEDOR
	public void atualizarVendedor() {

		System.out.print("Digite o CPF do vendedor que deseja alterar as informações: ");
		String cpf = sc.next();

		System.out.println("SELECIONE A OPÇÃO DESEJADA: ");
		System.out.println("1) ALTERAR NOME");
		System.out.println("2) ALTERAR EMAIL");
		System.out.println("3) ALTERAR SALÁRIO");

		int opcao = sc.nextInt();
		sc.nextLine();

		switch (opcao) {
		case 1:
			System.out.print("Digite o nome para o qual deseja alterar: ");
			String nome = sc.nextLine();

			for (int i = 0; i < vendedores.size(); i++) {
				if (vendedores.get(i).getCpf().equals(cpf)) {
					vendedores.get(i).setNome(nome);
				}
			}

			break;

		case 2:
			System.out.print("Digite o email para o qual deseja alterar: ");
			String email = sc.nextLine();

			for (int i = 0; i < vendedores.size(); i++) {
				if (vendedores.get(i).getCpf().equals(cpf)) {
					vendedores.get(i).setEmail(email);
				}
			}

			break;

		case 3:
			System.out.print("Digite o salário para o qual deseja alterar: ");
			double salario = sc.nextDouble();

			for (int i = 0; i < vendedores.size(); i++) {
				if (vendedores.get(i).getCpf().equals(cpf)) {
					vendedores.get(i).setSalario(salario);
				}
			}

			break;

		default:
			System.out.println("Seleção Inválida");
		}
	}

	// DELETAR VENDEDOR
	public void deletarVendedor() {
		System.out.println("Digite o CPF do fornecedor (somente números) à ser apagado: ");
		String cpf = sc.next();

		for (int i = 0; i < vendedores.size(); i++) {
			if (vendedores.get(i).getCpf().equals(cpf)) {
				vendedores.remove(i);
			}
		}
	}
}
