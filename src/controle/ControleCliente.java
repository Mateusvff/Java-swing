package controle;

import java.util.ArrayList;
import java.util.List;

import modelo.pessoas.Cliente;

public class ControleCliente {

	public static List<Cliente> clientes = new ArrayList<>();
	
	
	public void dados() {
		Cliente cliente1 = new Cliente("Mateus", "305.303.860-97", "mateus@gmail.com", "61 99999-9999", "Brasília");
		Cliente cliente2 = new Cliente("João", "856.583.570-71", "joao@gmail.com", "11 98888-8888", "São Paulo");
		Cliente cliente3 = new Cliente("Pedro", "711.665.910-26", "pedro@gmail.com", "19 97777-7777", "Campinas");
		Cliente cliente4 = new Cliente("Ana", "184.505.980-87", "ana@gmail.com", "83 96666-6666", "João Pessoa");
		Cliente cliente5 = new Cliente("Júlia", "322.036.940-50", "julia@gmail.com", "82 95555-5555", "Maceió");
		
		clientes.add(cliente1);
		clientes.add(cliente2);
		clientes.add(cliente3);
		clientes.add(cliente4);
		clientes.add(cliente5);
	}
	

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
		return "Usuário não encontrado ! ";
	}
	
	public Cliente buscarClientes1(String cpfBusca) {
		for (int i = 0; i < clientes.size(); i++) {
			if (clientes.get(i).getCpf().equals(cpfBusca)) {
				return clientes.get(i);
			}
		}
		return null;
	}

	// DELETAR CLIENTES
	public void deletarClientes(String cpfDelete) {
		for (int i = 0; i < clientes.size(); i++) {
			if (clientes.get(i).getCpf().equals(cpfDelete)) {
				clientes.remove(i);
			}
		}
	}
	

}
