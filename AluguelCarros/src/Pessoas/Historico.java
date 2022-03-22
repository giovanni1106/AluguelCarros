package Pessoas;

import Sistema.Aluguel;

public class Historico {

	private Aluguel aluguel[];

	
	public Historico(Aluguel aluguel[]) {
		
		this.aluguel = aluguel;
	}


	public Aluguel[] getAluguel() {
		return aluguel;
	}


	public void setAluguel(Aluguel[] aluguel) {
		this.aluguel = aluguel;
	}
	
	
	
	
}
