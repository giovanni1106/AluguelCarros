package Sistema;

import Pessoas.Usuario;

public class Pagamento {

	private Usuario cartaoCredito;
	private Aluguel aluguel;
	
	public Pagamento(Usuario cc, Aluguel al) {
		
		this.cartaoCredito = cc;
		this.aluguel = al;
		
	}
	
	public Usuario getCartaoCredito() {
		return cartaoCredito;
	}
	public void setCartaoCredito(Usuario cartaoCredito) {
		this.cartaoCredito = cartaoCredito;
	}
	public Aluguel getAluguel() {
		return aluguel;
	}
	public void setAluguel(Aluguel aluguel) {
		this.aluguel = aluguel;
	}
	
}
