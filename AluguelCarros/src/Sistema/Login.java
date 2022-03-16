package Sistema;

import java.util.Scanner;

public interface Login {

	public static Scanner ler = new Scanner(System.in);
	public static int MAX = 1000;

	public static boolean Logando(String login, String senha) {

		boolean cadastrado = false;

		System.out.print(" login: ");
		login = ler.nextLine();

		for (int a = 0; a < MAX; a++)
			if (BancoDados.cadastrarUsuario[a] != null)
				if (BancoDados.cadastrarUsuario[a].getLogin().equals(login) == true) {
					cadastrado = true;
					BancoDados.pos = a;
					break;
				}

		for (int a = 0; a < MAX; a++)
			if (BancoDados.cadastrarAdm[a] != null)
				if (BancoDados.cadastrarAdm[a].getLogin().equals(login) == true) {
					cadastrado = true;
					BancoDados.Administrador = true;
					BancoDados.pos = a;
					break;
				}

		if (BancoDados.Administrador == true) {
			if (BancoDados.cadastrarAdm[BancoDados.pos].getSenha().equals(senha) == true) {
				BancoDados.Logado = true;
				return true;
			}
		} else if (BancoDados.cadastrarUsuario[BancoDados.pos].getSenha().equals(senha) == true) {
			BancoDados.Logado = true;
			return true;
		}
		
		
		return false;
	}
}
