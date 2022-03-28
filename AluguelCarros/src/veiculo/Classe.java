package veiculo;

import java.util.Scanner;

import Sistema.BancoDados;

public class Classe {

	public static Scanner ler = new Scanner(System.in);
	public static int MAX = 1000;

	private String nome;
	private int valorDia;
	private String caracteristicas;
	private boolean arCondicionado;
	private boolean portas;
	private boolean portaMalas;
	private boolean cambio;
	private boolean vidro;
	private boolean assentos;
	private boolean airBag;

	public Classe(String no, int va, String carac, boolean ar, boolean po, boolean portaMalas, boolean ca, boolean vi,
			boolean as, boolean ai) {

		this.nome = no.toUpperCase();
		this.valorDia = va;
		this.caracteristicas = carac;

		// Prioridades para classificacao da classe
		this.arCondicionado = ar;
		this.portas = po;
		this.portaMalas = portaMalas;
		this.cambio = ca;
		this.vidro = vi;
		this.assentos = as;
		this.airBag = ai;

	}

	public static void Cadastrar() {

		String nome;
		String carac;
		int valorDia;
		boolean ar = false;
		boolean portas = false;
		boolean portaMalas = false;
		boolean cambio = false;
		boolean vidro = false;
		boolean assentos = false;
		boolean airBag = false;

		System.out.print(" Nome: ");
		nome = ler.nextLine();
		System.out.println("");

		System.out.print(" Caracteristicas: ");
		carac = ler.nextLine();
		System.out.println("");

		System.out.print(" Valor por dia: ");
		valorDia = ler.nextInt();
		System.out.println("\n");

		System.out.println(" LISTA DE AVALIACAO DE CLASSE\n");
		System.out.println(" O que a classe vai levar em conta na\n hora de classificar os carros cadastrados\n");

		char escolha;
		boolean repeat = false;

		do {
			System.out.println(" Ar condicionado\n");
			System.out.println(" 1- Sim");
			System.out.println(" 2- Nao");
			System.out.print(" R (1-2): ");
			escolha = ler.next().charAt(0);
			System.out.println("");

			switch (escolha) {
			case '1':
				ar = true;
				repeat = false;
				break;
			case '2':
				ar = false;
				repeat = false;
				break;
			default:
				System.out.println(" Favor escolher uma opcao entre 1 e 2");
				repeat = true;
				break;
			}
		} while (repeat == true);

		do {
			System.out.println(" Numero de portas\n");
			System.out.println(" 1- Sim");
			System.out.println(" 2- Nao");
			System.out.print(" R (1-2): ");
			escolha = ler.next().charAt(0);
			System.out.println("");

			switch (escolha) {
			case '1':
				portas = true;
				repeat = false;
				break;
			case '2':
				portas = false;
				repeat = false;
				break;
			default:
				System.out.println(" Favor escolher uma opcao entre 1 e 2");
				repeat = true;
				break;
			}
		} while (repeat == true);

		do {
			System.out.println(" Tamanho do porta malas\n");
			System.out.println(" 1- Sim");
			System.out.println(" 2- Nao");
			System.out.print(" R (1-2): ");
			escolha = ler.next().charAt(0);
			System.out.println("");

			switch (escolha) {
			case '1':
				portaMalas = true;
				repeat = false;
				break;
			case '2':
				portaMalas = false;
				repeat = false;
				break;
			default:
				System.out.println(" Favor escolher uma opcao entre 1 e 2");
				repeat = true;
				break;
			}
		} while (repeat == true);

		do {
			System.out.println(" Tipo de cambio (Manual ou Automatico)\n");
			System.out.println(" 1- Sim");
			System.out.println(" 2- Nao");
			System.out.print(" R (1-2): ");
			escolha = ler.next().charAt(0);
			System.out.println("");

			switch (escolha) {
			case '1':
				cambio = true;
				repeat = false;
				break;
			case '2':
				cambio = false;
				repeat = false;
				break;
			default:
				System.out.println(" Favor escolher uma opcao entre 1 e 2");
				repeat = true;
				break;
			}
		} while (repeat == true);

		do {
			System.out.println(" Vidro eletrico\n");
			System.out.println(" 1- Sim");
			System.out.println(" 2- Nao");
			System.out.print(" R (1-2): ");
			escolha = ler.next().charAt(0);
			System.out.println("");

			switch (escolha) {
			case '1':
				vidro = true;
				repeat = false;
				break;
			case '2':
				vidro = false;
				repeat = false;
				break;
			default:
				System.out.println(" Favor escolher uma opcao entre 1 e 2");
				repeat = true;
				break;
			}
		} while (repeat == true);

		do {
			System.out.println(" Numero assentos\n");
			System.out.println(" 1- Sim");
			System.out.println(" 2- Nao");
			System.out.print(" R (1-2): ");
			escolha = ler.next().charAt(0);
			System.out.println("");

			switch (escolha) {
			case '1':
				assentos = true;
				repeat = false;
				break;
			case '2':
				assentos = false;
				repeat = false;
				break;
			default:
				System.out.println(" Favor escolher uma opcao entre 1 e 2");
				repeat = true;
				break;
			}
		} while (repeat == true);

		do {
			System.out.println(" Air bag\n");
			System.out.println(" 1- Sim");
			System.out.println(" 2- Nao");
			System.out.print(" R (1-2): ");
			escolha = ler.next().charAt(0);
			System.out.println("");

			switch (escolha) {
			case '1':
				airBag = true;
				repeat = false;
				break;
			case '2':
				airBag = false;
				repeat = false;
				break;
			default:
				System.out.println(" Favor escolher uma opcao entre 1 e 2");
				repeat = true;
				break;
			}
		} while (repeat == true);

		int num = 0;

		for (int a = 0; a < MAX; a++)
			if (BancoDados.cadastrarClasse[a] == null) {
				num = a;
				break;
			}

		BancoDados.cadastrarClasse[num] = new Classe(nome, valorDia, carac, ar, portas, portaMalas, cambio, vidro, assentos,
				airBag);

		System.out.println(" Classe cadastrada com sucesso!");

	}

