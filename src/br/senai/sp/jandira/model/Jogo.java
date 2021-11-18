package br.senai.sp.jandira.model;

public class Jogo {

	private String nome;
	private Fabricante fabricante;
	private Console console;
	private double valor;

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
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
