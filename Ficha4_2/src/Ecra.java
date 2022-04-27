import java.util.ArrayList;

public class Ecra {
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	private ArrayList<Linha> Linhas;

    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================

	public ArrayList<Linha> getLinhas() {
		return Linhas;
	}

	public void setLinhas(ArrayList<Linha> linhas) {
		Linhas = linhas;
	}

    // =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================

  
   
    // CONSTRUTOR DEFAULT
	public Ecra() {
		this.Linhas = new ArrayList<Linha>();
	}
   

    // CONSTRUTOR COM PARÂMETROS



    // =======================================================
    // =================== .COMPORTAMENTOS ==================
    // =======================================================

	public void AdicionarLinha(Linha linha) {
		this.Linhas.add(linha);
	}

    // =======================================================
    // ============== MÉTODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()
	@Override
	public String toString() {
		//return this.Linhas.toString();
		
		String resposta = "";
		
		for (Linha linha : Linhas) {
			resposta += linha.toString() + "\n";
		}
		
		return resposta;
		
	}


    // ----> equals()
}
