package Pessoas;

import java.util.InputMismatchException;
import java.util.Scanner;

import app.Teste;

public class Usuario {

	public static Scanner ler = new Scanner(System.in);

	private String nome;
	private String cpf;
	private String email;
	private String nacionalidade;
	private String genero;
	private EnderecoRes endereco;
	private String celular;
	private CNH cnh;
	private String login;
	private String senha;
	private Historico historico;
	private Fidelidade fidelidade[] = new Fidelidade[50];

	public Usuario(String no, String cp, String em, String na, String ge, String ce, String lo, String se, String log,
			String nu, String ba, String ci, String es, String pa) {

		this.nome = no;
		this.cpf = cp;
		this.email = em;
		this.nacionalidade = na;
		this.genero = ge;
		this.celular = ce;
		this.login = lo;
		this.senha = se;
		endereco = new EnderecoRes(log, nu, ba, ci, es, pa);
	}

	public static void Excluir() {

		int total = Imprimir();
		int escolha;

		System.out.print(" Usuario que deseja excluir (0-" + total + "): ");
		escolha = ler.nextInt();

		Teste.cadastrar[escolha] = null;

		for (int a = 0; a < Teste.MAX-1; a++)
			if (Teste.cadastrar[a] == null && Teste.cadastrar[a + 1] != null) {
				Teste.cadastrar[a] = Teste.cadastrar[a + 1];
				Teste.cadastrar[a + 1] = null;
			}

		System.out.println(" Usuario excluido com sucesso!");
	}

	public static int Imprimir() {
		int a;

		for (a = 0; a < Teste.MAX; a++)
			if (Teste.cadastrar[a] != null)
				System.out.println(" " + a + "- " + Teste.cadastrar[a].getCpf() + " | " + Teste.cadastrar[a].getNome());
			else
				break;
		return a - 1;
	}

	public static void Editar() {
		char edit;
		String novo;
		boolean repeat = false;
		System.out.println("\n");
		ImprimirPerfil();
		
		System.out.println("");
		System.out.println(" 1- Nome");
		System.out.println(" 2- CPF");
		System.out.println(" 3- Celular");
		System.out.println(" 4- E-mail\n");
		System.out.print(" Escolha um dos dados para trocar(1-4): ");

		do {
			edit = ler.next().charAt(0);
			Teste.clearBuffer(ler);
			switch (edit) {
			case '1':
				System.out.print(" Novo nome: ");
				novo = ler.nextLine();
				Teste.cadastrar[Teste.pos].setNome(novo);
				repeat = false;
				break;
			case '2':
				System.out.print(" Novo CPF: ");
				novo = ler.nextLine();
				Teste.cadastrar[Teste.pos].setCpf(novo);
				repeat = false;
				break;
			case '3':
				System.out.print(" Novo Celular: ");
				novo = ler.nextLine();
				Teste.cadastrar[Teste.pos].setCelular(novo);
				repeat = false;
				break;
			case '4':
				System.out.print(" Novo E-mail: ");
				novo = ler.nextLine();
				Teste.cadastrar[Teste.pos].setEmail(novo);
				repeat = false;
				break;
			default:
				System.out.println(" Favor escolher uma opcao entre 1 e 4");
				repeat = true;
			}
		} while (repeat == true);

		System.out.println("");
		System.out.println(" Dado trocado com sucesso!");

	}

	public static void AdmEditar() {
		
		System.out.println("\n");
		int total = Imprimir();
		int escolha;
		char edit;
		String novo;
		boolean repeat = false;

		System.out.print(" Usuario que deseja editar (0-" + total + "): ");
		escolha = ler.nextInt();

		Teste.cadastrar[escolha].setPerfil();

		System.out.println("");
		System.out.println(" 1- Nome");
		System.out.println(" 2- CPF");
		System.out.println(" 3- Celular");
		System.out.println(" 4- E-mail\n");
		System.out.print(" Escolha um dos dados para trocar(1-4): ");

		do {
			edit = ler.next().charAt(0);
			Teste.clearBuffer(ler);
			switch (edit) {
			case '1':
				System.out.print(" Novo nome: ");
				novo = ler.nextLine();
				Teste.cadastrar[escolha].setNome(novo);
				repeat = false;
				break;
			case '2':
				System.out.print(" Novo CPF: ");
				novo = ler.nextLine();
				Teste.cadastrar[escolha].setCpf(novo);
				repeat = false;
				break;
			case '3':
				System.out.print(" Novo Celular: ");
				novo = ler.nextLine();
				Teste.cadastrar[escolha].setCelular(novo);
				repeat = false;
				break;
			case '4':
				System.out.print(" Novo E-mail: ");
				novo = ler.nextLine();
				Teste.cadastrar[escolha].setEmail(novo);
				repeat = false;
				break;
			default:
				System.out.println(" Favor escolher uma opcao entre 1 e 4");
				repeat = true;
			}
		} while (repeat == true);

		System.out.println("");
		System.out.println(" Dado trocado com sucesso!");

	}

	public static void ImprimirPerfil() {
		System.out.print("=================================================\n\n");
		System.out.print("                  DADOS DE PERFIL\n");
		System.out.print("-------------------------------------------------\n");
		Teste.cadastrar[Teste.pos].setPerfil();

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

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public EnderecoRes getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoRes endereco) {
		this.endereco = endereco;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public CNH getCnh() {
		return cnh;
	}

	public void setCnh(CNH cnh) {
		this.cnh = cnh;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Historico getHistorico() {
		return historico;
	}

	public void setHistorico(Historico historico) {
		this.historico = historico;
	}

	public void setPerfil() {
		System.out.println(" Nome: " + getNome());
		System.out.println(" CPF: " + imprimeCPF(getCpf()));
		System.out.println(" Celular: " + getCelular());
		System.out.println(" E-mail: " + getEmail());
	}

	public static String imprimeCPF(String CPF) {
		return (CPF.substring(0, 3) + "." + CPF.substring(3, 6) + "." + CPF.substring(6, 9) + "-"
				+ CPF.substring(9, 11));
	}

	public Fidelidade[] getFidelidade() {
		return fidelidade;
	}

	public void setFidelidade(Fidelidade fidelidade[]) {
		this.fidelidade = fidelidade;
	}
}
