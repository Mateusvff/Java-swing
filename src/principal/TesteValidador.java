package principal;

/**
 * Implementa os testes unitários do método Validador
 * @author Mateus Vinícius
 * @version 1.0 (Out 2021)
 */
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteValidador {
	
	Validador v = new Validador();

	/**
	 * Testa se o método de validação do nome de usuário está funcionando
	 * O campo de texto não pode ser nulo
	 * @author Mateus Vinícius
	 * @version 1.0 (Out 2021)
	 */
	@Test
	void testValidaNomeCliente() {
		assertTrue(v.validaNomeCliente("Mateus")); 
		assertTrue(v.validaNomeCliente("")); 	  
		assertFalse(v.validaNomeCliente("Joaquim")); 
	}

	/**
	 * Testa se o método de validação da quantidade vendida está funcionando
	 * O valor preenchido não pode ser igual a 0
	 * @author Mateus Vinícius
	 * @version 1.0 (Out 2021)
	 */
	@Test
	void testValidaQuantidadeVenda() {
		assertEquals(true, 10);
		assertEquals(true, 0); 
		assertTrue(v.validaQuantidadeVenda(15));
	}

	/**
	 * Testa se o telefone digitado possui caracteres não numéricos
	 * O campo de telefone deve receber apenas números
	 * @author Mateus Vinícius
	 * @version 1.0 (Out 2021)
	 */
	@Test
	void testValidaTelefone() {
		assertEquals(true, "99985-7456");  //retorna true -> passa no teste
		assertEquals(false, "!98163-1750"); // retorna false -> passa no teste
		assertTrue(v.validaTelefone("@981631750")); //retorna false -> não passa no teste
	}

}
