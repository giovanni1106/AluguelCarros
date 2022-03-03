package app;

public class TarifasAd {

	private SeguroCarro seguro;
	private CadeiraCrianca cadeira;
	private boolean wifi;
	
	public TarifasAd() {
		
	}
	
	public SeguroCarro getSeguro() {
		return seguro;
	}
	public void setSeguro(SeguroCarro seguro) {
		this.seguro = seguro;
	}
	public CadeiraCrianca getCadeira() {
		return cadeira;
	}
	public void setCadeira(CadeiraCrianca cadeira) {
		this.cadeira = cadeira;
	}
	public boolean isWifi() {
		return wifi;
	}
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}
	
}
