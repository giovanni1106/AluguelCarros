package app;

import java.util.Scanner;

public interface Login {

	public static Scanner ler = new Scanner(System.in);
	public static int MAX = 1000;
	
	public static void Logando() {

		String login;
		String senha;
		boolean cadastrado = false;

		System.out.print(" login: ");
		login = ler.nextLine();

		for (int a = 0; a < MAX; a++)
			if (Teste.cadastrar[a] != null)
				if (Teste.cadastrar[a].getLogin().equals(login) == true) {
					cadastrado = true;
					Teste.pos = a;
					break;
				}

		for (int a = 0; a < MAX; a++)
			if (Teste.cadastrarAdm[a] != null)
				if (Teste.cadastrarAdm[a].getLogin().equals(login) == true) {
					cadastrado = true;
					Teste.Administrador = true;
					Teste.pos = a;
					break;
				}

		if (cadastrado == true) {

			int cont = 0;

			do {
				System.out.print(" Senha: ");
				senha = ler.nextLine();
				System.out.println("");
				cont = cont + 1;

				if (Teste.Administrador == true) {
					if (Teste.cadastrarAdm[Teste.pos].getSenha().equals(senha) == true)
						Teste.Logado = true;
				} else if (Teste.cadastrar[Teste.pos].getSenha().equals(senha) == true)
					Teste.Logado = true;

			} while (Teste.Logado == false && cont <= 5);

			if (Teste.Logado == false)
				System.out.println(" Excesso de tentativas atingido, tente novamente mais tarde");
			else
				System.out.println(" Longin realizado com sucesso");

		} else
			System.out.println(" Usuario nao cadastrado");
	}
}
