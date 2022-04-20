import java.util.ArrayList;
import java.util.Iterator;

public class Desenho {
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	private ArrayList<Ponto> Pontos;

    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================

	public ArrayList<Ponto> getPontos() {
		return Pontos;
	}

	public void setPontos(ArrayList<Ponto> pontos) {
		Pontos = pontos;
	}

    // =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================

  
   
    // CONSTRUTOR DEFAULT
	public Desenho() {
		this.Pontos = new ArrayList<Ponto>();
	}
   

    // CONSTRUTOR COM PARÂMETROS



    // =======================================================
    // =================== .COMPORTAMENTOS ==================
    // =======================================================

	public void AdicionarPonto(Ponto p) {
		this.Pontos.add(p);
	}
	
	public void RemoverPonto(int index) {
		this.Pontos.remove(index);
	}
	
	public Ponto MaisEsquerda() {
		
		Ponto pontoMaisEsquerda = this.Pontos.get(0);
		
		for (Ponto ponto : this.Pontos) {
			if (ponto.getX() < pontoMaisEsquerda.getX()) {
				pontoMaisEsquerda = ponto;
			}
		}
		
		return pontoMaisEsquerda;
		
	}
	
	public Ponto MaisDireita() {
		
		Ponto pontoMaisDireita = this.Pontos.get(0);
		
		for (Ponto ponto : this.Pontos) {
			if (ponto.getX() > pontoMaisDireita.getX()) {
				pontoMaisDireita = ponto;
			}
		}
		
		return pontoMaisDireita;
		
	}
	
	public boolean PontoExiste(int x, int y) {
		
		for (Ponto ponto : Pontos) {
			if (ponto.getX() == x && ponto.getY() == y) {
				return true;
			}
		}
		
		return false;
		
	}
	
	public ArrayList<Ponto> PontosQuadrante(int quadrante){
		
		ArrayList<Ponto> pontos = new ArrayList<Ponto>();
		
		for (Ponto ponto : pontos) {
			
			if (ponto.getX() >= 0 && ponto.getY() >= 0 && quadrante == 1) {
				pontos.add(ponto);
			}
			
			if (ponto.getX() < 0 && ponto.getY() >= 0 && quadrante == 2) {
				pontos.add(ponto);
			}
			
			if (ponto.getX() < 0 && ponto.getY() < 0 && quadrante == 3) {
				pontos.add(ponto);
			}
			
			if (ponto.getX() < 0 && ponto.getY() >= 0 && quadrante == 4) {
				pontos.add(ponto);
			}
			
		}
		
		return pontos;
		
	}

    // =======================================================
    // ============== MÉTODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()



    // ----> equals()
}
