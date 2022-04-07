package Pessoas;

import Sistema.Aluguel;
import Sistema.BancoDados;

public class Historico {

	private Aluguel aluguel[] = new Aluguel[BancoDados.MAX];

	/**
	 * Construtor da classe Hist�rico
	 * @param aluguel
	 */
	public Historico(Aluguel aluguel) {
		
		this.setAluguel(aluguel);
	}


	public Aluguel[] getAluguel() {
		return aluguel;
	}

	/**
	 * Salva o aluguel em um espa�o vazio no array
	 * @param aluguel
	 */
	public void setAluguel(Aluguel aluguel) {
		
		Aluguel[] alugueis = getAluguel();
		
		for(int i = 0; i < BancoDados.MAX; i++)
			if(alugueis[i] == null) {
				this.aluguel[i] = aluguel;
				break; // Ap�s salvar no primeiro espa�o null
			}
	}
	
}
