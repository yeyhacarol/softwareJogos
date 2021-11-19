package br.senai.sp.jandira.model;

public class Fabricante {

	private String nome;
	private String fundacao;
	private String sede;

	public Fabricante(String fabricante) {
		this.nome = fabricante;
	}
	
	public Fabricante() {
		
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setFundacao(String fundacao) {
		this.fundacao = fundacao;
	}

	public String getFundacao() {
		return fundacao;
	}

	public void setSede(String sede) {
		this.sede = sede;
	}

	public String getSede() {
		return sede;
	}
	
	@Override
	public String toString() {
		return this.nome;
	}

}
