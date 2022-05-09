public class Vendedor extends Empregado {
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	private double valorVendas;
	private double comissao;
	

    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================

	public double getValorVendas() {
		return valorVendas;
	}
	
	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
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
		return super.calcularSalario() + (this.getValorVendas() * this.getComissao());
	}


    // =======================================================
    // ============== M�TODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()



    // ----> equals()
}
