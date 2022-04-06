public class Semaforo {
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	private Lampada[] lampadas;
	private String EstadoCor; 

    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================

	public Lampada[] getLampadas() {
		return lampadas;
	}


	public void setLampadas(Lampada[] lampadas) {
		this.lampadas = lampadas;
	}
	
	public String getEstadoCor() {
		
		if (this.lampadas[0].isEstado()) {
			this.EstadoCor = "Vermelho";
		} else if (this.lampadas[1].isEstado()) {
			this.EstadoCor = "Amarelo";
		} else if (this.lampadas[2].isEstado()) {
			this.EstadoCor = "Verde";
		}
		
		return this.EstadoCor;
		
	}

    // =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================

  
   
    // CONSTRUTOR DEFAULT
	public Semaforo() {
		this.lampadas = new Lampada[3];
		this.lampadas[0] = new Lampada("Vermelho", "Normal", true);
		this.lampadas[1] = new Lampada("Amarelo", "Normal", false);
		this.lampadas[2] = new Lampada("Verde", "Normal", false);
	}
   

    // CONSTRUTOR COM PARÂMETROS



    // =======================================================
    // =================== .COMPORTAMENTOS ==================
    // =======================================================

	public void MudarCor() {
	
		if (this.getEstadoCor() == "Vermelho") {
			this.lampadas[0].setEstado(false);
			this.lampadas[1].setEstado(false);
			this.lampadas[2].setEstado(true);
		} else if (this.getEstadoCor() == "Verde") {
			this.lampadas[0].setEstado(false);
			this.lampadas[1].setEstado(true);
			this.lampadas[2].setEstado(false);
		} else if (this.getEstadoCor() == "Amarelo") {
			this.lampadas[0].setEstado(true);
			this.lampadas[1].setEstado(false);
			this.lampadas[2].setEstado(false);
		}
		
	}

    // =======================================================
    // ============== MÉTODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()



    // ----> equals()
}
