public class Jogada {
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	private int coluna;
	private int linha;
	private Jogador jogador;

    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================

	public int getColuna() {
		return coluna;
	}
	
	public void setColuna(int coluna) {
		this.coluna = coluna;
	}
	
	public int getLinha() {
		return linha;
	}
	
	public void setLinha(int linha) {
		this.linha = linha;
	}

	public Jogador getJogador() {
		return jogador;
	}
	
	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}

    // =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================

  
   
    // CONSTRUTOR DEFAULT

   

    // CONSTRUTOR COM PARÂMETROS
	public Jogada(int coluna, int linha, Jogador jogador) {
		super();
		this.coluna = coluna;
		this.linha = linha;
		this.jogador = jogador;
	}


    // =======================================================
    // =================== .COMPORTAMENTOS ==================
    // =======================================================




    // =======================================================
    // ============== MÉTODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()



    // ----> equals()
}
