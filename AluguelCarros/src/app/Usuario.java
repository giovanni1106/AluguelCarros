package app;

public class Usuario {

	private int nacionalidade;
	private String cpf;
	private String nome;
	private int genero;
	private String email;
	private EnderecoRes endereco;
	private String celular;
	private CNH cnh;
	private String cartaoCredito;
	private String senha;
	private Historico historico;
	
	public Usuario() {
		
	}
	
	public int getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(int nacionalidade) {
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
	public int getGenero() {
		return genero;
	}
	public void setGenero(int genero) {
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
	public String getCartaoCredito() {
		return cartaoCredito;
	}
	public void setCartaoCredito(String cartaoCredito) {
		this.cartaoCredito = cartaoCredito;
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
}
