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
