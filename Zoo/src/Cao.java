public class Cao extends AnimalDomestico {
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	private String raca;

    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

    // =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================

  
   
    // CONSTRUTOR DEFAULT

   

    // CONSTRUTOR COM PARÂMETROS
	public Cao(String nome, String voz) {
		super(nome, voz);
		// TODO Auto-generated constructor stub
	}

	public Cao(String nome, String voz, String raca) {
		super(nome, voz);
		this.raca = raca;
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
