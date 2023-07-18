package Sistema;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import veiculo.Classe;
import veiculo.Carro;

class BancoDadosTest {	
	
	@Before
	public void setData() {
		//Dados carregados no banco de dados
		BancoDados.cadastrarClasse[0] = new Classe("SEDA", 90);
		BancoDados.cadastrarClasse[1] = new Classe("PICAPE", 150);
		BancoDados.cadastrarClasse[2] = new Classe("SUV", 180);

		BancoDados.cadastrarCarro[0] = new Carro(BancoDados.cadastrarClasse[2], "ford", "fiesta", "preto", 3000, "MAD-2809", false, 5, false,
					1, 1, false, 2, 0, 1, 2012);

		BancoDados.cadastrarCarro[1] = new Carro(BancoDados.cadastrarClasse[2], "fiat", "uno", "verde", 500, "GHA-5675", true, 5, false, 1, 1,
					false, 2, 2, 1, 2020);

		BancoDados.cadastrarCarro[2] = new Carro(BancoDados.cadastrarClasse[1], "fiat", "strada", "azul", 300, "OTH-8368", true, 2, true, 0,
					1, true, 2, 700, 1, 2018);

		BancoDados.cadastrarCarro[3] = new Carro(BancoDados.cadastrarClasse[1], "volkswagen", "saveiro", "prata", 6000, "KJS-2375", true, 2,
					true, 0, 1, true, 2, 700, 1, 2018);

		BancoDados.cadastrarCarro[4] = new Carro(BancoDados.cadastrarClasse[0], "ford", "ecosport", "azul", 1000, "JFO-3885", true, 5, true,
					4, 2, true, 1, 0, 2, 2018);

		BancoDados.cadastrarCarro[5] = new Carro(BancoDados.cadastrarClasse[0], "renault", "duster", "prata", 5000, "TGH-3256", true, 5,
					true, 4, 2, true, 1, 0, 2, 2010);
	}
	
	public void setDataEqual() {
		//Dados carregados no banco de dados
		BancoDados.cadastrarClasse[0] = new Classe("SEDA", 150);
		BancoDados.cadastrarClasse[1] = new Classe("PICAPE", 150);
		BancoDados.cadastrarClasse[2] = new Classe("SUV", 150);

		BancoDados.cadastrarCarro[0] = new Carro(BancoDados.cadastrarClasse[2], "ford", "fiesta", "preto", 2500, "MAD-2809", false, 5, false,
					1, 1, false, 2, 0, 1, 2018);

		BancoDados.cadastrarCarro[1] = new Carro(BancoDados.cadastrarClasse[2], "fiat", "uno", "verde", 2500, "GHA-5675", true, 5, false, 1, 1,
					false, 2, 2, 1, 2018);

		BancoDados.cadastrarCarro[2] = new Carro(BancoDados.cadastrarClasse[1], "fiat", "strada", "azul", 2500, "OTH-8368", true, 5, true, 0,
					1, true, 2, 700, 1, 2018);

		BancoDados.cadastrarCarro[3] = new Carro(BancoDados.cadastrarClasse[1], "volkswagen", "saveiro", "prata", 2500, "KJS-2375", true, 5,
					true, 0, 1, true, 2, 700, 1, 2018);

		BancoDados.cadastrarCarro[4] = new Carro(BancoDados.cadastrarClasse[0], "ford", "ecosport", "azul", 2500, "JFO-3885", true, 5, true,
					4, 2, true, 1, 0, 2, 2018);

		BancoDados.cadastrarCarro[5] = new Carro(BancoDados.cadastrarClasse[0], "renault", "duster", "prata", 2500, "TGH-3256", true, 5,
					true, 4, 2, true, 1, 0, 2, 2018);
	}
	
	public void setDataNull() {
		//Dados carregados no banco de dados
				BancoDados.cadastrarClasse[0] = new Classe("SEDA", 150);
				BancoDados.cadastrarClasse[1] = new Classe("PICAPE", 150);
				BancoDados.cadastrarClasse[2] = new Classe("SUV", 150);

				BancoDados.cadastrarCarro[0] = null;

				BancoDados.cadastrarCarro[1] = null;

				BancoDados.cadastrarCarro[2] = null;

				BancoDados.cadastrarCarro[3] = null;

				BancoDados.cadastrarCarro[4] = null;

				BancoDados.cadastrarCarro[5] = null;
	}
	
