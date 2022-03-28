package Sistema;

import Pessoas.Admin;
import Pessoas.Usuario;
import veiculo.Agencia;
import veiculo.Carro;
import veiculo.Classe;

public class BancoDados {

	// Valor inteiro para definir o maximo de cadastros
	public static int MAX = 1000;
	
	// Chave para poder cadastrar um Adm
	public static String CHAVEADM = "X2iU7Ghl0@vbT";

	// Arrays para salvar os dados
	public static Usuario cadastrarUsuario[] = new Usuario[MAX];
	public static Admin cadastrarAdm[] = new Admin[MAX];
	public static Carro cadastrarCarro[] = new Carro[MAX];
	public static Classe cadastrarClasse[] = new Classe[MAX];
	public static Agencia cadastrarAgencia[] = new Agencia[MAX];
	
	// Se o usuario conseguir logar
	public static boolean Logado = false;	
	
	// Caso ele seja um Admin
	public static boolean Administrador = false;
	
	// Posição do no Array do Usuario/Admin logado
	public static int pos;
	
	public static int CadastrarUsu() {

		for (int a = 0; a < MAX; a++)
			if (cadastrarUsuario[a] == null)
				return a;

		return -1;
	}
	
	public static int CadastrarAdmin() {

		for (int a = 0; a < MAX; a++)
			if (cadastrarAdm[a] == null)
				return a;

		return -1;
	}
	
