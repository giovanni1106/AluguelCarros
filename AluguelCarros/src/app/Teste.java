package app;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Teste {

	public static Scanner ler = new Scanner(System.in);
	public static int MAX = 1000;
	public static String cadastros[] = new String[MAX];
	public static String cadastrar[] = new String[MAX];
	
	public static int pos;
	
	public static void main(String[] args) {
		char escolha = 0;
		int repeat = 0;
		
		BancoDeDados(); // Preenche o programa com dados pre cadastrados

		do {
			Menu();

			do {
				System.out.print(" Escolha uma opção(1-7): ");
				escolha = ler.next().charAt(0);
				System.out.print("\n");

				switch (escolha) {
				case '1':
					Opcao1();
					repeat = 0;
					break;
				case '2':
					Opcao2();
					repeat = 0;
					break;
				case '3':
					Opcao3();
					repeat = 0;
					break;
				case '8':
					repeat = 0;
					break;
				default:
					System.out.print(" Favor inserir uma opção entre 1 e 4!\n\n");
					repeat = 1;
				}
			} while (repeat == 1);
		} while (escolha != '8');

	}

	public static void Menu() {
		System.out.print("=================================================\n\n");
		System.out.print("                 ALUGUEL CARROS\n");
		System.out.print("-------------------------------------------------\n\n");
		System.out.print("  1- Login\n");
		System.out.print("  2- Cadastrar\n");
		System.out.print("  3- Buscar carros\n");
		System.out.print("  4- Buscar marcas\n");
		System.out.print("  5- Buscar classes\n");
		System.out.print("  6- Buscar por preço/dia\n");
		System.out.print("  7- Opcoes do perfil\n");
		System.out.print("  8- Sair\n\n");
		System.out.print("-------------------------------------------------\n\n");
	}

	public static void Opcao1() {

		String cpf;
		String senha;
		boolean cadastrado = false;

		do {
			System.out.print(" CPF (XXXXXXXXXXX): ");
			cpf = ler.nextLine();
			System.out.println("");
		} while (isCPF(cpf) == false);

		for (int a = 0; a < MAX; a++)
			if (cadastros[a] == cpf) {
				cadastrado = true;
				pos = a;
			}
		
		if (cadastrado = true) {

			int cont = 0;
			boolean login = false;
			
			do {
			System.out.print(" Senha: ");
			senha = ler.nextLine();
			System.out.println("");
			cont = cont + 1;
			
			if (cadastrar[pos].getSenha == senha)
				login = true;
			
			} while(login == false && cont <= 5);

			if (login == false) {
				System.out.println(" Excesso de tentativas atingido, tente novamente mais tarde");
				pos = (Integer) null;
			}else
				System.out.println(" Longin realizado com sucesso");
			
		} else
			System.out.print(" Usuario nao cadastrado");
	}

	public static void Opcao2() {
		
	}

	public static void Opcao3() {
		
	}
	
	public static void BancoDeDados() {
		
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

	public static String imprimeCPF(String CPF) {
		return (CPF.substring(0, 3) + "." + CPF.substring(3, 6) + "." + CPF.substring(6, 9) + "-"
				+ CPF.substring(9, 11));
	}

}
