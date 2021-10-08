package principal;

public class Validador {
	

	
	public boolean validaNomeCliente(String nome) {
		boolean aux = true;
		
		if (nome.isEmpty()) {
			aux =  false;
		} else {
			aux = true;
		}
		return aux;
	}
	
	public boolean validaQuantidadeVenda(int quantidadeVenda) {
		
		boolean aux = true;
		
		if(quantidadeVenda == 0) {
			aux = false;
		} else {
			aux = true;
		}
		
		return aux;
	}
	
	public boolean validaTelefone(String telefone) {
		boolean aux = true;
		
		if(telefone.contains("@")) {
			aux = false;
		} else if (telefone.contains("!")) {
			aux = false;
		} else {
			aux = true;
		}
		
		return aux;
	}

}
