package veiculo;

import java.util.Scanner;

import Sistema.BancoDados;

public class Classe {

	public static Scanner ler = new Scanner(System.in);
	public static int MAX = 1000;

	private String nome;
	private int valorDia;

	/**
	 * Construtor da classe Classe
	 * @param no
	 * @param va
	 */
	public Classe(String no, int va) {

		this.nome = no.toUpperCase();
		this.valorDia = va;
	}

	/**
	 * Permite editar alguma variavel da classe
	 * @param escolha A variavel que deseja alterar
	 * @param cl A classe a ser alterada
	 * @param Dado A nova String a ser salva
	 */
	public static void Editar(int escolha, Classe cl, String Dado) {

		switch (escolha) {
		case 0:
			cl.setNome(Dado);
			break;
		case 1:
			cl.setValorDia(Integer.parseInt(Dado));
			break;
		}

	}

	/**
	 * Exclui a classe escolhida e preenche o espaço null deixado no array com as classes de posições superiores
	 * @param cl Classe a ser excluida
	 * @return true = excluida; false = não excluida
	 */
	public static boolean Excluir(Classe cl) {

		boolean excluir = false;
		
		for(int i = 0; i < BancoDados.MAX; i++)
			if(BancoDados.cadastrarClasse[i] == cl) {
				BancoDados.cadastrarClasse[i] = null;
				excluir = true;
			}
		
		for (int i = 0; i < MAX - 1; i++)
			if (BancoDados.cadastrarClasse[i] == null && BancoDados.cadastrarClasse[i + 1] != null) {
				BancoDados.cadastrarClasse[i] = BancoDados.cadastrarClasse[i + 1];
				BancoDados.cadastrarClasse[i + 1] = null;
			}
		
		return excluir;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome.toUpperCase();
	}

	public int getValorDia() {
		return valorDia;
	}

	public void setValorDia(int valorDia) {
		this.valorDia = valorDia;
	}
}
