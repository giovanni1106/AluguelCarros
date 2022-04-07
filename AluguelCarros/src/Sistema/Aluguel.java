package Sistema;

import java.util.Calendar;
import java.util.Date;

import Pessoas.Fidelidade;
import Pessoas.Usuario;
import veiculo.Agencia;
import veiculo.Carro;
import veiculo.CadeiraCrianca;
import veiculo.SeguroCarro;

public class Aluguel {

	private Usuario usuario;
	private Agencia agenciaReitrada;
	private Agencia agenciaEntrega;
	private Calendar dataRetirada;
	private Calendar dataEntrega;
	private Carro carro;
	private SeguroCarro seguro;
	private CadeiraCrianca cadeira;
	private Fidelidade fidelidade;
	private long valorTotal;

	/**
	 * Construtor da classe Aluguel
	 * @param usuario
	 * @param agR
	 * @param dataR
	 * @param agE
	 * @param dataE
	 * @param seguro
	 * @param cadeira
	 * @param carro
	 * @param valorTotal
	 */
	public Aluguel(Usuario us, Agencia agR, Calendar dataR, Agencia agE, Calendar dataE, SeguroCarro seguro,
			CadeiraCrianca cadeira, Carro carro, long valorTotal) {
		
		this.carro = carro;
		this.agenciaEntrega = agE;
		this.agenciaReitrada = agR;
		this.dataEntrega = dataE;
		this.dataRetirada = dataR;
		this.seguro = seguro;
		this.cadeira = cadeira;
		this.valorTotal = valorTotal;
		carro.setAlugado(true);
		this.setUsuario(us);
	}

	public Usuario getUsuario() {
		return usuario;
	}

	/**
	 * Salva o usuário e o aluguel em seu histórico
	 * @param usuario
	 */
	public void setUsuario(Usuario us) {
		this.usuario = us;
		usuario.setAlugueis(this);
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	
	public Agencia getAgenciaReitrada() {
		return agenciaReitrada;
	}

	public void setAgenciaReitrada(Agencia agenciaReitrada) {
		this.agenciaReitrada = agenciaReitrada;
	}

	public Agencia getAgenciaEntrega() {
		return agenciaEntrega;
	}

	public void setAgenciaEntrega(Agencia agenciaEntrega) {
		this.agenciaEntrega = agenciaEntrega;
	}

	public Calendar getDataRetirada() {
		return dataRetirada;
	}

	public void setDataRetirada(Calendar dataRetirada) {
		this.dataRetirada = dataRetirada;
	}

	public Calendar getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(Calendar dataEntrega) {
		this.dataEntrega = dataEntrega;
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

	public Fidelidade getFidelidade() {
		return fidelidade;
	}

	public void setFidelidade(Fidelidade fidelidade) {
		this.fidelidade = fidelidade;
	}

	public long getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(long valorTotal) {
		this.valorTotal = valorTotal;
	}
}
