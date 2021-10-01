package controle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
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
	public String buscarFornecedor(String cnpjBusca) {

		for (int i = 0; i < fornecedores.size(); i++) {
			if (fornecedores.get(i).getCnpj().equals(cnpjBusca)) {
				return fornecedores.get(i).toString();
			}
		}
		return "Fornecedor não encontrado ! ";
	}

	// VISUALIZAR FORNECEDOR
	public void verFornecedor() {
		for (int i = 0; i < fornecedores.size(); i++) {
			System.out.println(fornecedores.get(i).toString() + "\n");
		}
	}

	// DELETAR FORNECEDOR
	public void deletarFornecedor() {
		System.out.println("Digite o CNPJ do fornecedor (somente números) à ser apagado: ");
		String cnpj = sc.next();

		for (int i = 0; i < fornecedores.size(); i++) {
			if (fornecedores.get(i).getCnpj().equals(cnpj)) {
				fornecedores.remove(i);
			}
		}
	}
}
