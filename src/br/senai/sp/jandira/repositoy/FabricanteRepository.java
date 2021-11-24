package br.senai.sp.jandira.repositoy;

import br.senai.sp.jandira.model.Fabricante;

public class FabricanteRepository {

	private Fabricante[] fabricantes;

	public FabricanteRepository() {

		fabricantes = new Fabricante[8];
		
		fabricantes[0] = new Fabricante("Actvision Blizzard");
		fabricantes[1] = new Fabricante("Capcom");
		fabricantes[2] = new Fabricante("Eletronic Arts");
		fabricantes[3] = new Fabricante("Microsoft");
		fabricantes[4] = new Fabricante("Nintendo");
		fabricantes[5] = new Fabricante("Rockstar");
		fabricantes[6] = new Fabricante("Sega");
		fabricantes[7] = new Fabricante("Sony");
	}

	public Fabricante[] getFabricantes() {
		return fabricantes;
	}

	public void setFabricantes(Fabricante[] fabricantes) {
		this.fabricantes = fabricantes;
	}
	
	public Fabricante listarFabricante(int posicao) {
		return fabricantes[posicao];
	}
	
	public Fabricante[] listarTodos() {
		return fabricantes;
	}
	
	public int getLegth() {
		return fabricantes.length;
	}
	
}