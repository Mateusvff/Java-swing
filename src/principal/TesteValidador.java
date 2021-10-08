package principal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import view.cliente.Validador;

class TesteValidador {
	
	Validador validador = new Validador();

	@Test
	void testValidaNome() {
		assertTrue(validador.validaNome("Mateus"));
	}

}
