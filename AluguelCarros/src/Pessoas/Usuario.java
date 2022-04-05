package Pessoas;

import java.util.InputMismatchException;
import Sistema.BancoDados;

public class Usuario {

	private String nome;
	private String cpf;
	private String email;
	private String nacionalidade;
	private String genero;
	private String cartaoCredito;
	private EnderecoRes endereco;
	private String celular;
	private CNH cnh;
	private String login;
	private String senha;
	private Historico historico;
	private Fidelidade fidelidade;

	public Usuario(String no, String cp, String em, String na, String ge, String ce, String lo, String se, String log,
			String nu, String ba, String ci, String es, String pa) {

		this.nome = no;
		this.cpf = cp;
		this.email = em;
		this.nacionalidade = na;
		this.genero = ge;
		this.celular = ce;
		this.login = lo;
		this.senha = se;
		endereco = new EnderecoRes(log, nu, ba, ci, es, pa);
	}

	public static void Excluir(int escolha) {

		BancoDados.cadastrarUsuario[escolha] = null;

		for (int a = 0; a < BancoDados.MAX - 1; a++)
			if (BancoDados.cadastrarUsuario[a] == null && BancoDados.cadastrarUsuario[a + 1] != null) {
				BancoDados.cadastrarUsuario[a] = BancoDados.cadastrarUsuario[a + 1];
				BancoDados.cadastrarUsuario[a + 1] = null;
			}

		System.out.println(" Usuario excluido com sucesso!");
	}

	public static int Imprimir() {
		int a;

		for (a = 0; a < BancoDados.MAX; a++)
			if (BancoDados.cadastrarUsuario[a] != null)
				System.out.println(" " + a + "- " + BancoDados.cadastrarUsuario[a].getCpf() + " | "
						+ BancoDados.cadastrarUsuario[a].getNome());
			else
				break;
		return a - 1;
	}

	public static void Editar(int escolha, String novo) {

		switch (escolha) {
		case 0:
			// Nome
			BancoDados.cadastrarUsuario[BancoDados.pos].setNome(novo);
			break;
		case 1:
			// E-mail
			BancoDados.cadastrarUsuario[BancoDados.pos].setEmail(novo);
			break;
		case 2:
			// Celular
			BancoDados.cadastrarUsuario[BancoDados.pos].setCelular(novo);
			break;
		case 3:
			// Logradouro
			BancoDados.cadastrarUsuario[BancoDados.pos].getEndereco().setLogradouro(novo);
			break;
		case 4:
			// Numero
			BancoDados.cadastrarUsuario[BancoDados.pos].getEndereco().setNumero(novo);
			break;
		case 5:
			// Bairro
			BancoDados.cadastrarUsuario[BancoDados.pos].getEndereco().setBairro(novo);
			break;
		case 6:
			// Cidade
			BancoDados.cadastrarUsuario[BancoDados.pos].getEndereco().setCidade(novo);
			break;
		case 7:
			// Estado
			BancoDados.cadastrarUsuario[BancoDados.pos].getEndereco().setEstado(novo);
			break;
		case 8:
			// País
			BancoDados.cadastrarUsuario[BancoDados.pos].getEndereco().setPais(novo);
			break;
		}
	}

	public static boolean isCPF(String CPF) {
		// considera-se erro CPF's formados por uma sequencia de numeros iguais
		if (CPF.equals("00000000000") || CPF.equals("11111111111") || CPF.equals("22222222222")
				|| CPF.equals("33333333333") || CPF.equals("44444444444") || CPF.equals("55555555555")
				|| CPF.equals("66666666666") || CPF.equals("77777777777") || CPF.equals("88888888888")
				|| CPF.equals("99999999999") || (CPF.length() != 11))
			return (false);

		char dig10, dig11;
		int sm, i, r, num, peso;

		// "try" - protege o codigo para eventuais erros de conversao de tipo (int)
		try {
			// Calculo do 1o. Digito Verificador
			sm = 0;
			peso = 10;
			for (i = 0; i < 9; i++) {
				// converte o i-esimo caractere do CPF em um numero:
				// por exemplo, transforma o caractere '0' no inteiro 0
				// (48 eh a posicao de '0' na tabela ASCII)
				num = (int) (CPF.charAt(i) - 48);
				sm = sm + (num * peso);
				peso = peso - 1;
			}

			r = 11 - (sm % 11);
			if ((r == 10) || (r == 11))
				dig10 = '0';
			else
				dig10 = (char) (r + 48); // converte no respectivo caractere numerico

			// Calculo do 2o. Digito Verificador
			sm = 0;
			peso = 11;
			for (i = 0; i < 10; i++) {
				num = (int) (CPF.charAt(i) - 48);
				sm = sm + (num * peso);
				peso = peso - 1;
			}

			r = 11 - (sm % 11);
			if ((r == 10) || (r == 11))
				dig11 = '0';
			else
				dig11 = (char) (r + 48);

			// Verifica se os digitos calculados conferem com os digitos informados.
			if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10)))
				return (true);
			else
				return (false);
		} catch (InputMismatchException erro) {
			return (false);
		}
	}

	public static boolean TesteLogin(String login) {
		for (int a = 0; a < BancoDados.MAX; a++)
			if (BancoDados.cadastrarUsuario[a] != null)
				if (BancoDados.cadastrarUsuario[a].getLogin().equals(login))
					return false;
		return true;
	}
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public EnderecoRes getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoRes endereco) {
		this.endereco = endereco;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public CNH getCnh() {
		return cnh;
	}

	public void setCnh(CNH cnh) {
		this.cnh = cnh;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Historico getHistorico() {
		return historico;
	}

	public void setHistorico(Historico historico) {
		this.historico = historico;
	}

	public String[] getPerfil() {

		String[] Dados = new String[10];

		Dados[0] = (getNome());
		Dados[1] = (imprimeCPF(getCpf()));
		Dados[2] = (getCelular());
		Dados[3] = (getEmail());
		Dados[4] = (getEndereco().getLogradouro() + ", " + getEndereco().getNumero() + ", "
				+ getEndereco().getBairro() + ", " + getEndereco().getCidade() + ", " + getEndereco().getEstado() + ", "
				+ getEndereco().getPais());
		Dados[5] = (" Cartão de Crédito: ");
		Dados[6] = (getGenero());
		return Dados;
	}

	public static String imprimeCPF(String CPF) {
		return (CPF.substring(0, 3) + "." + CPF.substring(3, 6) + "." + CPF.substring(6, 9) + "-"
				+ CPF.substring(9, 11));
	}

	public static String imprimeCartao(String Cartao) {
		return (Cartao.substring(0, 4) + " " + Cartao.substring(4, 9));
	}

	public static String imprimeEndereco(EnderecoRes End) {
		return (End.getLogradouro() + ", " + End.getNumero() + ", " + End.getBairro() + ", " + End.getCidade() + ", "
				+ End.getEstado() + ", " + End.getPais());
	}

	public Fidelidade getFidelidade() {
		return fidelidade;
	}

	public void setFidelidade(Fidelidade fid) {
		this.fidelidade = fid;
	}

	public String getCartaoCredito() {
		return cartaoCredito;
	}

	public void setCartaoCredito(String cartaoCredito) {
		this.cartaoCredito = cartaoCredito;
	}
}
