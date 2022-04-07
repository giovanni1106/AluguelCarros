package veiculo;

import java.awt.Image;
import java.util.Scanner;

import Sistema.BancoDados;
import view.UsuarioAlugar;

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
	private int ano;

	/**
	 * Construtor da classe Carro
	 * @param cl
	 * @param ma
	 * @param mo
	 * @param co
	 * @param km
	 * @param pl
	 * @param ai
	 * @param as
	 * @param vi
	 * @param po
	 * @param di
	 * @param ar
	 * @param em
	 * @param ca
	 * @param com
	 * @param ano
	 */
	public Carro(Classe cl, String ma, String mo, String co, int km, String pl, boolean ai, int as, boolean vi, int po,
			int di, boolean ar, int em, int ca, int com, int ano) {

		this.classe = cl;
		this.marca = ma.toUpperCase();
		this.modelo = mo.toUpperCase();
		this.cor = co.toUpperCase();
		this.km = km;
		this.placa = pl.toUpperCase();
		this.airBag = ai;
		this.assentos = as;
		this.vidroEletrico = vi;
		this.portaMalas = po;
		this.direcao = di;
		this.arCondicionado = ar;
		this.embreagem = em;
		this.carga = ca;
		this.combustivel = com;
		this.ano = ano;
		this.alugado = false;
	}
	
	/**
	 * Edita os dados do carro
	 * @param escolha
	 * @param dado
	 * @param car
	 * @param cl
	 */
	public static void Editar(int escolha, String dado, Carro car, Classe cl) {
		switch(escolha) {
		case 0:
			// classe
			if(cl != null)
				car.setClasse(cl);
			break;
		case 1:
			// cor
			car.setCor(dado.toUpperCase());
			break;
		case 2:
			// km
			car.setKm(Integer.parseInt(dado));
			break;
		case 3:
			// placa
			car.setPlaca(dado.toUpperCase());
			break;
		}
	}

	/**
	 * Exclui os dados do carro e preenche os espaços vazios com os carros da posição seguinte do array
	 * 
	 * Exemplo:
	 * 
	 * array[carro1, carro2, carro3, carro4];
	 * 
	 * Exclui o carro 2
	 * 
	 * array[carro1, null, carro3, carro4];
	 * 
	 * Após preencher
	 * 
	 * array[carro1, carro3, carro4];
	 * @param car
	 * @return
	 */
	public static boolean Excluir(Carro car) {
		boolean excluir = false;
		
		for(int i = 0; i < BancoDados.MAX; i++)
			if (BancoDados.cadastrarCarro[i] == car) {
				BancoDados.cadastrarCarro[i] = null;
				excluir = true;
			}

		for (int i = 0; i < MAX - 1; i++)
			if (BancoDados.cadastrarCarro[i] == null && BancoDados.cadastrarCarro[i + 1] != null) {
				BancoDados.cadastrarCarro[i] = BancoDados.cadastrarCarro[i + 1];
				BancoDados.cadastrarCarro[i + 1] = null;
			}
		
		return excluir;
	}

	/**
	 * Cria uma string com todas as classes vinculadas aos veículos
	 * @return Retorna essa String preenchida
	 */
	public static String[] ImprimirClasse() {

		String[] Classes = new String[BancoDados.MAX];

		for (int i = 0; i < BancoDados.MAX; i++)
			if (BancoDados.cadastrarCarro[i] != null) {
				for (int a = 0; a < BancoDados.MAX; a++) {
					if (BancoDados.cadastrarCarro[i].getClasse().getNome().equals(Classes[a]) == false) {
						if (Classes[a] == null) {
							Classes[a] = BancoDados.cadastrarCarro[i].getClasse().getNome();
							break;
						}
					} else
						break;
				}
			}

		return Classes;
	}

	/**
	 * Cria um array com todos os modelos disponiveis
	 * @return Retorna esse array preenchido
	 */
	public static String[] ImprimirModelo() {

		String[] carros = new String[MAX];

		for (int a = 0; a < MAX; a++)
			if (BancoDados.cadastrarCarro[a] != null)
				carros[a] = BancoDados.cadastrarCarro[a].getModelo();
			else {
				break;
			}
		return carros;
	}
	
	/**
	 * Cria um array com todos os veículos organizadamente
	 * @return Retorna esse array preenchido
	 */
	public static String[] ImprimirCarro() {

		String[] carros = new String[MAX];

		for (int a = 0; a < MAX; a++)
			if (BancoDados.cadastrarCarro[a] != null)
				carros[a] = " " + a + "- " + BancoDados.cadastrarCarro[a].getClasse().getNome() + " | "
						+ BancoDados.cadastrarCarro[a].getMarca() + " | " + BancoDados.cadastrarCarro[a].getModelo();
			else {
				break;
			}
		return carros;
	}

	/**
	 * Cria um array com todas as marcas disponiveis
	 * @return Retorna esse array preenchido
	 */
	public static String[] ImprimirMarca() {

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
		return marca;
	}

	/**
	 * Cria um array com todos os carros vinculados a uma marca
	 * @param marca Marca a ser verificada
	 * @return Retorna o array com todos os carros da marca
	 */
	public static String[] ImprimirCarroMarca(String marca) {
		int cont = 0;
		
		String[] CarroMarca = new String[BancoDados.MAX];
		
		for(int i = 0; i < BancoDados.MAX; i++) {
			UsuarioAlugar.Carros[i] = null;
		}
		
		for (int a = 0; a < BancoDados.MAX; a++)
			if (BancoDados.cadastrarCarro[a] != null)
				if (BancoDados.cadastrarCarro[a].getMarca().equals(marca) == true) {
					CarroMarca[cont] = BancoDados.cadastrarCarro[a].getModelo();
					UsuarioAlugar.Carros[cont] = BancoDados.cadastrarCarro[a];
					cont++;
				}
		return CarroMarca;
	}

	/**
	 * Cria um array com todos os veículos vinculados a uma mesma classe
	 * @param classe Classe a ser verificada
	 * @return Reotrna o array preenchido com os veículos
	 */
	public static String[] ImprimirCarroClasse(String classe) {
		int cont = 0;
		
		String[] CarroClasse = new String[BancoDados.MAX];
		
		for(int i = 0; i < BancoDados.MAX; i++) {
			UsuarioAlugar.Carros[i] = null;
		}
		
		for (int a = 0; a < BancoDados.MAX; a++)
			if (BancoDados.cadastrarCarro[a] != null)
				if (BancoDados.cadastrarCarro[a].getClasse().getNome().equals(classe) == true) {
					CarroClasse[cont] = BancoDados.cadastrarCarro[a].getModelo();
					UsuarioAlugar.Carros[cont] = BancoDados.cadastrarCarro[a];
					cont++;
				}
		return CarroClasse;
	}

	/**
	 * Cria um array com todos carros do mesmo modelo
	 * @param modelo
	 * @return Retorna o array preenchido
	 */
	public static String[] ImprimirCarroModelo(String modelo) {
		int cont = 0;
		
		for(int i = 0; i < BancoDados.MAX; i++) {
			UsuarioAlugar.Carros[i] = null;
		}
		
		String[] CarroModelo = new String[BancoDados.MAX];
		
		for (int a = 0; a < BancoDados.MAX; a++)
			if (BancoDados.cadastrarCarro[a] != null)
				if (BancoDados.cadastrarCarro[a].getModelo().equals(modelo) == true) {
					CarroModelo[cont] = BancoDados.cadastrarCarro[a].getModelo();
					UsuarioAlugar.Carros[cont] = BancoDados.cadastrarCarro[a];
					cont++;
				}
		return CarroModelo;
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
