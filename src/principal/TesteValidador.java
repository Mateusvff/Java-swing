package principal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteValidador {
	
	Validador v = new Validador();

	@Test
	void testValidaNomeCliente() {
		assertTrue(v.validaNomeCliente("Mateus")); //retorna true -> passa no teste
		assertTrue(v.validaNomeCliente("")); 	  // retorna false -> não passa no teste
		assertFalse(v.validaNomeCliente("Joaquim")); // retorna true -> não passa no teste
	}

	@Test
	void testValidaQuantidadeVenda() {
		assertEquals(true, 10);  //retorna true -> passa no teste
		assertEquals(true, 0); //retorna false -> não passa no teste
		assertTrue(v.validaQuantidadeVenda(15)); //retorna true -> passa no teste
	}

	@Test
	void testValidaTelefone() {
		assertEquals(true, "99985-7456");  //retorna true -> passa no teste
		assertEquals(false, "!98163-1750"); // retorna false -> passa no teste
		assertTrue(v.validaTelefone("@981631750")); //retorna false -> não passa no teste
	}

}
