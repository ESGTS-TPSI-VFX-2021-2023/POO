public class Aluno extends Pessoa {
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	private int numeroAluno;
	private double valorPropina;
	

    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================

	public int getNumeroAluno() {
		return numeroAluno;
	}
	
	public void setNumeroAluno(int numeroAluno) {
		this.numeroAluno = numeroAluno;
	}
	
	public double getValorPropina() {
		return valorPropina;
	}
	
	public void setValorPropina(double valorPropina) throws Exception {
		
		if (valorPropina <= 0) {
			throw new Exception("A propina não pode ser igual ou inferior a zero");  
		}
		
		this.valorPropina = valorPropina;
	}

    // =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================

  
   
    // CONSTRUTOR DEFAULT

   

    // CONSTRUTOR COM PARÂMETROS



    // =======================================================
    // =================== .COMPORTAMENTOS ==================
    // =======================================================




    // =======================================================
    // ============== MÉTODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()



    // ----> equals()
}
