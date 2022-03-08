package app;

import java.util.Date;
import java.util.Scanner;

public class Aluguel {

	public static Scanner ler = new Scanner(System.in);

	private Usuario usuario;
	private LocalRetirada retirada;
	private LocalEntrega entrega;
	private Carro carro;
	private TarifasAd tarifas;
	private Fidelidade fidelidade;
	private int valorTotal;
	private Pagamento pagamento;

	public Aluguel(Usuario usuario, Agencia agR, Agencia agE, Carro carro, int valorTotal) {

		this.usuario = usuario;
		this.carro = carro;
		this.valorTotal = valorTotal;
		retirada = new LocalRetirada(agR);
		entrega = new LocalEntrega(agE);
		carro.setAlugado(true);

	}

	public static void Alugar() {
		Carro C = Carro.BuscarMarca();
		Usuario U = Teste.cadastrar[Teste.pos];
		int valorTotal = C.getClasse().getValorDia();
		Agencia AR;
		Agencia AE;

		int cont = 0;

		int escolhaAR = 0;
		int escolhaAE = 0;

		System.out.println("=============================================\n");
		System.out.println(" Agencias disponiveis para retirada");
		System.out.println("---------------------------------------------");

		for (int i = 0; i < Teste.MAX; i++) {
			if (Teste.cadastrarAgencia[i] != null)
				for (int a = 0; a < Teste.MAX; a++) {
					if (Teste.cadastrarAgencia[i].carro[a] != null)
						if (Teste.cadastrarAgencia[i].carro[a] == C) {
							System.out.println(" " + cont + "- " + Teste.cadastrarAgencia[i].getIdentificacao());
							System.out.println("    " + Teste.cadastrarAgencia[i].getPais());
							System.out.println("    " + Teste.cadastrarAgencia[i].getEstado());
							System.out.println("    " + Teste.cadastrarAgencia[i].getBairro());
							System.out.println("    " + Teste.cadastrarAgencia[i].getCidade());
							System.out.println("");
							cont = cont + 1;
							break;
						}
				}
			else
				break;
		}

		cont = cont - 1;
		System.out.println("---------------------------------------------");
		System.out.print(" Escolha uma agencia (0-" + (cont) + "): ");
		escolhaAR = ler.nextInt();

		cont = 0;

		int agencia = 0;
		
		for (int i = 0; i < Teste.MAX; i++)
			if (Teste.cadastrarAgencia[i] != null)
				for (int a = 0; a < Teste.MAX; a++)
					if (Teste.cadastrarAgencia[i].carro[a] != null)
						if (Teste.cadastrarAgencia[i].carro[a] == C)
							if (cont == escolhaAR)
								agencia = i;
							else
								cont = cont + 1;
		
		AR = Teste.cadastrarAgencia[agencia];
		System.out.println("=============================================\n");
		System.out.println(" Agencias disponiveis para entrega");
		System.out.println("---------------------------------------------");

		cont = 0;
		
		for (int i = 0; i < Teste.MAX; i++) {
			if (Teste.cadastrarAgencia[i] != null) {

				System.out.println(" " + cont + "- " + Teste.cadastrarAgencia[i].getIdentificacao());
				System.out.println("    " + Teste.cadastrarAgencia[i].getPais());
				System.out.println("    " + Teste.cadastrarAgencia[i].getEstado());
				System.out.println("    " + Teste.cadastrarAgencia[i].getBairro());
				System.out.println("    " + Teste.cadastrarAgencia[i].getCidade());
				System.out.println("");
				cont = cont + 1;

			} else
				break;
		}
		
		System.out.println("---------------------------------------------");
		System.out.print(" Escolha uma agencia (0-" + (cont - 1) + "): ");
		escolhaAE = ler.nextInt();

		AE = Teste.cadastrarAgencia[escolhaAE];
		
		Aluguel A = new Aluguel(U, AR, AE, C, valorTotal);
		
		System.out.println(" Aluguel realizado com sucesso!");
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