	public void setDataSortedReverse() {
		//Dados carregados no banco de dados
		BancoDados.cadastrarClasse[0] = new Classe("SEDA", 90);
		BancoDados.cadastrarClasse[1] = new Classe("PICAPE", 150);
		BancoDados.cadastrarClasse[2] = new Classe("SUV", 180);

		BancoDados.cadastrarCarro[0] = new Carro(BancoDados.cadastrarClasse[2], "ford", "fiesta", "preto", 3000, "MAD-2809", false, 5, false,
					1, 1, false, 2, 0, 1, 2012);

		BancoDados.cadastrarCarro[1] = new Carro(BancoDados.cadastrarClasse[2], "fiat", "uno", "verde", 500, "GHA-5675", true, 5, false, 1, 1,
					false, 2, 2, 1, 2020);

		BancoDados.cadastrarCarro[2] = new Carro(BancoDados.cadastrarClasse[1], "fiat", "strada", "azul", 300, "OTH-8368", true, 2, true, 0,
					1, true, 2, 700, 1, 2018);

		BancoDados.cadastrarCarro[3] = new Carro(BancoDados.cadastrarClasse[1], "volkswagen", "saveiro", "prata", 6000, "KJS-2375", true, 2,
					true, 0, 1, true, 2, 700, 1, 2018);

		BancoDados.cadastrarCarro[4] = new Carro(BancoDados.cadastrarClasse[0], "ford", "ecosport", "azul", 1000, "JFO-3885", true, 5, true,
					4, 2, true, 1, 0, 2, 2018);

		BancoDados.cadastrarCarro[5] = new Carro(BancoDados.cadastrarClasse[0], "renault", "duster", "prata", 5000, "TGH-3256", true, 5,
					true, 4, 2, true, 1, 0, 2, 2010);
		
		BancoDados.cadastrarCarro = new Carro[] {BancoDados.cadastrarCarro[5], BancoDados.cadastrarCarro[4], BancoDados.cadastrarCarro[1], BancoDados.cadastrarCarro[0], 
				BancoDados.cadastrarCarro[3], BancoDados.cadastrarCarro[2]};
	}
	
	public void setDataSorted(){
		//Dados carregados no banco de dados
		BancoDados.cadastrarClasse[0] = new Classe("SEDA", 90);
		BancoDados.cadastrarClasse[1] = new Classe("PICAPE", 150);
		BancoDados.cadastrarClasse[2] = new Classe("SUV", 180);

		BancoDados.cadastrarCarro[0] = new Carro(BancoDados.cadastrarClasse[2], "ford", "fiesta", "preto", 3000, "MAD-2809", false, 5, false,
					1, 1, false, 2, 0, 1, 2012);

		BancoDados.cadastrarCarro[1] = new Carro(BancoDados.cadastrarClasse[2], "fiat", "uno", "verde", 500, "GHA-5675", true, 5, false, 1, 1,
					false, 2, 2, 1, 2020);

		BancoDados.cadastrarCarro[2] = new Carro(BancoDados.cadastrarClasse[1], "fiat", "strada", "azul", 300, "OTH-8368", true, 2, true, 0,
					1, true, 2, 700, 1, 2018);

		BancoDados.cadastrarCarro[3] = new Carro(BancoDados.cadastrarClasse[1], "volkswagen", "saveiro", "prata", 6000, "KJS-2375", true, 2,
					true, 0, 1, true, 2, 700, 1, 2018);

		BancoDados.cadastrarCarro[4] = new Carro(BancoDados.cadastrarClasse[0], "ford", "ecosport", "azul", 1000, "JFO-3885", true, 5, true,
					4, 2, true, 1, 0, 2, 2018);

		BancoDados.cadastrarCarro[5] = new Carro(BancoDados.cadastrarClasse[0], "renault", "duster", "prata", 5000, "TGH-3256", true, 5,
					true, 4, 2, true, 1, 0, 2, 2010);
		
		BancoDados.cadastrarCarro = new Carro[] {BancoDados.cadastrarCarro[5], BancoDados.cadastrarCarro[0], BancoDados.cadastrarCarro[2], BancoDados.cadastrarCarro[4], 
				BancoDados.cadastrarCarro[3], BancoDados.cadastrarCarro[1]};
	}

	@Test
	public void ordenacaoCarros_Ciclo1() {
		setData();
		Carro[] auxiliar;
		
		// ordenar colocando o menor preço em primeiro na lista
		auxiliar = new Carro[] {BancoDados.cadastrarCarro[4]};
		
		assertEquals(auxiliar[0], BancoDados.ordenarCarros("preco")[0]);
		
		// ordenar colocando o menor km em primeiro na lista
		
		auxiliar = new Carro[] {BancoDados.cadastrarCarro[2]};
		
		assertEquals(auxiliar[0], BancoDados.ordenarCarros("km")[0]);
	}
	
	@Test
	public void ordenacaoCarros_Ciclo2() {
		setData();
		Carro[] auxiliar;
		
		// ordenar colocando a menor quantidade de assentos em primeiro na lista
		auxiliar = new Carro[] {BancoDados.cadastrarCarro[2]};
		
		assertEquals(auxiliar[0],BancoDados.ordenarCarros("assentos")[0]);
		
		// ordenar colocando a menor carga em primeiro na lista
		
		auxiliar = new Carro[] {BancoDados.cadastrarCarro[2]};
		
		assertEquals(auxiliar[0],BancoDados.ordenarCarros("carga")[0]);
		
		// ordenar colocando o menor ano em primeiro na lista
		
		auxiliar = new Carro[] {BancoDados.cadastrarCarro[2]};
		
		assertEquals(auxiliar[0],BancoDados.ordenarCarros("ano")[0]);
	}
	
