package Sistema;

import java.util.Calendar;

import Pessoas.Admin;
import Pessoas.Usuario;
import veiculo.Agencia;
import veiculo.Carro;
import veiculo.Classe;
import veiculo.CadeiraCrianca;
import veiculo.SeguroCarro;

public class BancoDados {

	// Valor inteiro para definir o maximo de cadastros
	public static int MAX = 6;

	// Chave para poder cadastrar um Adm
	public static String CHAVEADM = "X2iU7Ghl0@vbT";

	// Arrays para salvar os dados
	public static Usuario cadastrarUsuario[] = new Usuario[MAX];
	public static Admin cadastrarAdm[] = new Admin[MAX];
	public static Carro cadastrarCarro[] = new Carro[MAX];
	public static Classe cadastrarClasse[] = new Classe[MAX];
	public static Agencia cadastrarAgencia[] = new Agencia[MAX];
	public static CadeiraCrianca cadastrarCadeira[] = new CadeiraCrianca[MAX];
	public static SeguroCarro cadastrarSeguro[] = new SeguroCarro[MAX];
	public static Aluguel cadastrarAluguel[] = new Aluguel[MAX * 2];

	// Se o usuario conseguir logar
	public static boolean Logado = false;

	// Caso ele seja um Admin
	public static boolean Administrador = false;

	// Posi��o do no Array do Usuario/Admin logado
	public static int pos;

	/**
	 * Cria um array com todas as agencias que o carro est� vinculado
	 * 
	 * @param car Objeto carro
	 * @return Retorna um array com todas as agencias com o carro vinculado
	 */
	public static Agencia[] ImprimirAgencias(Carro car) {
		Agencia[] Agencias = new Agencia[MAX];
		int cont = 0;

		for (int i = 0; i < MAX; i++) {
			for (int a = 0; a < MAX; a++)
				if (cadastrarAgencia[i] != null)
					if (cadastrarAgencia[i].carro[a] == car && Agencias[cont] != cadastrarAgencia[i]) {
						Agencias[cont] = cadastrarAgencia[i];
						cont++;
					}
		}

		return Agencias;
	}

	/**
	 * Procura espa�o vazio no array de cadastrar usu�rio
	 * 
	 * @return Retorna a posi��o vazia
	 */
	public static int CadastrarUsu() {

		for (int a = 0; a < MAX; a++)
			if (cadastrarUsuario[a] == null)
				return a;

		return -1;
	}

	/**
	 * Procura espa�o vazio no array de cadastrar admin
	 * 
	 * @return Retorna a posi��o vazia
	 */
	public static int CadastrarAdmin() {

		for (int a = 0; a < MAX; a++)
			if (cadastrarAdm[a] == null)
				return a;

		return -1;
	}

	/**
	 * Procura espa�o vazio no array de cadastrar carro
	 * 
	 * @return Retorna a posi��o vazia
	 */
	public static int CadastrarCarro() {

		for (int a = 0; a < MAX; a++)
			if (cadastrarCarro[a] == null)
				return a;

		return -1;
	}

	/**
	 * Procura espa�o vazio no array de cadastrar classe
	 * 
	 * @return Retorna a posi��o vazia
	 */
	public static int CadastrarClasse() {
		for (int a = 0; a < MAX; a++)
			if (cadastrarClasse[a] == null)
				return a;

		return -1;
	}

	/**
	 * Procura espa�o vazio no array de cadastrar agencia
	 * 
	 * @return Retorna a posi��o vazia
	 */
	public static int CadastrarAgencia() {
		for (int a = 0; a < MAX; a++)
			if (cadastrarAgencia[a] == null)
				return a;

		return -1;
	}

	/**
	 * Procura espa�o vazio no array de cadastrar aluguel
	 * 
	 * @return Retorna a posicao vazia
	 */
	public static int CadastrarAluguel() {

		for (int a = 0; a < MAX; a++)
			if (cadastrarAluguel[a] == null)
				return a;

		return -1;
	}
	
	/**
	 * Procura espaço vazio no array de cadastrar seguro
	 * 
	 * @return Retorna a posicao vazia
	 */
	public static int CadastrarSeguro() {

		for (int a = 0; a < MAX; a++)
			if (cadastrarSeguro[a] == null)
				return a;

		return -1;
	}

	public static Carro[] ordenarCarros(String categoria) {
		int valor = 0;
		int valorCmp = 0;
		Carro aux;

		for(int i = cadastrarCarro.length-1; i > 0; i--) {
			if(cadastrarCarro[i] == null) continue;
			
			int[] response = retornaValor(categoria, i, i-1);
			
			valor = response[0];
			valorCmp = response[1];

			if(valor < valorCmp) {
				aux = cadastrarCarro[i-1];
				cadastrarCarro[i-1] = cadastrarCarro[i];
				cadastrarCarro[i] = aux;
			}
		}
		
		for (int i = 2; i <= cadastrarCarro.length-1; i++){						
			if(cadastrarCarro[i] == null) continue;
			Carro chave; 
			int j;
			
			chave = cadastrarCarro[i];
			j = i;
			
			int[] response = retornaValor(categoria, i, j-1);
			
			valor = response[0];
			valorCmp = response[1];
			
			while (valor < valorCmp){
				if(cadastrarCarro[j] == null) continue;

				cadastrarCarro[j] = cadastrarCarro[j-1];
				j--;
				
				valorCmp = retornaValor(categoria, 0, j-1)[1];
				
			}
			cadastrarCarro[j] = chave;
		}
				
		return cadastrarCarro;
	}

