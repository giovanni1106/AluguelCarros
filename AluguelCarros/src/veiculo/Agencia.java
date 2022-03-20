package veiculo;

import java.util.Scanner;

import Sistema.BancoDados;

public class Agencia {

	public static Scanner ler = new Scanner(System.in);

	private String identificacao;
	private String logradouro;
	private String numero;
	private String bairro;
	private String cidade;
	private String estado;
	private String pais;
	public Carro carro[] = new Carro[BancoDados.MAX];

	public Agencia(String id, String lo, String nu, String ba, String ci, String es, String pa) {

		this.identificacao = id;
		this.logradouro = lo;
		this.numero = nu;
		this.bairro = ba;
		this.cidade = ci;
		this.estado = es;
		this.pais = pa;
	}

	public static void Cadastrar() {

		String identificacao;
		String logradouro;
		String numero;
		String bairro;
		String cidade;
		String estado;
		String pais;

		System.out.print(" Identificacao: ");
		identificacao = ler.nextLine();

		System.out.print(" Logradouro: ");
		logradouro = ler.nextLine();

		System.out.print(" Numero: ");
		numero = ler.nextLine();

		System.out.print(" Bairro: ");
		bairro = ler.nextLine();

		System.out.print(" Cidade: ");
		cidade = ler.nextLine();

		System.out.print(" Estado: ");
		estado = ler.nextLine();

		System.out.print(" Pais: ");
		pais = ler.nextLine();

		int num = 0;

		for (int a = 0; a < BancoDados.MAX; a++)
			if (BancoDados.cadastrarAgencia[a] == null) {
				num = a;
				break;
			}

		BancoDados.cadastrarAgencia[num] = new Agencia(identificacao, logradouro, numero, bairro, cidade, estado, pais);

		System.out.println(" Agencia cadastrada com sucesso!");
	}

	public static void Excluir() {
		int total = Imprimir();
		int escolha;

		System.out.print(" Agencia que deseja excluir (0-" + total + "): ");
		escolha = ler.nextInt();

		BancoDados.cadastrarAgencia[escolha] = null;

		for (int a = 0; a < BancoDados.MAX-1; a++)
			if (BancoDados.cadastrarAgencia[a] == null && BancoDados.cadastrarAgencia[a + 1] != null) {
				BancoDados.cadastrarAgencia[a] = BancoDados.cadastrarAgencia[a + 1];
				BancoDados.cadastrarAgencia[a + 1] = null;
			}
		
		System.out.println(" Agencia excluida com sucesso!");
	}

	public static int Imprimir() {
		int a;

		for (a = 0; a < BancoDados.MAX; a++)
			if (BancoDados.cadastrarAgencia[a] != null)
				System.out.println(" " + a + "- " + BancoDados.cadastrarAgencia[a].getIdentificacao());
			else
				break;
		return a - 1;
	}

	public static void VincularCarro() {

		int total1 = Imprimir();
		int escolha1;

		System.out.print(" Agencia que deseja vincular (0-" + total1 + "): ");
		escolha1 = ler.nextInt();
		System.out.println("");
		
		Agencia A = BancoDados.cadastrarAgencia[escolha1];
		
		//int total = Carro.Imprimir();
		int escolha = 0;
		int a;

		//System.out.print(" Escolha um carro (0-" + total + "): ");
		escolha = ler.nextInt();

		for (a = 0; a < BancoDados.MAX; a++)
			if (A.carro[a] == null)
				break;

		A.carro[a] = BancoDados.cadastrarCarro[escolha];

		System.out.println(" Carro vinculado com sucesso!");
	}
	
	public static void VincularCarroBD(Carro C, Agencia A) {

		int a;
		
		for (a = 0; a < BancoDados.MAX; a++)
			if (A.carro[a] == null)
				break;

		A.carro[a] = C;
	}

	public static void DesvincularCarro() {

		int total1 = Imprimir();
		int escolha1;

		System.out.print(" Agencia que deseja vincular (0-" + total1 + "): ");
		escolha1 = ler.nextInt();
		System.out.println("");
		
		Agencia A = BancoDados.cadastrarAgencia[escolha1];
		
		int total = ImprimirCarrosVinculados(A);
		int escolha = 0;

		System.out.print(" Escolha um carro (0-" + total + "): ");
		escolha = ler.nextInt();

		A.carro[escolha] = null;

		// repassar carros para posição de "cima"
		for (int a = 0; a < BancoDados.MAX-1; a++)
			if (A.carro[a] == null && A.carro[a + 1] != null) {
				A.carro[a] = A.carro[a + 1];
				A.carro[a + 1] = null;
			}

		System.out.println(" Carro desvinculado com sucesso!");
	}

	public static int ImprimirCarrosVinculados(Agencia A) {

		int a;

		for (a = 0; a < BancoDados.MAX; a++)
			if (A.carro[a] != null)
				System.out.println(" " + a + "- " + A.carro[a].getModelo());
			else
				break;

		return a - 1;
	}

	
	public Carro[] getCarro() {
		return carro;
	}

	public void setCarro(Carro[] carro) {
		this.carro = carro;
	}

	public String getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
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
