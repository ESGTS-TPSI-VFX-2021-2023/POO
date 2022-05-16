public class AvaliacaoSeminario extends AvaliacaoAnual {
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	private boolean frequentouSeminario;

    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================

	public boolean isFrequentouSeminario() {
		return frequentouSeminario;
	}

	public void setFrequentouSeminario(boolean frequentouSeminario) {
		this.frequentouSeminario = frequentouSeminario;
	}

    // =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================

  
   
    // CONSTRUTOR DEFAULT

   

    // CONSTRUTOR COM PARÂMETROS



    // =======================================================
    // =================== .COMPORTAMENTOS ==================
    // =======================================================

	@Override
	public void VerificaAprovacao() {
		super.VerificaAprovacao();
		this.setAprovado(super.isAprovado() && this.isFrequentouSeminario());
	}


    // =======================================================
    // ============== MÉTODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()



    // ----> equals()
}
