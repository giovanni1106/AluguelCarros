package Pessoas;

import Sistema.Aluguel;

public class Fidelidade {

	private int pontos;
	private float desconto;
	
	public Fidelidade(int pontos) {
		
		this.setPontos(pontos);
	}
	
	public int getPontos() {
		return pontos;
	}
	
	public void setPontos(int pontos) {
		this.pontos += pontos;
	}
	
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
