package Pessoas;

import Sistema.Aluguel;
import Sistema.BancoDados;

public class Fidelidade {

	
	private Usuario usuario;
	private Aluguel aluguel;
	private int quantidade;
	private int desconto;
	
	public Fidelidade(Usuario us, Aluguel al, int qtd, int des) {
		
		this.usuario = us;
		this.aluguel = al;
		this.quantidade = qtd;
		this.desconto = des;
		
	}
	
	public Fidelidade[] getUsuario() {
		
		for (int a = 0; a < BancoDados.MAX; a++) {
			if(usuario.getFidelidade())
			
			
		}
		
		
		return usuario.getFidelidade();
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
	public int getDesconto() {
		return desconto;
	}
	public void setDesconto(int desconto) {
		this.desconto = desconto;
	}
	
	
}