	private static int[] retornaValor(String categoria, int i, int j) {
		int[] retorno = {0, 0};
		switch(categoria) {
		case "preco":
			retorno[0] = cadastrarCarro[i].getClasse().getValorDia();
			retorno[1] = cadastrarCarro[j].getClasse().getValorDia();
			break;
		case "km":
			retorno[0] = cadastrarCarro[i].getKm();
			retorno[1] = cadastrarCarro[j].getKm();
			break;
		case "assentos":
			retorno[0] = cadastrarCarro[i].getAssentos();
			retorno[1] = cadastrarCarro[j].getAssentos();
			break;
		case "carga":
			retorno[0] = cadastrarCarro[i].getCarga();
			retorno[1] = cadastrarCarro[j].getCarga();
			break;
		case "ano":
			retorno[0] = cadastrarCarro[i].getAno();
			retorno[1] = cadastrarCarro[j].getAno();
			break;
		}
		
		return retorno;
	}
	
	
//	System.out.println("---- " + categoria);
//	for(int i = 0; i <= cadastrarCarro.length-1; i++) {
//		if(cadastrarCarro[i] == null) continue;
//		System.out.println(i + " - " + cadastrarCarro[i].getKm() + " - " + cadastrarCarro[i].getModelo());
//	}
//	System.out.println("\n");
	
