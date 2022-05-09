public class Operario extends Empregado {
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	private double valorProducao;
	private double comissao;
	
    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================

	public double getValorProducao() {
		return valorProducao;
	}
	
	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}
	
	public double getComissao() {
		return comissao;
	}
	
	public void setComissao(double comissao) {
		this.comissao = comissao;
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
		return super.calcularSalario() + (this.getValorProducao() * this.getComissao());
	}


    // =======================================================
    // ============== M�TODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()



    // ----> equals()
}
