public class Docente extends Pessoa {
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	private int NIB;
	private double valorOrdenado;
	

    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================

	public int getNIB() {
		return NIB;
	}
	
	public void setNIB(int nIB) {
		NIB = nIB;
	}
	
	public double getValorOrdenado() {
		return valorOrdenado;
	}
	
	public void setValorOrdenado(double valorOrdenado) throws Exception {
		
		if (valorOrdenado <= 0) {
			throw new Exception("O ordernado não pode ser igual ou inferior a zero");  
		}
		
		this.valorOrdenado = valorOrdenado;
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
