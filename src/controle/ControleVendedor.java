package controle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
	public String buscarVendedorString(String cpf) {

		for (int i = 0; i < vendedores.size(); i++) {
			if (vendedores.get(i).getCpf().equals(cpf)) {
				return vendedores.get(i).toString();
			}
		}
		return "Vendedor não encontrado ! ";
	}
	
	public Vendedor buscarVendedor(String cpf) {
		for (int i = 0; i < vendedores.size(); i++) {
			if (vendedores.get(i).getCpf().equals(cpf)) {
				return vendedores.get(i);
			}
		}
		return null;
	}

	// VISUALIZAR VENDEDOR
	public void verVendedor() {
		for (int i = 0; i < vendedores.size(); i++) {
			System.out.println(vendedores.get(i).toString() + "\n");
		}
	}

	// ATUALIZAR VENDEDOR
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

	// DELETAR VENDEDOR
	public void deletarVendedor(String cpf) {
		for (int i = 0; i < vendedores.size(); i++) {
			if (vendedores.get(i).getCpf().equals(cpf)) {
				vendedores.remove(i);
			}
		}
	}
}
