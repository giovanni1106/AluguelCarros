package app;

import java.awt.Image;

public class CadeiraCrianca {

	private int identificacao;
	private int idade;
	private int tamanho;
	private Image foto;
	private int valor;
	
	public CadeiraCrianca(int id, int idade, int tam, int valor) {
		
		this.identificacao = id;
		this.idade = idade;
		this.tamanho = tam;
		this.valor = valor;
		
	}
	
	
	public int getIdentificacao() {
		return identificacao;
	}
	public void setIdentificacao(int identificacao) {
		this.identificacao = identificacao;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public Image getFoto() {
		return foto;
	}
	public void setFoto(Image foto) {
		this.foto = foto;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	
}
