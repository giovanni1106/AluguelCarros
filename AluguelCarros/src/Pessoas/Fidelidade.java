package Pessoas;

import Sistema.Aluguel;

public class Fidelidade {

	private int pontos;
	private float desconto;
	
	/**
	 * Construtor da classe Fidelidade
	 * @param pontos
	 */
	public Fidelidade(int pontos) {
		
		this.setPontos(pontos);
	}
	
	public int getPontos() {
		return pontos;
	}
	
	public void setPontos(int pontos) {
		this.pontos += pontos;
	}
	
	/**
	 * Calcula o desconto com base nos pontos acumulados
	 * @return a quantidade de desconto em %
	 */
	public float getDesconto() {
		
		int qtd = pontos;
		float contador = 1;
		
		for(int a = 0; a < qtd; a++) {
			desconto = desconto + contador;
			
			if (contador <= 100)
				contador = (float) (contador + 0.25);
		}
		return desconto;
	}
	
	public void setDesconto(float desconto) {
		this.desconto += desconto;
	}
	
	
}
