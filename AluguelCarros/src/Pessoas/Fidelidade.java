package Pessoas;

import Sistema.Aluguel;

public class Fidelidade {

	
	private Usuario usuario;
	private Aluguel aluguel;
	private int quantidade;
	private float desconto;
	
	public Fidelidade(Usuario us, Aluguel al, int qtd) {
		
		this.usuario = us;
		this.aluguel = al;
		this.quantidade = qtd;
		
	}
	
	public void getUsuario() {
		usuario.getFidelidade().quantidade += 1;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public Aluguel getAluguel() {
		return aluguel;
	}
	
	public void setAluguel(Aluguel aluguel) {
		this.aluguel = aluguel;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public float getDesconto() {
		
		int qtd = quantidade;
		float contador = 1;
		
		for(int a = 0; a < qtd; a++) {
			desconto = desconto + contador;
			
			if (contador <= 100)
				contador = (float) (contador + 0.25);
		}
		return desconto;
	}
	
	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}
	
	
}
