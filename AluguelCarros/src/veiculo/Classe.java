package veiculo;

import java.util.Scanner;

import Sistema.BancoDados;

public class Classe {

	public static Scanner ler = new Scanner(System.in);
	public static int MAX = 1000;

	private String nome;
	private int valorDia;
	
	public Classe(String no, int va) {

		this.nome = no.toUpperCase();
		this.valorDia = va;
	}

	public static void Editar(int escolha, Classe cl, String Dado) {
		
		switch(escolha) {
		case 0:
			cl.setNome(Dado);
			break;
		case 1:
			cl.setValorDia(Integer.parseInt(Dado));
			break;
		}
		
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
		this.nome = nome.toUpperCase();
	}

	public int getValorDia() {
		return valorDia;
	}

	public void setValorDia(int valorDia) {
		this.valorDia = valorDia;
	}
}
