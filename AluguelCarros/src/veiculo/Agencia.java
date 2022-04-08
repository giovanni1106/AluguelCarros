package veiculo;

import java.util.Scanner;

import Pessoas.Usuario;
import Sistema.BancoDados;
import view.UsuarioAlugar;

public class Agencia {

	public static Scanner ler = new Scanner(System.in);

	private String identificacao;
	private String logradouro;
	private String numero;
	private String bairro;
	private String cidade;
	private String estado;
	private String pais;
	public Carro carro[] = new Carro[BancoDados.MAX];

	/**
	 * Construtor da classe Agencia
	 * 
	 * @param id
	 * @param lo
	 * @param nu
	 * @param ba
	 * @param ci
	 * @param es
	 * @param pa
	 */
	public Agencia(String id, String lo, String nu, String ba, String ci, String es, String pa) {

		this.identificacao = id;
		this.logradouro = lo;
		this.numero = nu;
		this.bairro = ba;
		this.cidade = ci;
		this.estado = es;
		this.pais = pa;
	}

	/**
	 * Exclui a agencia recebida
	 * 
	 * @param ag recebe a agencia
	 * @return true = excluido; false = não excluido
	 */
	public static boolean Excluir(Agencia ag) {

		boolean excluir = false;

		for (int i = 0; i < BancoDados.MAX; i++)
			if (BancoDados.cadastrarAgencia[i] == ag) {
				BancoDados.cadastrarAgencia[i] = null;
				excluir = true;
			}

		for (int a = 0; a < BancoDados.MAX - 1; a++)
			if (BancoDados.cadastrarAgencia[a] == null && BancoDados.cadastrarAgencia[a + 1] != null) {
				BancoDados.cadastrarAgencia[a] = BancoDados.cadastrarAgencia[a + 1];
				BancoDados.cadastrarAgencia[a + 1] = null;
			}

		return excluir;
	}

	public static void Editar(int escolha, String novo, Agencia us) {

		switch (escolha) {
		case 0:
			// Nome
			us.setIdentificacao(novo);
			break;
		case 1:
			// Logradouro
			us.setLogradouro(novo);
			break;
		case 2:
			// Numero
			us.setNumero(novo);
			break;
		case 3:
			// Bairro
			us.setBairro(novo);
			break;
		case 4:
			// Cidade
			us.setCidade(novo);
			break;
		case 5:
			// Estado
			us.setEstado(novo);
			break;
		case 6:
			// País
			us.setPais(novo);
			break;
		}
	}

	/**
	 * Testa se não existe outra identificação igual
	 * @param ag String para testar
	 * @return true = não existe; false = existe
	 */
	public static boolean TesteId(String ag) {
		for (int i = 0; i < BancoDados.MAX; i++)
			if (BancoDados.cadastrarAgencia[i] != null)
				if (BancoDados.cadastrarAgencia[i].getIdentificacao().equals(ag))
					return false; // é igual

		return true; // n é igual
	}

	public static String[] ImprimirCidades() {
		String[] Cidades = new String[BancoDados.MAX];

		for (int i = 0; i < BancoDados.MAX; i++)
			if (BancoDados.cadastrarAgencia[i] != null) {
				for (int a = 0; a < BancoDados.MAX; a++) {
					if (BancoDados.cadastrarAgencia[i].getCidade().equals(Cidades[a]) == false) {
						if (Cidades[a] == null) {
							Cidades[a] = BancoDados.cadastrarAgencia[i].getCidade();
							break;
						}
					} else
						break;
				}
			}
		return Cidades;
	}

	public static String[] ImprimirCarrosVinculados(String cidade, Agencia ag) {
		int cont = 0;

		String[] CarroCidade = new String[BancoDados.MAX];

		if (ag == null) {
			// Zera o vetor de carros
			for (int i = 0; i < BancoDados.MAX; i++) {
				UsuarioAlugar.Carros[i] = null;
			}

			// Salva os novos carros
			for (int a = 0; a < BancoDados.MAX; a++)
				if (BancoDados.cadastrarAgencia[a] != null)
					if (BancoDados.cadastrarAgencia[a].getCidade().equals(cidade) == true) {
						for (int i = 0; i < BancoDados.MAX; i++)
							if (BancoDados.cadastrarAgencia[a].carro[i] != null) {
								CarroCidade[cont] = BancoDados.cadastrarAgencia[a].carro[i].getModelo();
								UsuarioAlugar.Carros[cont] = BancoDados.cadastrarAgencia[a].carro[i];
								cont++;
							}
					}
		} else {

			for (int i = 0; i < BancoDados.MAX; i++)
				if (BancoDados.cadastrarAgencia[i] == ag) {
					Carro[] cars = BancoDados.cadastrarAgencia[i].getCarro();

					for (int a = 0; a < BancoDados.MAX; a++)
						if (cars[a] != null)
							CarroCidade[a] = cars[a].getModelo();
				}
		}

		return CarroCidade;
	}

	/**
	 * Desvincula o carro fornecido e repassa os carros para ocupar a posição nula
	 * 
	 * @param pos posição de exclusão
	 */
	public void DesvincularCarro(int pos) {
		this.carro[pos] = null;

		for (int a = 0; a < BancoDados.MAX - 1; a++)
			if (this.carro[a] == null && this.carro[a + 1] != null) {
				this.carro[a] = this.carro[a + 1];
				this.carro[a + 1] = null;
			}
	}

	public Carro[] getCarro() {
		return carro;
	}

	public void setCarro(Carro car) {
		Carro[] cars = getCarro();
		for (int i = 0; i < BancoDados.MAX; i++)
			if (cars[i] == null) {
				this.carro[i] = car;
				break; // salva apenas no primeiro null
			}
	}

	public String getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getEndereco() {
		String Endereco = "";

		Endereco = getLogradouro() + ", " + getNumero() + ", " + getBairro() + ", " + getCidade() + ", " + getEstado()
				+ ", " + getPais();

		return Endereco;
	}

}
