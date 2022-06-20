public class Leao extends AnimalSelvagem {
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	private String continente;

    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================

	public String getContinente() {
		return continente;
	}

	public void setContinente(String continente) {
		this.continente = continente;
	}

    // =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================

  
   
    // CONSTRUTOR DEFAULT

   

    public Leao(String nome, String voz, String continente) {
		super(nome, voz);
		this.continente = continente;
	}

	// CONSTRUTOR COM PARÂMETROS
	public Leao(String nome, String voz) {
		super(nome, voz);
		// TODO Auto-generated constructor stub
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
