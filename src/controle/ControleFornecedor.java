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
	
	public Fornecedor buscarFornecedor1(String cnpjBusca) {

		for (int i = 0; i < fornecedores.size(); i++) {
			if (fornecedores.get(i).getCnpj().equals(cnpjBusca)) {
				return fornecedores.get(i);
			}
		}
		return null;
	}

	// VISUALIZAR FORNECEDOR
	public void verFornecedor() {
		for (int i = 0; i < fornecedores.size(); i++) {
			System.out.println(fornecedores.get(i).toString() + "\n");
		}
	}

	// DELETAR FORNECEDOR
	public void deletarFornecedor(String cnpj) {
		for (int i = 0; i < fornecedores.size(); i++) {
			if (fornecedores.get(i).getCnpj().equals(cnpj)) {
				fornecedores.remove(i);
			}
		}
	}
	
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
