package veiculo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Sistema.BancoDados;
import Sistema.Login;

class AgenciaTest {

	@Test
	void testTesteId() {
		BancoDados.cadastrarAgencia[0] = new Agencia("AG001", "Rua 3", "35", "Bairro principal", "São Paulo", "Estado do bem",
				"Melhor Pais");
		
		assertEquals(false, Agencia.TesteId("AG001"));
		assertEquals(true, Agencia.TesteId("AG002"));
	}
}
