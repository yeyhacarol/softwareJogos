package br.senai.sp.jandira.model;

public enum Console {

	ATARI("Atari"), GAMEBOY("Game Boy"), MASTERSYSTEM("Master System"), MEGADRIVE("Mega Drive"), 
	NINTENDO("Nintendo"), PLAYSTATION("Playstation"), XBOX("Xbox");

	private String descricao;

	private Console(String descricao) {
		this.descricao = descricao;
	}
	
	private String getDescricao() {
		return descricao;
	}
	
	@Override 
	public String toString() {
		return descricao;
	}

}