	/**
	 * Preenche todos os arrays com dados pre cadastrados
	 */
	public static void DadosPreCadastrados() {

		// ================================== USUARIOS
		// ==================================
		// --------------------------------------------------------------------------------

		cadastrarUsuario[0] = new Usuario("Giovanni Alvissus Camargo Giampauli", "97413115085",
				"giovanni.acg@gmail.com", "Brasileiro", "Masculino", "(12) 99638-9028", "gioacg", "giovanni1106",
				"Rua 3", "35", "Bairro principal", "Cidade de Deus", "Estado do bem", "Melhor Pais");
		cadastrarUsuario[1] = new Usuario("Maria Luiza", "64626578047", "malu@gmail.com", "Brasileira", "Feminino",
				"(61) 99650-2450", "malu1212", "malu2809", "Rua 4", "70", "Bairro da capital", "Cidade do amanha",
				"Estado do mal", "Pa�s dos deuses");

		// ================================== ADMINISTRADORES
		// ==================================
		// --------------------------------------------------------------------------------

		cadastrarAdm[0] = new Admin("admin01", "123456");
		cadastrarAdm[1] = new Admin("admin02", "123456");

		// ==================================== CLASSES
		// ====================================
		// --------------------------------------------------------------------------------

		cadastrarClasse[0] = new Classe("SEDA", 90);

		cadastrarClasse[1] = new Classe("PICAPE", 150);

		cadastrarClasse[2] = new Classe("SUV", 180);

		cadastrarClasse[3] = new Classe("MINIVAN", 200);

		// ==================================== CARROS
		// ====================================
		// --------------------------------------------------------------------------------

		cadastrarCarro[0] = new Carro(cadastrarClasse[0], "ford", "fiesta", "preto", 300, "MAD-2809", false, 5, false,
				1, 1, false, 2, 0, 1, 2010);

		// SEDA
		cadastrarCarro[1] = new Carro(cadastrarClasse[0], "ford", "fiesta", "preto", 300, "MAD-2809", false, 5, false,
				1, 1, false, 2, 0, 1, 2012);

		cadastrarCarro[2] = new Carro(cadastrarClasse[0], "fiat", "uno", "verde", 500, "GHA-5675", true, 5, false, 1, 1,
				false, 2, 2, 1, 2020);

		cadastrarCarro[3] = new Carro(cadastrarClasse[0], "chevrolet", "onix", "prata", 200, "FGH-3267", true, 5, true,
				2, 1, true, 2, 0, 2, 2022);

		cadastrarCarro[4] = new Carro(cadastrarClasse[0], "hyundai", "hb20", "vermelho", 100, "KFT-3736", true, 5, true,
				2, 1, true, 2, 0, 2, 2018);

		// PICAPE
		cadastrarCarro[5] = new Carro(cadastrarClasse[1], "fiat", "strada", "azul", 3000, "OTH-8368", true, 2, true, 0,
				1, true, 2, 700, 1, 2018);

		cadastrarCarro[6] = new Carro(cadastrarClasse[1], "volkswagen", "saveiro", "prata", 6000, "KJS-2375", true, 2,
				true, 0, 1, true, 2, 700, 1, 2018);

		cadastrarCarro[7] = new Carro(cadastrarClasse[1], "toyota", "hilux", "preto", 4000, "JER-4363", true, 5, true,
				0, 2, true, 2, 1000, 2, 2018);

		cadastrarCarro[8] = new Carro(cadastrarClasse[1], "ford", "ranger", "vermelho", 3000, "EWY-2467", true, 5, true,
				0, 2, true, 2, 1000, 2, 2018);

		// SUV
		cadastrarCarro[9] = new Carro(cadastrarClasse[2], "ford", "ecosport", "azul", 1000, "JFO-3885", true, 5, true,
				4, 2, true, 1, 0, 2, 2018);

		cadastrarCarro[10] = new Carro(cadastrarClasse[2], "renault", "duster", "prata", 5000, "TGH-3256", true, 5,
				true, 4, 2, true, 1, 0, 2, 2010);

		cadastrarCarro[11] = new Carro(cadastrarClasse[2], "hyundai", "tucson", "preto", 200, "WFG-2345", true, 7, true,
				6, 2, true, 1, 0, 3, 2016);

		cadastrarCarro[12] = new Carro(cadastrarClasse[2], "jeep", "compassLongitude", "vermelho", 700, "MCG-2347",
				true, 7, true, 6, 2, true, 1, 0, 3, 2020);

		// MINIVAN
		cadastrarCarro[13] = new Carro(cadastrarClasse[3], "fiat", "doblo", "preto", 4500, "KFG-4578", true, 7, true, 2,
				1, true, 2, 0, 1, 2019);

		cadastrarCarro[14] = new Carro(cadastrarClasse[3], "chevrolet", "spin", "prata", 5000, "DFR-4853", true, 7,
				true, 4, 2, true, 1, 0, 2, 2016);

		// ================================== CADASTRAR AGENCIA
		// ==================================
		// --------------------------------------------------------------------------------

		cadastrarAgencia[0] = new Agencia("AG001", "Rua 3", "35", "Bairro principal", "S�o Paulo", "Estado do bem",
				"Melhor Pais");
		cadastrarAgencia[1] = new Agencia("AG002", "Rua 3", "35", "Bairro principal", "Bras�lia", "Estado do bem",
				"Melhor Pais");
		cadastrarAgencia[2] = new Agencia("AG003", "Rua 3", "35", "Bairro principal", "Manaus", "Estado do bem",
				"Melhor Pais");

		// ================================== VINCULAR VEICULOS COM AGENCIA
		// ==================================
		// --------------------------------------------------------------------------------

		cadastrarAgencia[0].setCarro(cadastrarCarro[0]);
		cadastrarAgencia[0].setCarro(cadastrarCarro[5]);
		cadastrarAgencia[0].setCarro(cadastrarCarro[8]);

		cadastrarAgencia[1].setCarro(cadastrarCarro[0]);
		cadastrarAgencia[1].setCarro(cadastrarCarro[3]);
		cadastrarAgencia[1].setCarro(cadastrarCarro[5]);
		cadastrarAgencia[1].setCarro(cadastrarCarro[7]);
		cadastrarAgencia[1].setCarro(cadastrarCarro[10]);
		cadastrarAgencia[1].setCarro(cadastrarCarro[14]);

		cadastrarAgencia[2].setCarro(cadastrarCarro[1]);
		cadastrarAgencia[2].setCarro(cadastrarCarro[2]);
		cadastrarAgencia[2].setCarro(cadastrarCarro[4]);
		cadastrarAgencia[2].setCarro(cadastrarCarro[7]);
		cadastrarAgencia[2].setCarro(cadastrarCarro[11]);
		cadastrarAgencia[2].setCarro(cadastrarCarro[13]);

		// ================================== CADASTRAR CADEIRAS
		// ==================================
		// --------------------------------------------------------------------------------

		cadastrarCadeira[0] = new CadeiraCrianca("Cadeira 1", 8, 5);
		cadastrarCadeira[1] = new CadeiraCrianca("Cadeira 2", 10, 10);
		cadastrarCadeira[2] = new CadeiraCrianca("Cadeira 3", 3, 5);
		cadastrarCadeira[3] = new CadeiraCrianca("Cadeira 4", 1, 10);

		// ================================== CADASTRAR SEGURO
		// ==================================
		// --------------------------------------------------------------------------------

		cadastrarSeguro[0] = new SeguroCarro("Seguro 1", "Muita coisa", 200);
		cadastrarSeguro[1] = new SeguroCarro("Seguro 2", "Coisa", 100);
		cadastrarSeguro[2] = new SeguroCarro("Seguro 3", "Pouca coisa", 50);

		// ================================== ALUGUEIS
		// ==================================
		// --------------------------------------------------------------------------------

		Calendar dataA = Calendar.getInstance();
		cadastrarAluguel[0] = new Aluguel(cadastrarUsuario[0], cadastrarAgencia[0], dataA, cadastrarAgencia[1], dataA,
				cadastrarSeguro[0], cadastrarCadeira[0], cadastrarCarro[0], 2000, 0);
		cadastrarAluguel[1] = new Aluguel(cadastrarUsuario[0], cadastrarAgencia[0], dataA, cadastrarAgencia[1], dataA,
				cadastrarSeguro[0], cadastrarCadeira[0], cadastrarCarro[3], 1500, 0);

	}
}
