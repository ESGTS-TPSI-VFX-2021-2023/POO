public class Administrador extends Empregado {
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	private double ajudaDeCusto;

    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}

    // =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================

  
   
    // CONSTRUTOR DEFAULT

   

    // CONSTRUTOR COM PAR�METROS



    // =======================================================
    // =================== .COMPORTAMENTOS ==================
    // =======================================================
	@Override
	public double calcularSalario() {
		return super.calcularSalario() + this.getAjudaDeCusto();
	}


    // =======================================================
    // ============== M�TODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()



    // ----> equals()
}
