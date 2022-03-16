package Pessoas;

import Sistema.Aluguel;

public class Historico {

	private Aluguel aluguel;
	private Usuario usuario;
	
	public Historico(Aluguel aluguel, Usuario usuario) {
		
		this.aluguel = aluguel;
		this.usuario = usuario;
		
	}
	
	public Aluguel getAluguel() {
		return aluguel;
	}
	public void setAluguel(Aluguel aluguel) {
		this.aluguel = aluguel;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}
