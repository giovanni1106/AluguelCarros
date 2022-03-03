package app;

public class Aluguel {

	private Usuario usuario;
	private LocalRetirada retirada;
	private LocalEntrega entrega;
	private Carro carro;
	private TarifasAd tarifas;
	private Fidelidade fidelidade;
	private int valorTotal;
	private Pagamento pagamento;

	public Aluguel() {
		
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public LocalRetirada getRetirada() {
		return retirada;
	}

	public void setRetirada(LocalRetirada retirada) {
		this.retirada = retirada;
	}

	public LocalEntrega getEntrega() {
		return entrega;
	}

	public void setEntrega(LocalEntrega entrega) {
		this.entrega = entrega;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	public TarifasAd getTarifas() {
		return tarifas;
	}

	public void setTarifas(TarifasAd tarifas) {
		this.tarifas = tarifas;
	}

	public Fidelidade getFidelidade() {
		return fidelidade;
	}

	public void setFidelidade(Fidelidade fidelidade) {
		this.fidelidade = fidelidade;
	}

	public int getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(int valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}

}
