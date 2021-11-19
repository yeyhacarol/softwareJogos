package br.senai.sp.jandira.repositoy;

import br.senai.sp.jandira.model.Jogo;

public class JogoRepository {
	
	private Jogo[] jogos;
	
	public JogoRepository(int quantidadeJogos) {
		jogos = new Jogo[quantidadeJogos];
	}
	
	public JogoRepository() {
		jogos = new Jogo[20];
	}

	public void salvarJogos(Jogo jogos, int posicao) {
		this.jogos[posicao] = jogos;
	}
	
	public Jogo listarJogo(int posicao) {
		return jogos[posicao];
	}
	
	public Jogo[] listarTodos() {
		return jogos;
	}

}
