package Pessoas;

public class EnderecoRes {
	
	private String logradouro;
	private String numero;
	private String bairro;
	private String cidade;
	private String estado;
	private String pais;
	
	/**
	 * Construtor da classe EnderecoRes
	 * @param lo
	 * @param nu
	 * @param ba
	 * @param ci
	 * @param es
	 * @param pa
	 */
	public EnderecoRes(String lo, String nu, String ba, String ci, String es, String pa) {
		
		this.logradouro = lo;
		this.numero = nu;
		this.bairro = ba;
		this.cidade = ci;
		this.estado = es;
		this.pais = pa;
		
	}
	
	
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	
}
