package app;

import java.awt.Image;
import java.util.Scanner;

public class Carro {
	
	public static Scanner ler = new Scanner(System.in);
	public static int MAX = 1000;

	private Classe classe;
	private String marca;
	private String modelo;
	private String cor;
	private int km;
	private String placa;
	private boolean airBag;
	private int assentos;
	private boolean vidroEletrico;
	private int portaMalas;
	private int direcao;
	private boolean arCondicionado;
	private int embreagem;
	private int carga;
	private int combustivel;
	private Image foto;

	public Carro(Classe cl, String ma, String mo, String co, int km, String pl, boolean ai, int as, boolean vi, int po,
			int di, boolean ar, int em, int ca, int com) {

		this.classe = cl;
		this.marca = ma;
		this.modelo = mo;
		this.cor = co;
		this.km = km;
		this.placa = pl;
		this.airBag = ai;
		this.assentos = as;
		this.vidroEletrico = vi;
		this.portaMalas = po;
		this.direcao = di;
		this.arCondicionado = ar;
		this.embreagem = em;
		this.carga = ca;
		this.combustivel = com;

	}
	
	public static void CadastrarCarro() {

		int total = Classe.ImprimirClasses();
		char escolha;
		boolean repeat = false;

		int classe;
		String marca;
		String modelo;
		String cor;
		int km;
		String placa;
		boolean airBag = false;
		int assentos;
		boolean vidro = false;
		int portaMalas;
		int direcao = 1;
		boolean ar = false;
		int embreagem = 1;
		int carga = 1;
		int combustivel = 1;

		System.out.print(" Escolha uma classe(1-" + total + "): ");
		classe = ler.nextInt();

		System.out.print(" Marca: ");
		marca = ler.nextLine();

		System.out.print(" Modelo: ");
		modelo = ler.nextLine();

		System.out.print(" Cor: ");
		cor = ler.nextLine();

		System.out.print(" Km: ");
		km = ler.nextInt();

		System.out.print(" Placa: ");
		placa = ler.nextLine();

		do {
			System.out.println(" Possui Air Bag?\n");
			System.out.println(" 1- Sim");
			System.out.println(" 2- Nao");
			System.out.println(" R (1-2): ");
			escolha = ler.next().charAt(0);

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

		System.out.print(" Assentos: ");
		assentos = ler.nextInt();

		do {
			System.out.println(" Possui vidro eletrico?\n");
			System.out.println(" 1- Sim");
			System.out.println(" 2- Nao");
			System.out.println(" R (1-2): ");
			escolha = ler.next().charAt(0);

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

		System.out.print(" Malas grandes que cabem no porta malas: ");
		portaMalas = ler.nextInt();

		do {
			System.out.println(" Qual tipo de direcao?\n");
			System.out.println(" 1- Hidraulica");
			System.out.println(" 2- Eletrica");
			System.out.println(" R (1-2): ");
			escolha = ler.next().charAt(0);

			switch (escolha) {
			case '1':
				direcao = 1;
				repeat = false;
				break;
			case '2':
				direcao = 2;
				repeat = false;
				break;
			default:
				System.out.println(" Favor escolher uma opcao entre 1 e 2");
				repeat = true;
				break;
			}
		} while (repeat == true);

		do {
			System.out.println(" Possui ar condicionado?\n");
			System.out.println(" 1- Sim");
			System.out.println(" 2- Nao");
			System.out.println(" R (1-2): ");
			escolha = ler.next().charAt(0);

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
			System.out.println(" Qual tipo de cambio?\n");
			System.out.println(" 1- Automatico");
			System.out.println(" 2- Manual");
			System.out.println(" R (1-2): ");
			escolha = ler.next().charAt(0);

			switch (escolha) {
			case '1':
				embreagem = 1;
				repeat = false;
				break;
			case '2':
				embreagem = 2;
				repeat = false;
				break;
			default:
				System.out.println(" Favor escolher uma opcao entre 1 e 2");
				repeat = true;
				break;
			}
		} while (repeat == true);

		System.out.print(" Peso maximo de carga em Kg: ");
		portaMalas = ler.nextInt();

		do {
			System.out.println(" Qual tipo de combustivel?\n");
			System.out.println(" 1- Gasolina");
			System.out.println(" 2- Flex");
			System.out.println(" 3- Disel");
			System.out.println(" R (1-3): ");
			escolha = ler.next().charAt(0);

			switch (escolha) {
			case '1':
				combustivel = 1;
				repeat = false;
				break;
			case '2':
				combustivel = 2;
				repeat = false;
				break;
			case '3':
				combustivel = 2;
				repeat = false;
				break;
			default:
				System.out.println(" Favor escolher uma opcao entre 1 e 3");
				repeat = true;
				break;
			}
		} while (repeat == true);

		int num = 0;

		for (int a = 0; a < MAX; a++)
			if (Teste.cadastrarCarro[a] == null) {
				num = a;
				break;
			}

		Teste.cadastrarCarro[num] = new Carro(Teste.cadastrarClasse[classe], marca, modelo, cor, km, placa, airBag, assentos, vidro,
				portaMalas, direcao, ar, embreagem, carga, combustivel);

		System.out.println(" Carro cadastrado com sucesso!");

	}

	public boolean isAirBag() {
		return airBag;
	}

	public void setAirBag(boolean airBag) {
		this.airBag = airBag;
	}

	public int getAssentos() {
		return assentos;
	}

	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}

	public boolean isVidroEletrico() {
		return vidroEletrico;
	}

	public void setVidroEletrico(boolean vidroEletrico) {
		this.vidroEletrico = vidroEletrico;
	}

	public int getPortaMalas() {
		return portaMalas;
	}

	public void setPortaMalas(int portaMalas) {
		this.portaMalas = portaMalas;
	}

	public int getDirecao() {
		return direcao;
	}

	public void setDirecao(int direcao) {
		this.direcao = direcao;
	}

	public boolean isArCondicionado() {
		return arCondicionado;
	}

	public void setArCondicionado(boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}

	public int getEmbreagem() {
		return embreagem;
	}

	public void setEmbreagem(int embreagem) {
		this.embreagem = embreagem;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public int getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(int combustivel) {
		this.combustivel = combustivel;
	}

	public Classe getClasse() {
		return classe;
	}

	public void setClasse(Classe classe) {
		this.classe = classe;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Image getFoto() {
		return foto;
	}

	public void setFoto(Image foto) {
		this.foto = foto;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	private Agencia agencia;

}
