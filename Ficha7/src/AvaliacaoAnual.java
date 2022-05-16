public class AvaliacaoAnual extends AvaliacaoSemestral {
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	private double notaTrabalho;

    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================

	public double getNotaTrabalho() {
		return notaTrabalho;
	}

	public void setNotaTrabalho(double notaTrabalho) {
		this.notaTrabalho = notaTrabalho;
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
	public void CalcularNotaFinal() {
		
		super.CalcularNotaFinal();
		
		double ponderacaoNotas = super.getNotaFinal() * 0.7;
		double ponderacaoTrabalho = this.getNotaTrabalho() * 0.3;
		
		this.setNotaFinal(ponderacaoNotas + ponderacaoTrabalho);
	}


    // =======================================================
    // ============== MÉTODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()



    // ----> equals()
}
