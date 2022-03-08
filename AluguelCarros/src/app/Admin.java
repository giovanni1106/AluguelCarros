package app;

import java.util.Scanner;

public class Admin {

	public static Scanner ler = new Scanner(System.in);
	
	private String login;
	private String senha;
	private boolean logado;
	
	public Admin(String lo, String se) {
		
		this.login = lo;
		this.senha = se;
		
	}
	
	public static void Cadastro() {

		String chave;
		boolean verificado = false;
		String login;
		String senha;
		int cont = 0;

		Teste.clearBuffer(ler);

		do {
			System.out.print(" Chave do admin: ");
			chave = ler.nextLine();
			System.out.println();
			cont = cont + 1;

			if (Teste.chaveAdm.equals(chave) == true)
				verificado = true;

		} while (verificado == false && cont <= 5);

		if (verificado == true) {
			System.out.print(" login: ");
			login = ler.nextLine();

			System.out.print(" Senha: ");
			senha = ler.nextLine();

			int num = 0;

			for (int a = 0; a < Teste.MAX; a++)
				if (Teste.cadastrarAdm[a] == null) {
					num = a;
					break;
				}

			Teste.cadastrarAdm[num] = new Admin(login, senha);

		} else
			System.out.println(" Chave de verificacao incorreta");

	}
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public boolean isLogado() {
		return logado;
	}
	
	public void setLogado(boolean logado) {
		this.logado = logado;
	}
}
