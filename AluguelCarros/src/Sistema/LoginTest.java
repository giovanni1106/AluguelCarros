package Sistema;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Pessoas.Admin;
import Pessoas.Usuario;

class LoginTest {

	@Test
	void testLogando() {
		BancoDados.cadastrarAdm[0] = new Admin("Login", "Senha");
		
		assertEquals(false, Login.Logando("Login", "a"));
		assertEquals(false, Login.Logando("a", "Senha"));
		assertEquals(true, Login.Logando("Login", "Senha"));
	}

}
