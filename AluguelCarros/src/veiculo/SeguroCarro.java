package veiculo;

import Sistema.BancoDados;

public class SeguroCarro {

	private String caracteristicas;
	private int valor;
	private String Identificacao;
	
	/**
	 * Construtor da classe SeguroCarro
	 * @param Id
	 * @param carac
	 * @param valor
	 */
	public SeguroCarro(String Id, String carac, int valor) {
		
		this.caracteristicas = carac;
		this.valor = valor;
		this.Identificacao = Id;
		
	}
	
	/**
	 * Cria um array com todos os seguros cadastrados
	 * @return Retorna esse array preenchido
	 */
	public SeguroCarro[] ImprimirSeguros() {
		SeguroCarro[] Seguros = new SeguroCarro[BancoDados.MAX];
		
		for(int i = 0; i < BancoDados.MAX; i++) {
			if (BancoDados.cadastrarSeguro[i] != null)
				Seguros[i] = BancoDados.cadastrarSeguro[i];
		}
		
		return Seguros;
	}
	
	/**
	 * Permite editar alguma variavel da classe
	 * @param escolha A variavel que deseja alterar
	 * @param se A classe a ser alterada
	 * @param Dado A nova String a ser salva
	 */
	public static void Editar(int escolha, SeguroCarro se, String Dado) {

		switch (escolha) {
		case 0:
			se.setIdentificacao(Dado);
			break;
		case 1:
			se.setCaracteristicas(Dado);
			break;
		case 2:
			se.setValor(Integer.parseInt(Dado));
			break;
		}

	}
	
	/**
	 * Exclui o seguro escolhido e preenche o espaço null deixado no array com os seguros de posições superiores
	 * @param se Seguro a ser excluido
	 * @return true = excluido; false = não excluido
	 */
	public static boolean Excluir(SeguroCarro se) {

		boolean excluir = false;
		
		for(int i = 0; i < BancoDados.MAX; i++)
			if(BancoDados.cadastrarSeguro[i] == se) {
				BancoDados.cadastrarSeguro[i] = null;
				excluir = true;
			}
		
		for (int i = 0; i < BancoDados.MAX - 1; i++)
			if (BancoDados.cadastrarSeguro[i] == null && BancoDados.cadastrarSeguro[i + 1] != null) {
				BancoDados.cadastrarSeguro[i] = BancoDados.cadastrarSeguro[i + 1];
				BancoDados.cadastrarSeguro[i + 1] = null;
			}
		
		return excluir;
	}
	
	
	public String getIdentificacao() {
		return Identificacao;
	}

	public void setIdentificacao(String identificacao) {
		Identificacao = identificacao;
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}
	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	
}
