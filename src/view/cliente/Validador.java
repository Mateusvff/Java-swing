package view.cliente;

public class Validador {

	// TESTE PARA VALIDAR SE HÁ UM NOME VAZIO
	
	public boolean validaNome(String nome) {
		boolean aux = true;
		
		if (nome.isEmpty()) {
			aux =  false;
		} else {
			aux = true;
		}
		return aux;
	}

}
