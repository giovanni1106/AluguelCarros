package veiculo;

import java.awt.Image;
import java.util.Scanner;

import Sistema.BancoDados;

public class Carro {

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
	private boolean alugado;

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
		this.alugado = false;

	}

	public static void Excluir(int escolha) {

		if (BancoDados.cadastrarCarro[escolha] != null)
			BancoDados.cadastrarCarro[escolha] = null;

		for (int i = 0; i < MAX - 1; i++)
			if (BancoDados.cadastrarCarro[i] == null && BancoDados.cadastrarCarro[i + 1] != null) {
				BancoDados.cadastrarCarro[i] = BancoDados.cadastrarCarro[i + 1];
				BancoDados.cadastrarCarro[i + 1] = null;
			}

		System.out.println(" Carro excluido com sucesso");

	}

	public static String[] Imprimir() {

		String[] carros = new String[MAX];
		
		for (int a = 0; a < MAX; a++)
			if (BancoDados.cadastrarCarro[a] != null)
				carros[a] = " " + a + "- " + BancoDados.cadastrarCarro[a].getClasse().getNome() + " | "
						+ BancoDados.cadastrarCarro[a].getMarca() + " | " + BancoDados.cadastrarCarro[a].getModelo();
			else {
				break;
			}
		System.out.println(carros[0]);
		return carros;
	}

	public static int ImprimirMarca(Boolean imprimir, int escolha, boolean alugar, int escolhido) {
		String marca[] = new String[BancoDados.MAX];

		for (int i = 0; i < BancoDados.MAX; i++)
			if (BancoDados.cadastrarCarro[i] != null) {
				for (int a = 0; a < BancoDados.MAX; a++) {
					if (BancoDados.cadastrarCarro[i].getMarca().equals(marca[a]) == false) {
						if (marca[a] == null) {
							marca[a] = BancoDados.cadastrarCarro[i].getMarca();
							break;
						}
					} else
						break;
				}
			}

		if (imprimir == true) {
			for (int i = 0; i < BancoDados.MAX; i++)
				if (marca[i] != null)
					System.out.println(" " + i + "- " + marca[i]);
				else
					return i;
		} else if (alugar == false) {
			return ImprimirCarroMarca(marca[escolha], false, 0);
		} else
			return ImprimirCarroMarca(marca[escolha], true, escolhido);

		return 0;
	}

	public static int ImprimirCarroMarca(String marca, boolean alugar, int escolha) {
		int cont = 0;

		if (alugar == false) {
			for (int a = 0; a < BancoDados.MAX; a++)
				if (BancoDados.cadastrarCarro[a] != null)
					if (BancoDados.cadastrarCarro[a].getMarca().equals(marca) == true) {
						cont = cont + 1;
						System.out.println(" " + cont + "- " + BancoDados.cadastrarCarro[a].getModelo());
					}
		} else {
			for (int a = 0; a < BancoDados.MAX; a++)
				if (BancoDados.cadastrarCarro[a] != null)
					if (BancoDados.cadastrarCarro[a].getMarca().equals(marca) == true) {
						cont = cont + 1;
						if (escolha == cont)
							return a;
					}
		}

		return cont;
	}


	public boolean isAlugado() {
		return alugado;
	}

	public void setAlugado(boolean alugado) {
		this.alugado = alugado;
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
