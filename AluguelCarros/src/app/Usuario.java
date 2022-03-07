package app;

public class Usuario {

	private String nome;
	private String cpf;
	private String email;
	private String nacionalidade;
	private String genero;
	private EnderecoRes endereco;
	private String celular;
	private CNH cnh;
	private String senha;
	private Historico historico;

	public Usuario(String no, String cp, String em, String na, String ge, String ce, String se) {

		this.nome = no;
		setCpf(cp);
		this.email = em;
		this.nacionalidade = na;
		this.genero = ge;
		this.celular = ce;
		this.senha = se;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public EnderecoRes getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoRes endereco) {
		this.endereco = endereco;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public CNH getCnh() {
		return cnh;
	}

	public void setCnh(CNH cnh) {
		this.cnh = cnh;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Historico getHistorico() {
		return historico;
	}

	public void setHistorico(Historico historico) {
		this.historico = historico;
	}
	
	public void setPerfil() {
		System.out.println(" Nome: " + getNome());
		System.out.println(" CPF: " + imprimeCPF(getCpf()));
		System.out.println(" Celular: " + getCelular());
		System.out.println(" E-mail: " + getEmail());
	}
	
	public static String imprimeCPF(String CPF) {
		return (CPF.substring(0, 3) + "." + CPF.substring(3, 6) + "." + CPF.substring(6, 9) + "-"
				+ CPF.substring(9, 11));
	}
}
