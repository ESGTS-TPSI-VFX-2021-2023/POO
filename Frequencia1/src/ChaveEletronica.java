public abstract class ChaveEletronica {
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	private boolean trancado;

    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================

	public boolean isTrancado() {
		return trancado;
	}

	public void setTrancado(boolean trancado) {
		this.trancado = trancado;
	}

    // =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================

  
   
    // CONSTRUTOR DEFAULT
	public ChaveEletronica() {
		
	}
   

    // CONSTRUTOR COM PARÂMETROS
	public ChaveEletronica(boolean trancado) {
		super();
		this.trancado = trancado;
	}


    // =======================================================
    // =================== .COMPORTAMENTOS ==================
    // =======================================================

	public String Trancar() {
		this.setTrancado(true);
		
		return "TRANCADO";
	}
	
	public String Destrancar() {
		this.setTrancado(false);
		
		return "DESTRANCADO";
	}


    // =======================================================
    // ============== MÉTODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()



    // ----> equals()
}
