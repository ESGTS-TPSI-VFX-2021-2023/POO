import java.util.ArrayList;

public class Tabuleiro {
	
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	private Jogador jogador1;
	private Jogador jogador2;
	private ArrayList<Jogada> jogadas = new ArrayList<Jogada>();
	

    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================

	public Jogador getJogador1() {
		return jogador1;
	}
	
	public void setJogador1(Jogador jogador1) {
		this.jogador1 = jogador1;
	}
	
	public Jogador getJogador2() {
		return jogador2;
	}
	
	public void setJogador2(Jogador jogador2) {
		this.jogador2 = jogador2;
	}
	
	public ArrayList<Jogada> getJogadas() {
		return jogadas;
	}
	
	public void setJogadas(ArrayList<Jogada> jogadas) {
		this.jogadas = jogadas;
	}

    // =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================

  
   
    // CONSTRUTOR DEFAULT

   

    // CONSTRUTOR COM PARÂMETROS
	public Tabuleiro(Jogador jogador1, Jogador jogador2) {
		super();
		this.jogador1 = jogador1;
		this.jogador2 = jogador2;
	}

    // =======================================================
    // =================== .COMPORTAMENTOS ==================
    // =======================================================

	public void AdicionarJogada(Jogada jogada) {
		this.jogadas.add(jogada);
	}

    // =======================================================
    // ============== MÉTODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()



    // ----> equals()

}
