package Pessoas;

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
