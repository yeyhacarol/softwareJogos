package br.senai.sp.jandira.model;

public enum Console {

	ATARI("Atari"), DREAMCAST("Dreamcast"), GAMEBOYADVANCED("Game Boy Advance"), GAMEBOY("Game Boy"),
	GAMECUBE("GameCube"), GAMEGEAR("Game Gear"), MASTERSYSTEM("Master System"), MEGADRIVE("Mega Drive"), NES("NES"),
	NINTENDO("Nintendo"), NINTENDODS("Nintendo DS"), NINTENDOMEIAQUATRO("Nintendo 64"), TRESDS("3DS"),
	PLAYSTATION("Playstation"), PLAYSTATIONDOIS("Playstation 2"), PLAYSTATIONTRES("Playstation 3"), PSP("PSP"), SNES("SNES"),
	WII("Wii"), XBOX("Xbox"), XBOXONEX("Xbox "), XBOXTRESMEIAZERO("Xbox 360");

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
