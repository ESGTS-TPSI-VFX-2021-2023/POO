import java.util.ArrayList;

public class Tabuleiro {
	
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	private Jogador jogador1;
	private Jogador jogador2;
	private ArrayList<Jogada> jogadas = new ArrayList<Jogada>();
	private int estado;
	private int colunas;
	private int linhas;

    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================

	public int getColunas() {
		return colunas;
	}

	public void setColunas(int colunas) {
		this.colunas = colunas;
	}

	public int getLinhas() {
		return linhas;
	}

	public void setLinhas(int linhas) {
		this.linhas = linhas;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

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
		this.estado = 0;
	}
	
	public Tabuleiro(Jogador jogador1, Jogador jogador2, int linhas, int colunas) {
		super();
		this.jogador1 = jogador1;
		this.jogador2 = jogador2;
		this.linhas = linhas;
		this.colunas = colunas;
		this.estado = 0;
	}

    // =======================================================
    // =================== .COMPORTAMENTOS ==================
    // =======================================================

	public void AdicionarJogada(Jogada jogada) {
		
		if (this.jogadas.size() > 0 
				&& this.jogadas.get(this.jogadas.size()-1).getJogador() == this.jogador1) {
			jogada.setJogador(this.jogador2);
		} else {
			jogada.setJogador(this.jogador1);
		}
		
		if (jogada.getLinha() >= 1 && jogada.getLinha() <= linhas) {
			if (jogada.getColuna() >= 1 && jogada.getColuna() <= colunas) {
				
				if (!VerificaSeJogadaExiste(jogada)) {
					this.jogadas.add(jogada);
					VerificaEstado();
				}
				
			}
		}
		
	}

	private boolean VerificaSeJogadaExiste(Jogada jogadaNova) {
		
		for (Jogada jogada : jogadas) {
			if (jogada.getLinha() == jogadaNova.getLinha() 
					&& jogada.getColuna() == jogadaNova.getColuna()) {
				return true;
			}
		}
		
		return false;
	}

	public void VerificaEstado() {
		
		//Verifica se já ganhou....
		
		if (this.jogadas.size() == (linhas * colunas)) {
			this.estado = 1;
		}
		
	}

    // =======================================================
    // ============== MÉTODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()
	@Override
	public String toString() {
		String resultado;
		
		resultado = mostraJogada(1,1) + " | " + mostraJogada(1,2) + " | " + mostraJogada(1,3);
		resultado += "\n" + mostraJogada(2,1) + " | " + mostraJogada(2,2) + " | " + mostraJogada(2,3);
		resultado += "\n" + mostraJogada(3,1) + " | " + mostraJogada(3,2) + " | " + mostraJogada(3,3);
		
		return resultado;
	}

	private char mostraJogada(int linha, int coluna) {
		// TODO Auto-generated method stub
		for (Jogada jogada : jogadas) {
			if (jogada.getLinha() == linha && jogada.getColuna() == coluna) {
				return jogada.getJogador().getCarater(); 
			}
		}
		
		return ' ';
	}


    // ----> equals()

}
