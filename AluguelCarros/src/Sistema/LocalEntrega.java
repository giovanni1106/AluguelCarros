package Sistema;

import java.util.Date;

import veiculo.Agencia;

public class LocalEntrega {

	private Date dataEntrega;
	private String horaEntrega;
	private Agencia agencia;
	
	public LocalEntrega(Agencia ag) {
		
		this.agencia = ag;
		//this.dataEntrega = da;
		//this.horaEntrega = ho;
		
	}
	
	public Date getDataEntrega() {
		return dataEntrega;
	}
	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}
	public String getHoraEntrega() {
		return horaEntrega;
	}
	public void setHoraEntrega(String horaEntrega) {
		this.horaEntrega = horaEntrega;
	}
	public Agencia getAgencia() {
		return agencia;
	}
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	
}
