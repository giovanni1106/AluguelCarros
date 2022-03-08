package app;

public class SeguroCarro {

	private String caracteristicas;
	private int valor;
	
	public SeguroCarro(String carac, int valor) {
		
		this.caracteristicas = carac;
		this.valor = valor;
		
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
