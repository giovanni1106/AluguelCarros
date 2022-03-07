package app;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Teste {

	public static Scanner ler = new Scanner(System.in);
	
	public static boolean login = false;
	public static boolean Admin = false;
	
	public static int MAX = 1000;
	
	public static Usuario cadastrar[] = new Usuario[MAX];
	public static Admin cadastrarAdm[] = new Admin[MAX];
	

	public static int pos;

	public static void main(String[] args) {
		char escolha = 0;
		int repeat = 0;

		BancoDeDados(); // Preenche o programa com dados pre cadastrados

		do {
			while (login == false) {

				TelaLogin();

				do {
					System.out.print(" Escolha uma opção(1-3): ");
					escolha = ler.next().charAt(0);
					System.out.print("\n");

					switch (escolha) {
					case '1':
						Login();
						repeat = 0;
						break;
					case '2':
						Cadastro();
						repeat = 0;
						break;
					case '3':
						repeat = 0;
						break;
					case 'P':
						PrintCPFUsuarios();
						repeat = 0;
						break;
					default:
						System.out.print(" Favor inserir uma opção entre 1 e 3!\n\n");
						repeat = 1;
					}
				} while (repeat == 1);
			}
			
			while (login == true) {
				if (Admin == false) {
					
					Menu();
					
					do {
						System.out.print(" Escolha uma opção(1-6): ");
						escolha = ler.next().charAt(0);
						System.out.print("\n");

						switch (escolha) {
						case '1':
							Perfil();
							repeat = 0;
							break;
						case '2':
							login = false;
							repeat = 0;
							break;
						case '3':
							System.exit(repeat);
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
					
					
				}
			}

		} while (escolha != '3');

	}

	public static void TelaLogin() {
		System.out.print("=================================================\n\n");
		System.out.print("                    TELA DE LOGIN\n");
		System.out.print("-------------------------------------------------\n\n");
		System.out.print("  1- Login\n");
		System.out.print("  2- Cadastrar\n");
		System.out.print("  3- Sair\n\n");
		System.out.print("-------------------------------------------------\n\n");
	}
	
	public static void Menu() {
		System.out.print("=================================================\n\n");
		System.out.print("                 ALUGUEL DE CARROS\n");
		System.out.print("-------------------------------------------------\n");
		System.out.print("                   Opcoes da conta\n");
		System.out.print("-------------------------------------------------\n");
		System.out.print("  1- Perfil\n");
		System.out.print("  2- Deslogar\n");
		System.out.print("  3- Sair\n");
		System.out.print("-------------------------------------------------\n");
		System.out.print("                   Opcoes de busca\n");
		System.out.print("-------------------------------------------------\n");
		System.out.print("  4- Buscar veículos por classe\n");
		System.out.print("  5- Buscar veículos por marca\n");
		System.out.print("  6- Buscar veículos por preço\n");
		System.out.print("-------------------------------------------------\n\n");
	}

	public static void Login() {

		String cpf;
		String senha;
		boolean cadastrado = false;

		clearBuffer(ler);
		do {
			System.out.print(" CPF (XXXXXXXXXXX): ");
			cpf = ler.nextLine();
			System.out.println("");
		} while (isCPF(cpf) == false);

		for (int a = 0; a < MAX; a++)
			if (cadastrar[a] != null)
				if (cadastrar[a].getCpf().equals(cpf) == true) {
					cadastrado = true;
					pos = a;
					break;
				}

		if (cadastrado == true) {

			int cont = 0;

			do {
				System.out.print(" Senha: ");
				senha = ler.nextLine();
				System.out.println("");
				cont = cont + 1;

				if (cadastrar[pos].getSenha().equals(senha) == true)
					login = true;

			} while (login == false && cont <= 5);

			if (login == false)
				System.out.println(" Excesso de tentativas atingido, tente novamente mais tarde");
			else
				System.out.println(" Longin realizado com sucesso");

		} else
			System.out.println(" Usuario nao cadastrado");
	}

	public static void Cadastro() {

		String nome;
		String cpf;
		String email;
		String nacionalidade;
		String genero;
		String logradouro;
		String numero;
		String bairro;
		String cidade;
		String estado;
		String pais;
		String celular;
		String senha;

		clearBuffer(ler);
		System.out.print(" Nome: ");
		nome = ler.nextLine();

		System.out.print(" CPF: ");
		cpf = ler.nextLine();

		System.out.print(" E-mail: ");
		email = ler.nextLine();

		System.out.print(" Nacionalidade: ");
		nacionalidade = ler.nextLine();

		System.out.print(" Genero: ");
		genero = ler.nextLine();

		System.out.print(" Logradouro: ");
		logradouro = ler.nextLine();

		System.out.print(" Numero: ");
		numero = ler.nextLine();

		System.out.print(" Bairro: ");
		bairro = ler.nextLine();

		System.out.print(" Cidade: ");
		cidade = ler.nextLine();

		System.out.print(" Estado: ");
		estado = ler.nextLine();

		System.out.print(" País: ");
		pais = ler.nextLine();

		System.out.print(" Celular: ");
		celular = ler.nextLine();

		System.out.print(" Senha: ");
		senha = ler.nextLine();

		int num = 0;

		for (int a = 0; a < MAX; a++)
			if (cadastrar[a] == null) {
				num = a;
				break;
			}

		cadastrar[num] = new Usuario(nome, cpf, email, nacionalidade, genero, celular, senha);

	}

	public static void Perfil() {
		System.out.print("=================================================\n\n");
		System.out.print("                  DADOS DE PERFIL\n");
		System.out.print("-------------------------------------------------\n");
		cadastrar[pos].setPerfil();
		
	}
	
 	public static void BancoDeDados() {

		cadastrar[0] = new Usuario("Giovanni", "97413115085", "giovanni.acg@gmail.com", "Brasileiro", "Masculino",
				"12996389028", "giovanni1106");
		cadastrar[1] = new Usuario("Maria Luiza", "64626578047", "malu@gmail.com", "Brasileira", "Feminino",
				"61996502450", "malu2809");
	}

	public static void PrintCPFUsuarios() {
		
		for(int a = 0; a < MAX; a++)
			if(cadastrar[a] != null)
				System.out.println(cadastrar[a] + "\n CPF: " + cadastrar[a].getCpf() + "\n");
	}
	
	public static boolean isCPF(String CPF) {
		// considera-se erro CPF's formados por uma sequencia de numeros iguais
		if (CPF.equals("00000000000") || CPF.equals("11111111111") || CPF.equals("22222222222")
				|| CPF.equals("33333333333") || CPF.equals("44444444444") || CPF.equals("55555555555")
				|| CPF.equals("66666666666") || CPF.equals("77777777777") || CPF.equals("88888888888")
				|| CPF.equals("99999999999") || (CPF.length() != 11))
			return (false);

		char dig10, dig11;
		int sm, i, r, num, peso;

		// "try" - protege o codigo para eventuais erros de conversao de tipo (int)
		try {
			// Calculo do 1o. Digito Verificador
			sm = 0;
			peso = 10;
			for (i = 0; i < 9; i++) {
				// converte o i-esimo caractere do CPF em um numero:
				// por exemplo, transforma o caractere '0' no inteiro 0
				// (48 eh a posicao de '0' na tabela ASCII)
				num = (int) (CPF.charAt(i) - 48);
				sm = sm + (num * peso);
				peso = peso - 1;
			}

			r = 11 - (sm % 11);
			if ((r == 10) || (r == 11))
				dig10 = '0';
			else
				dig10 = (char) (r + 48); // converte no respectivo caractere numerico

			// Calculo do 2o. Digito Verificador
			sm = 0;
			peso = 11;
			for (i = 0; i < 10; i++) {
				num = (int) (CPF.charAt(i) - 48);
				sm = sm + (num * peso);
				peso = peso - 1;
			}

			r = 11 - (sm % 11);
			if ((r == 10) || (r == 11))
				dig11 = '0';
			else
				dig11 = (char) (r + 48);

			// Verifica se os digitos calculados conferem com os digitos informados.
			if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10)))
				return (true);
			else
				return (false);
		} catch (InputMismatchException erro) {
			return (false);
		}
	}

	private static void clearBuffer(Scanner scanner) {
		if (scanner.hasNextLine()) {
			scanner.nextLine();
		}
	}
}
