import java.util.ArrayList;

public class Linha {
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	private ArrayList<Pixel> Pixeis;

    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================

	public ArrayList<Pixel> getPixeis() {
		return Pixeis;
	}

	public void setPixeis(ArrayList<Pixel> pixeis) {
		Pixeis = pixeis;
	}

    // =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================

  
   
    // CONSTRUTOR DEFAULT
	public Linha() {
		this.Pixeis = new ArrayList<Pixel>();
	}
   

    // CONSTRUTOR COM PARÂMETROS



    // =======================================================
    // =================== .COMPORTAMENTOS ==================
    // =======================================================

	public void AdicionarPixel(Pixel pixel) {
		this.Pixeis.add(pixel);
	}


    // =======================================================
    // ============== MÉTODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()
	@Override
	public String toString() {

		String resposta = "";
		
		for (Pixel pixel : Pixeis) {
			resposta += pixel.toString();
		}
		
		return resposta;
		
	}


    // ----> equals()
}
