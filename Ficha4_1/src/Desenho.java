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

    // =======================================================
    // ============== MÉTODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()



    // ----> equals()
}
