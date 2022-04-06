package veiculo;

import java.awt.Image;

import Sistema.BancoDados;

public class CadeiraCrianca {

	private String identificacao;
	private int idade;
	private int valor;
	
	public CadeiraCrianca(String id, int idade, int valor) {
		
		this.identificacao = id;
		this.idade = idade;
		this.valor = valor;
		
	}
	
	public CadeiraCrianca[] ImprimirCadeiras() {
		CadeiraCrianca[] Cadeiras = new CadeiraCrianca[BancoDados.MAX];
		
		for(int i = 0; i < BancoDados.MAX; i++) {
			if (BancoDados.cadastrarSeguro[i] != null)
				Cadeiras[i] = BancoDados.cadastrarCadeira[i];
		}
		
		return Cadeiras;
	}
	
	public String getIdentificacao() {
		return identificacao;
	}
	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	
}
