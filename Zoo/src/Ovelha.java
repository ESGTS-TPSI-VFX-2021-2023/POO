public class Ovelha extends AnimalDomestico {
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	private double peso;

    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

    // =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================

  
   
    // CONSTRUTOR DEFAULT

   

    public Ovelha(String nome, String voz, double peso) {
		super(nome, voz);
		this.peso = peso;
	}

	// CONSTRUTOR COM PARÂMETROS
	public Ovelha(String nome, String voz) {
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
