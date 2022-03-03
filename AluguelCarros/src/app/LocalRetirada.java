package app;

import java.util.Date;

public class LocalRetirada {

	private Date dataRetirada;
	private String horaRetirada;
	private Agencia agencia;
	
	public LocalRetirada() {
		
	}
	
	public Date getDataRetirada() {
		return dataRetirada;
	}
	public void setDataRetirada(Date dataRetirada) {
		this.dataRetirada = dataRetirada;
	}
	public String getHoraRetirada() {
		return horaRetirada;
	}
	public void setHoraRetirada(String horaRetirada) {
		this.horaRetirada = horaRetirada;
	}
	public Agencia getAgencia() {
		return agencia;
	}
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
}
