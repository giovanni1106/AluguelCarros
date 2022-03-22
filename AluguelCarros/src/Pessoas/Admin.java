package Pessoas;

import java.util.Scanner;

import Sistema.BancoDados;


public class Admin {

	public static Scanner ler = new Scanner(System.in);
	
	private String login;
	private String senha;
	private boolean logado;
	
	public Admin(String lo, String se) {
		
		this.login = lo;
		this.senha = se;
		
	}
	
	public static boolean TesteLogin(String login) {
		for (int a = 0; a < BancoDados.MAX; a++)
			if (BancoDados.cadastrarAdm[a] != null)
				if (BancoDados.cadastrarAdm[a].getLogin().equals(login))
					return false;
		return true;
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