	public static void Excluir() {
		int total = Imprimir();

		int escolha = 0;
		boolean valido = true;

		System.out.print(" Classe que deseja excluir (0-" + total + "): ");
		escolha = ler.nextInt();

		for (int a = 0; a < MAX; a++)
			if (BancoDados.cadastrarCarro[a] != null)
				if (BancoDados.cadastrarCarro[a].getClasse() == BancoDados.cadastrarClasse[escolha]) {
					System.out.println(
							"\n Ainda existem carros cadastrados!\n Favor excluir todos os veiculos vinculados a essa classe");
					valido = false;
					break;
				}

		if (valido == true) {
			BancoDados.cadastrarClasse[escolha] = null;
			
			for (int i = 0; i < MAX - 1; i++)
				if(BancoDados.cadastrarClasse[i] == null && BancoDados.cadastrarClasse[i+1] != null) {
					BancoDados.cadastrarClasse[i] = BancoDados.cadastrarClasse[i+1];
					BancoDados.cadastrarClasse[i+1] = null;
				}
				
			System.out.println(" Classe excluida com sucesso");
		}
	}

	public static int Imprimir() {

		int a;
		for (a = 0; a < MAX; a++)
			if (BancoDados.cadastrarClasse[a] != null)
				System.out.println(" " + a + "- " + BancoDados.cadastrarClasse[a].getNome());
			else
				break;
		return a - 1;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isArCondicionado() {
		return arCondicionado;
	}

	public void setArCondicionado(boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}

	public boolean isPortas() {
		return portas;
	}

	public void setPortas(boolean portas) {
		this.portas = portas;
	}

	public boolean isPortaMalas() {
		return portaMalas;
	}

	public void setPortaMalas(boolean portaMalas) {
		this.portaMalas = portaMalas;
	}

	public boolean isCambio() {
		return cambio;
	}

	public void setCambio(boolean cambio) {
		this.cambio = cambio;
	}

	public boolean isVidro() {
		return vidro;
	}

	public void setVidro(boolean vidro) {
		this.vidro = vidro;
	}

	public boolean isAssentos() {
		return assentos;
	}

	public void setAssentos(boolean assentos) {
		this.assentos = assentos;
	}

	public boolean isAirBag() {
		return airBag;
	}

	public void setAirBag(boolean airBag) {
		this.airBag = airBag;
	}

	public int getValorDia() {
		return valorDia;
	}

	public void setValorDia(int valorDia) {
		this.valorDia = valorDia;
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

}
