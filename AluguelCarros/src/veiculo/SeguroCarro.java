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
