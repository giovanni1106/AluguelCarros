package Pessoas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UsuarioTest {

	@Test
	void testIsCPF() {
		assertEquals(false, Usuario.isCPF("123456789"));
		assertEquals(true, Usuario.isCPF("95337616013"));
	}

}
