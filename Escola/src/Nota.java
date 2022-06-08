public class Nota {
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	private double valor;
	private String disciplina;

    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================

	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public String getDisciplina() {
		return disciplina;
	}
	
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	

    // =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================

  
   
    // CONSTRUTOR DEFAULT

   

    // CONSTRUTOR COM PARÂMETROS
	public Nota(double valor, String disciplina) {
		super();
		this.valor = valor;
		this.disciplina = disciplina;
	}

	


    // =======================================================
    // =================== .COMPORTAMENTOS ==================
    // =======================================================




    // =======================================================
    // ============== MÉTODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()
	@Override
	public String toString() {
		return "Valor=" + valor + " | Disciplina=" + disciplina;
	}


    // ----> equals()
}
