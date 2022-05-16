public class AvaliacaoSemestral extends Avaliacao {
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	private double comportamento;
	
    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================

	public double getComportamento() {
		return comportamento;
	}

	public void setComportamento(double comportamento) {
		this.comportamento = comportamento;
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
		// TODO Auto-generated method stub
		
		double soma = 0;
		
		for (Teste teste : this.getNotas()) {
			soma += teste.getNota();
		}
		
		double ponderacaoTestes = (soma / this.getNotas().size()) * 0.8;
		double ponderacaoComportamento = this.getComportamento() * 0.2;
		
		this.setNotaFinal(ponderacaoTestes + ponderacaoComportamento);
		
	}

    // =======================================================
    // ============== MÉTODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()
	@Override
	public String toString() {
		
		return super.toString() + " AvaliacaoSemestral [comportamento=" + comportamento + "]";
	}


    // ----> equals()
}
