package Pessoas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Sistema.BancoDados;

class AdminTest {

	@Test
	void testTesteLogin() {
		BancoDados.cadastrarAdm[0] = new Admin("Login1", "123");
		
		assertEquals(false, Admin.TesteLogin("Login1"));
	}
}
