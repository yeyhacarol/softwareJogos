package br.senai.sp.jandira.model;

public class Fabricante {

	private String nomeFabricante;
	private String fundacao;
	private String sede;

	public Fabricante(String fabricante) {
		this.nomeFabricante = fabricante;
	}

	public Fabricante() {

	}

	public void setNome(int nome) {
		this.nomeFabricante = Integer.toString(nome);
	}

	public String getNome() {
		return nomeFabricante;
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
		return this.nomeFabricante;
	}

}
