package controle;

import java.util.ArrayList;
import java.util.List;

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
