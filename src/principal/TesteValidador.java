package principal;

/**
 * Implementa os testes unit�rios do m�todo Validador
 * @author Mateus Vin�cius
 * @version 1.0 (Out 2021)
 */
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteValidador {
	
	Validador v = new Validador();

	/**
	 * Testa se o m�todo de valida��o do nome de usu�rio est� funcionando
	 * O campo de texto n�o pode ser nulo
	 * @author Mateus Vin�cius
	 * @version 1.0 (Out 2021)
	 */
	@Test
	void testValidaNomeCliente() {
		assertTrue(v.validaNomeCliente("Mateus")); 
		assertTrue(v.validaNomeCliente("")); 	  
		assertFalse(v.validaNomeCliente("Joaquim")); 
	}

	/**
	 * Testa se o m�todo de valida��o da quantidade vendida est� funcionando
	 * O valor preenchido n�o pode ser igual a 0
	 * @author Mateus Vin�cius
	 * @version 1.0 (Out 2021)
	 */
	@Test
	void testValidaQuantidadeVenda() {
		assertEquals(true, 10);
		assertEquals(true, 0); 
		assertTrue(v.validaQuantidadeVenda(15));
	}

	/**
	 * Testa se o telefone digitado possui caracteres n�o num�ricos
	 * O campo de telefone deve receber apenas n�meros
	 * @author Mateus Vin�cius
	 * @version 1.0 (Out 2021)
	 */
	@Test
	void testValidaTelefone() {
		assertEquals(true, "99985-7456");  //retorna true -> passa no teste
		assertEquals(false, "!98163-1750"); // retorna false -> passa no teste
		assertTrue(v.validaTelefone("@981631750")); //retorna false -> n�o passa no teste
	}

}
