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

	public Classe(String no, int va, String carac) {

		this.nome = no.toUpperCase();
		this.valorDia = va;
		this.caracteristicas = carac;

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
