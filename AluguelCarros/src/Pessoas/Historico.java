package Pessoas;

import Sistema.Aluguel;
import Sistema.BancoDados;

public class Historico {

	private Aluguel aluguel[];

	
	public Historico(Aluguel aluguel) {
		
		this.setAluguel(aluguel);
	}


	public Aluguel[] getAluguel() {
		return aluguel;
	}


	public void setAluguel(Aluguel aluguel) {
		
		Aluguel[] alugueis = getAluguel();
		
		for(int i = 0; i < BancoDados.MAX; i++)
			if(alugueis[i] == null) {
				this.aluguel[i] = aluguel;
				break; // Após salvar no primeiro espaço null
			}
	}
	
}
