package app;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Teste {

	public static Scanner ler = new Scanner(System.in);

	public static boolean Logado = false;
	public static boolean Administrador = false;

	public static int MAX = 1000;

	public static Usuario cadastrar[] = new Usuario[MAX];
	public static Admin cadastrarAdm[] = new Admin[MAX];
	public static Carro cadastrarCarro[] = new Carro[MAX];
	public static Classe cadastrarClasse[] = new Classe[MAX];
	public static Agencia cadastrarAgencia[] = new Agencia[MAX];

	// Chave para poder cadastrar um Adm
	public static String chaveAdm = "X2iU7Ghl0@vbT";

	public static int pos;

	public static void main(String[] args) {
		char escolha = 0;
		int repeat = 0;
		boolean exit = false;

		BancoDeDados(); // Preenche o programa com dados pre cadastrados

		do {
			while (Logado == false) {

				TelaLogin();

				do {
					System.out.print(" Escolha uma opção(1-4): ");
					escolha = ler.next().charAt(0);
					System.out.print("\n");

					switch (escolha) {
					case '1':
						Login.Logando();
						repeat = 0;
						break;
					case '2':
						Usuario.Cadastrar();
						repeat = 0;
						break;
					case '3':
						Admin.Cadastro();
						repeat = 0;
						break;
					case '4':
						exit = true;
						break;
					case 'P':
						PrintCPFUsuarios();
						repeat = 0;
						break;
					default:
						System.out.print(" Favor inserir uma opção entre 1 e 4!\n\n");
						repeat = 1;
					}
				} while (repeat == 1);
			}

			while (Logado == true) {
				if (Administrador == false) {

					Menu();

					do {
						System.out.print(" Escolha uma opção(1-6): ");
						escolha = ler.next().charAt(0);
						System.out.print("\n");

						switch (escolha) {
						case '1':
							Usuario.ImprimirPerfil();
							repeat = 0;
							break;
						case '2':
							Usuario.Editar();
							repeat = 0;
							break;
						case '3':
							Logado = false;
							repeat = 0;
							break;
						case '4':
							exit = true;
							break;
						case 'P':
							PrintCPFUsuarios();
							repeat = 0;
							break;
						default:
							System.out.print(" Favor inserir uma opção entre 1 e 6!\n\n");
							repeat = 1;
						}
					} while (repeat == 1);

				} else {

					MenuAdm();

					do {
						System.out.print(" Escolha uma opção(1-7): ");
						escolha = ler.next().charAt(0);
						System.out.print("\n");

						switch (escolha) {
						case '1':
							MenuClasse();
							repeat = 0;
							break;
						case '2':
							MenuCarro();
							repeat = 0;
							break;
						case '3':
							MenuAgencia();
							break;
						case 'P':
							PrintCPFUsuarios();
							repeat = 0;
							break;
						default:
							System.out.print(" Favor inserir uma opção entre 1 e 7!\n\n");
							repeat = 1;
						}
					} while (repeat == 1);

				}
			}

		} while (exit == false);

	}

	public static void TelaLogin() {
		System.out.print("=================================================\n\n");
		System.out.print("                    TELA DE LOGIN\n");
		System.out.print("-------------------------------------------------\n\n");
		System.out.print("  1- Login\n");
		System.out.print("  2- Cadastrar Usuario\n");
		System.out.print("  3- Cadastrar Admin\n");
		System.out.print("  4- Sair\n\n");
		System.out.print("-------------------------------------------------\n\n");
	}

	public static void Menu() {
		System.out.print("=================================================\n");
		System.out.print("                 ALUGUEL DE CARROS\n");
		System.out.print("-------------------------------------------------\n");
		System.out.println("------------------Opcoes da conta----------------\n");
		System.out.print(" 1- Perfil\n");
		System.out.print(" 2- Editar\n");
		System.out.print(" 3- Deslogar\n");
		System.out.print(" 4- Sair\n");
		System.out.print("-------------------------------------------------\n");
		System.out.println("------------------Opcoes de busca----------------\n");
		System.out.print(" 5- Buscar veículos por classe\n");
		System.out.print(" 6- Buscar veículos por marca\n");
		System.out.print(" 7- Buscar veículos por preço\n");
		System.out.print("-------------------------------------------------\n\n");
	}

	public static void MenuAdm() {
		System.out.print("=================================================\n\n");
		System.out.print("                        ADMIN\n");
		System.out.print("-------------------------------------------------\n\n");
		System.out.print("  1- Classe\n");
		System.out.print("  2- Carro\n");
		System.out.print("  3- Agencia\n");
		System.out.print("  4- Usuarios\n");
		System.out.print("  5- Tarifas\n");
		System.out.print("  6- Deslogar\n");
		System.out.print("  7- Sair\n\n");
		System.out.print("-------------------------------------------------\n\n");
	}

	public static void MenuClasse() {
		boolean exit = false;

		do {
			System.out.print("=================================================\n\n");
			System.out.print("                        CLASSE\n");
			System.out.print("-------------------------------------------------\n\n");
			System.out.print("  1- Cadastrar\n");
			System.out.print("  2- Excluir\n");
			System.out.print("  3- Listar\n");
			System.out.print("  4- Voltar\n");
			System.out.print("-------------------------------------------------\n\n");

			char escolha = 0;
			int repeat = 0;

			do {
				System.out.print(" Escolha uma opção(1-4): ");
				escolha = ler.next().charAt(0);
				System.out.print("\n");

				switch (escolha) {
				case '1':
					Classe.Cadastrar();
					repeat = 0;
					break;
				case '2':
					Classe.Excluir();
					repeat = 0;
					break;
				case '3':
					Classe.Imprimir();
					repeat = 0;
					break;
				case '4':
					repeat = 0;
					exit = true;
					break;
				default:
					System.out.print(" Favor inserir uma opção entre 1 e 4!\n\n");
					repeat = 1;
				}
			} while (repeat == 1);
		} while (exit == false);
	}

	public static void MenuCarro() {
		boolean exit = false;

		do {
			System.out.print("=================================================\n\n");
			System.out.print("                        CARRO\n");
			System.out.print("-------------------------------------------------\n\n");
			System.out.print("  1- Cadastrar\n");
			System.out.print("  2- Excluir\n");
			System.out.print("  3- Listar\n");
			System.out.print("  4- Voltar\n");
			System.out.print("-------------------------------------------------\n\n");

			char escolha = 0;
			int repeat = 0;

			do {
				System.out.print(" Escolha uma opção(1-4): ");
				escolha = ler.next().charAt(0);
				System.out.print("\n");

				switch (escolha) {
				case '1':
					Carro.Cadastrar();
					repeat = 0;
					break;
				case '2':
					Carro.Excluir();
					;
					break;
				case '3':
					Carro.Imprimir();
					repeat = 0;
					break;
				case '4':
					repeat = 0;
					exit = true;
					break;
				default:
					System.out.print(" Favor inserir uma opção entre 1 e 4!\n\n");
					repeat = 1;
				}
			} while (repeat == 1);
		} while (exit == false);
	}

	public static void MenuAgencia() {
		boolean exit = false;

		do {
			System.out.print("=================================================\n\n");
			System.out.print("                        Agencia\n");
			System.out.print("-------------------------------------------------\n\n");
			System.out.print("  1- Cadastrar\n");
			System.out.print("  2- Excluir\n");
			System.out.print("  3- Listar\n");
			System.out.print("  4- Vincular carro\n");
			System.out.print("  5- Desvincular carro\n");
			System.out.print("  6- Voltar\n");
			System.out.print("-------------------------------------------------\n\n");

			char escolha = 0;
			int repeat = 0;

			do {
				System.out.print(" Escolha uma opção(1-6): ");
				escolha = ler.next().charAt(0);
				System.out.print("\n");

				switch (escolha) {
				case '1':
					Agencia.Cadastrar();
					repeat = 0;
					break;
				case '2':
					Agencia.Excluir();
					;
					break;
				case '3':
					Agencia.Imprimir();
					repeat = 0;
					break;
				case '4':
					Agencia.VincularCarro();
					repeat = 0;
					break;
				case '5':
					Agencia.DesvincularCarro();
					repeat = 0;
					break;
				case '6':
					repeat = 0;
					exit = true;
					break;
				default:
					System.out.print(" Favor inserir uma opção entre 1 e 4!\n\n");
					repeat = 1;
				}
			} while (repeat == 1);
		} while (exit == false);
	}

	public static void MenuUsuarios() {
		boolean exit = false;

		do {
			System.out.print("=================================================\n\n");
			System.out.print("                        Usuarios\n");
			System.out.print("-------------------------------------------------\n\n");
			System.out.print("  1- Listar\n");
			System.out.print("  2- Excluir\n");
			System.out.print("  3- Editar\n");
			System.out.print("  4- Voltar\n");
			System.out.print("-------------------------------------------------\n\n");

			char escolha = 0;
			int repeat = 0;

			do {
				System.out.print(" Escolha uma opção(1-4): ");
				escolha = ler.next().charAt(0);
				System.out.print("\n");

				switch (escolha) {
				case '1':
					Usuario.Imprimir();
					repeat = 0;
					break;
				case '2':
					Usuario.Excluir();
					;
					break;
				case '3':
					Usuario.AdmEditar();
					repeat = 0;
					break;
				case '4':
					exit = true;
					repeat = 0;
					break;
				default:
					System.out.print(" Favor inserir uma opção entre 1 e 4!\n\n");
					repeat = 1;
				}
			} while (repeat == 1);
		} while (exit == false);
	}

	public static void BancoDeDados() {

		// ================================== USUARIOS
		// ==================================
		// --------------------------------------------------------------------------------

		cadastrar[0] = new Usuario("Giovanni", "97413115085", "giovanni.acg@gmail.com", "Brasileiro", "Masculino",
				"12996389028", "gioacg", "giovanni1106", "Rua 3", "35", "Bairro principal", "Cidade de Deus",
				"Estado do bem", "Melhor Pais");
		cadastrar[1] = new Usuario("Maria Luiza", "64626578047", "malu@gmail.com", "Brasileira", "Feminino",
				"61996502450", "malu1212", "malu2809", "Rua 3", "35", "Bairro principal", "Cidade de Deus",
				"Estado do bem", "Melhor Pais");

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

		cadastrarCarro[0] = new Carro(cadastrarClasse[0], "marca", "modelo", "cor", 500, "placa", true, 2, false, 2, 2,
				true, 1, 50, 2);

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
	}

	public static void PrintCPFUsuarios() {

		for (int a = 0; a < MAX; a++)
			if (cadastrar[a] != null)
				System.out.println(" " + cadastrar[a] + "\n CPF: " + cadastrar[a].getCpf() + "\n");
	}

	static void clearBuffer(Scanner scanner) {
		if (scanner.hasNextLine()) {
			scanner.nextLine();
		}
	}
}