	public static void DadosPreCadastrados() {

		// ================================== USUARIOS
		// ==================================
		// --------------------------------------------------------------------------------

		cadastrarUsuario[0] = new Usuario("Giovanni Alvissus Camargo Giampauli", "97413115085", "giovanni.acg@gmail.com", "Brasileiro", "Masculino",
				"(12) 99638-9028", "gioacg", "giovanni1106", "Rua 3", "35", "Bairro principal", "Cidade de Deus",
				"Estado do bem", "Melhor Pais");
		cadastrarUsuario[1] = new Usuario("Maria Luiza", "64626578047", "malu@gmail.com", "Brasileira", "Feminino",
				"(61) 99650-2450", "malu1212", "malu2809", "Rua 4", "70", "Bairro da capital", "Cidade do amanha",
				"Estado do mal", "País dos deuses");

		// ================================== ADMINISTRADORES
		// ==================================
		// --------------------------------------------------------------------------------

		cadastrarAdm[0] = new Admin("admin01", "123456");
		cadastrarAdm[1] = new Admin("admin02", "123456");

		// ==================================== CLASSES
		// ====================================
		// --------------------------------------------------------------------------------

		cadastrarClasse[0] = new Classe("SEDA", 90, "Porta malas espacoso", true, true, true, true, true, true, true);

		cadastrarClasse[1] = new Classe("PICAPE", 150, "Capaz de carregar cargas pesadas", true, true, true, true, true,
				true, true);

		cadastrarClasse[2] = new Classe("SUV", 180, "Grande para toda a familia", true, true, true, true, true, true,
				true);

		cadastrarClasse[3] = new Classe("MINIVAN", 200, "Para passeios longos", true, true, true, true, true, true,
				true);

		// ==================================== CARROS
		// ====================================
		// --------------------------------------------------------------------------------

		cadastrarCarro[0] = new Carro(cadastrarClasse[0], "ford", "fiesta", "preto", 300, "MAD-2809", false, 5, false,
				1, 1, false, 2, 0, 1);

		// SEDA
		cadastrarCarro[1] = new Carro(cadastrarClasse[0], "ford", "fiesta", "preto", 300, "MAD-2809", false, 5, false,
				1, 1, false, 2, 0, 1);

		cadastrarCarro[2] = new Carro(cadastrarClasse[0], "fiat", "uno", "verde", 500, "GHA-5675", true, 5, false, 1, 1,
				false, 2, 2, 1);

		cadastrarCarro[3] = new Carro(cadastrarClasse[0], "chevrolet", "onix", "prata", 200, "FGH-3267", true, 5, true,
				2, 1, true, 2, 0, 2);

		cadastrarCarro[4] = new Carro(cadastrarClasse[0], "hyundai", "hb20", "vermelho", 100, "KFT-3736", true, 5, true,
				2, 1, true, 2, 0, 2);

		// PICAPE
		cadastrarCarro[5] = new Carro(cadastrarClasse[1], "fiat", "strada", "azul", 3000, "OTH-8368", true, 2, true, 0,
				1, true, 2, 700, 1);

		cadastrarCarro[6] = new Carro(cadastrarClasse[1], "volkswagen", "saveiro", "prata", 6000, "KJS-2375", true, 2,
				true, 0, 1, true, 2, 700, 1);

		cadastrarCarro[7] = new Carro(cadastrarClasse[1], "toyota", "hilux", "preto", 4000, "JER-4363", true, 5, true,
				0, 2, true, 2, 1000, 2);

		cadastrarCarro[8] = new Carro(cadastrarClasse[1], "ford", "ranger", "vermelho", 3000, "EWY-2467", true, 5, true,
				0, 2, true, 2, 1000, 2);

		// SUV
		cadastrarCarro[9] = new Carro(cadastrarClasse[2], "ford", "ecosport", "azul", 1000, "JFO-3885", true, 5, true,
				4, 2, true, 1, 0, 2);

		cadastrarCarro[10] = new Carro(cadastrarClasse[2], "renault", "duster", "prata", 5000, "TGH-3256", true, 5,
				true, 4, 2, true, 1, 0, 2);

		cadastrarCarro[11] = new Carro(cadastrarClasse[2], "hyundai", "tucson", "preto", 200, "WFG-2345", true, 7, true,
				6, 2, true, 1, 0, 3);

		cadastrarCarro[12] = new Carro(cadastrarClasse[2], "jeep", "compassLongitude", "vermelho", 700, "MCG-2347",
				true, 7, true, 6, 2, true, 1, 0, 3);

		// MINIVAN
		cadastrarCarro[13] = new Carro(cadastrarClasse[3], "fiat", "doblo", "preto", 4500, "KFG-4578", true, 7, true, 2,
				1, true, 2, 0, 1);

		cadastrarCarro[14] = new Carro(cadastrarClasse[3], "chevrolet", "spin", "prata", 5000, "DFR-4853", true, 7,
				true, 4, 2, true, 1, 0, 2);

		// ================================== CADASTRAR AGENCIA
		// ==================================
		// --------------------------------------------------------------------------------
		
		cadastrarAgencia[0] = new Agencia("AG001", "Rua 3", "35", "Bairro principal", "São Paulo",
				"Estado do bem", "Melhor Pais");
		cadastrarAgencia[1] = new Agencia("AG002", "Rua 3", "35", "Bairro principal", "Brasília",
				"Estado do bem", "Melhor Pais");
		cadastrarAgencia[2] = new Agencia("AG003", "Rua 3", "35", "Bairro principal", "Manaus",
				"Estado do bem", "Melhor Pais");
		
		

		// ================================== VINCULAR VEICULOS COM AGENCIA
		// ==================================
		// --------------------------------------------------------------------------------

		Agencia.VincularCarroBD(cadastrarCarro[0], cadastrarAgencia[0]);
		Agencia.VincularCarroBD(cadastrarCarro[3], cadastrarAgencia[0]);
		Agencia.VincularCarroBD(cadastrarCarro[5], cadastrarAgencia[0]);
		
		Agencia.VincularCarroBD(cadastrarCarro[1], cadastrarAgencia[1]);
		Agencia.VincularCarroBD(cadastrarCarro[6], cadastrarAgencia[1]);
		Agencia.VincularCarroBD(cadastrarCarro[10], cadastrarAgencia[1]);
		Agencia.VincularCarroBD(cadastrarCarro[12], cadastrarAgencia[1]);
		
		Agencia.VincularCarroBD(cadastrarCarro[2], cadastrarAgencia[2]);
		Agencia.VincularCarroBD(cadastrarCarro[4], cadastrarAgencia[2]);
		Agencia.VincularCarroBD(cadastrarCarro[7], cadastrarAgencia[2]);
		Agencia.VincularCarroBD(cadastrarCarro[8], cadastrarAgencia[2]);
		Agencia.VincularCarroBD(cadastrarCarro[9], cadastrarAgencia[2]);
		Agencia.VincularCarroBD(cadastrarCarro[11], cadastrarAgencia[2]);
		Agencia.VincularCarroBD(cadastrarCarro[13], cadastrarAgencia[2]);
		Agencia.VincularCarroBD(cadastrarCarro[14], cadastrarAgencia[2]);
		
	}
}
