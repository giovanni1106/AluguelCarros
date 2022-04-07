package Sistema;

public interface Login {

	public static int MAX = BancoDados.MAX;

	/**
	 * Verifica se o login e senha inseridos correspondem a alguma conta
	 * @param login 
	 * @param senha
	 * @return true = corresponde; false = não corresponde
	 */
	public static boolean Logando(String login, String senha) {

		boolean cadastrado = false;

		for (int a = 0; a < MAX; a++)
			if (BancoDados.cadastrarUsuario[a] != null)
				if (BancoDados.cadastrarUsuario[a].getLogin().equals(login) == true) {
					BancoDados.pos = a;
					cadastrado = true;
					break;
				}

		for (int a = 0; a < MAX; a++)
			if (BancoDados.cadastrarAdm[a] != null)
				if (BancoDados.cadastrarAdm[a].getLogin().equals(login) == true) {
					BancoDados.Administrador = true;
					BancoDados.pos = a;
					cadastrado = true;
					break;
				}

		if (cadastrado == true) {
			if (BancoDados.Administrador == true) {
				if (BancoDados.cadastrarAdm[BancoDados.pos].getSenha().equals(senha) == true) {
					BancoDados.Logado = true;
					return true;
				}
			} else if (BancoDados.cadastrarUsuario[BancoDados.pos].getSenha().equals(senha) == true) {
				BancoDados.Logado = true;
				return true;
			}
		}

		return false;
	}
}
