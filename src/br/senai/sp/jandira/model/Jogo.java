package br.senai.sp.jandira.model;

public class Jogo {

	private String tituloJogo;
	private Console console;
	private Fabricante fabricante;
	private boolean zerado;
	private String observacoes;
	private double valor;

	public void setTitulo(String nome) {
		this.tituloJogo = nome;
	}

	public String getTitulo() {
		return tituloJogo;
	}

	public boolean isZerado() {
		return zerado;
	}

	public void setZerado(boolean zerado) {
		this.zerado = zerado;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public String getNome() {
		return tituloJogo;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setConsole(Console console) {
		this.console = console;
	}

	public Console getConsole() {
		return console;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

}
