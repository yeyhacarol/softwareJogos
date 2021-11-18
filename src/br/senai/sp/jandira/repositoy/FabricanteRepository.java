package br.senai.sp.jandira.repositoy;

import br.senai.sp.jandira.model.Fabricante;

public class FabricanteRepository {

	private Fabricante[] fabricante;

	public FabricanteRepository() {

		fabricante = new Fabricante[5];
		
		fabricante[0] = new Fabricante("Atari");
		fabricante[1] = new Fabricante("Microsoft");
		fabricante[2] = new Fabricante("Nintendo");
		fabricante[3] = new Fabricante("Sega");
		fabricante[4] = new Fabricante("Sony");
	}

	public Fabricante listarFabricante(int posicao) {
		return fabricante[posicao];
	}
	
	public Fabricante[] listarTodos() {
		return fabricante;
	}

}