package Sistema;

import java.util.Date;
import java.util.Scanner;

import Pessoas.Fidelidade;
import Pessoas.Usuario;
import veiculo.Agencia;
import veiculo.Carro;
import veiculo.TarifasAd;

public class Aluguel {

	private int Identificacao;
	private Usuario usuario;
	private LocalRetirada retirada;
	private LocalEntrega entrega;
	private Carro carro;
	private TarifasAd tarifas;
	private Fidelidade fidelidade;
	private int valorTotal;
	private Pagamento pagamento;

	public Aluguel(int id, Usuario usuario, LocalRetirada LR, LocalEntrega LE, Carro carro, int valorTotal) {

		this.Identificacao = id; 
		this.usuario = usuario;
		this.carro = carro;
		this.valorTotal = valorTotal;
		setRetirada(LR);
		setEntrega(LE);
		carro.setAlugado(true);

	}

	
	
	public int getIdentificacao() {
		return Identificacao;
	}



	public void setIdentificacao(int identificacao) {
		Identificacao = identificacao;
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