	@Test
	public void ordenacaoCarroS_Ciclo3() {
		setData();
		Carro[] auxiliar;
		
		// ordenar a lista completa de preços em ordem crescente
		auxiliar = new Carro[] {BancoDados.cadastrarCarro[4], BancoDados.cadastrarCarro[5], BancoDados.cadastrarCarro[2], BancoDados.cadastrarCarro[3], 
				BancoDados.cadastrarCarro[0], BancoDados.cadastrarCarro[1]};
		
		assert(Arrays.equals(auxiliar, BancoDados.ordenarCarros("preco")));
		
		// ordenar a lista completa de km em ordem crescente
		
		auxiliar = new Carro[] {BancoDados.cadastrarCarro[2], BancoDados.cadastrarCarro[5], BancoDados.cadastrarCarro[0], BancoDados.cadastrarCarro[4], 
				BancoDados.cadastrarCarro[1], BancoDados.cadastrarCarro[3]};
		
		assert(Arrays.equals(auxiliar,BancoDados.ordenarCarros("km")));
		
		
	}

	@Test
	public void ordenacaoCarroS_Ciclo4() {
		setData();
		Carro[] auxiliar;
		
		// ordenar a lista completa de assentos em ordem crescente
		
		auxiliar = new Carro[] {BancoDados.cadastrarCarro[2], BancoDados.cadastrarCarro[3], BancoDados.cadastrarCarro[0], BancoDados.cadastrarCarro[1], 
				BancoDados.cadastrarCarro[4], BancoDados.cadastrarCarro[5]};
		
		assert(Arrays.equals(auxiliar, BancoDados.ordenarCarros("assentos")));
		
		// ordenar a lista completa de carga em ordem crescente
	
		auxiliar = new Carro[] {BancoDados.cadastrarCarro[2], BancoDados.cadastrarCarro[4], BancoDados.cadastrarCarro[5], BancoDados.cadastrarCarro[3], 
				BancoDados.cadastrarCarro[0], BancoDados.cadastrarCarro[1]};
		
		assert(Arrays.equals(auxiliar,BancoDados.ordenarCarros("carga")));
		
		// ordenar a lista completa de ano em ordem crescente
		
		auxiliar = new Carro[] {BancoDados.cadastrarCarro[2], BancoDados.cadastrarCarro[0], BancoDados.cadastrarCarro[1], BancoDados.cadastrarCarro[4], 
				BancoDados.cadastrarCarro[5], BancoDados.cadastrarCarro[3]};
		
		assert(Arrays.equals(auxiliar,BancoDados.ordenarCarros("ano")));
		
	}
	
	@Test
	public void ordenacaoCarroS_Ciclo5() {
		
		Carro[] auxiliar;
		
		// seta os dados do vetor com todos os dados iguais
		setDataEqual();
		
		// ordenar a lista completa de preços em ordem crescente quando todos os vaores sao iguais
		auxiliar = new Carro[] {BancoDados.cadastrarCarro[0], BancoDados.cadastrarCarro[1], BancoDados.cadastrarCarro[2], BancoDados.cadastrarCarro[3], 
				BancoDados.cadastrarCarro[4], BancoDados.cadastrarCarro[5]};
		
		assert(Arrays.equals(auxiliar, BancoDados.ordenarCarros("preco")));
		
		// seta os dados do vetor com todos os dados nulos
		setDataNull();
		
		// ordenar a lista completa de km em ordem crescente quando todos os dados são nulos
		Carro[] auxiliar_ = {null, null, null, null, null, null};
		
		assert(Arrays.equals(auxiliar_, BancoDados.ordenarCarros("km")));
		
		// seta os dados de maneira decrescente de acordo com os assentos
		setDataSortedReverse();
		
		// ordenar a lista completa de assentos em ordem crescente
		auxiliar = new Carro[] {BancoDados.cadastrarCarro[4], BancoDados.cadastrarCarro[5], BancoDados.cadastrarCarro[0], BancoDados.cadastrarCarro[1], 
				BancoDados.cadastrarCarro[2], BancoDados.cadastrarCarro[3]};
		
		assert(Arrays.equals(auxiliar, BancoDados.ordenarCarros("assentos")));
		
		// Seta os dados de maneira ordenada de acordo com o ano
		setDataSorted();
		
		// ordenar a lista completa de ano em ordem crescente	
		auxiliar = new Carro[] {BancoDados.cadastrarCarro[0], BancoDados.cadastrarCarro[1], BancoDados.cadastrarCarro[2], BancoDados.cadastrarCarro[3], 
				BancoDados.cadastrarCarro[4], BancoDados.cadastrarCarro[5]};
		
		assert(Arrays.equals(auxiliar,BancoDados.ordenarCarros("ano")));
				
	}

}