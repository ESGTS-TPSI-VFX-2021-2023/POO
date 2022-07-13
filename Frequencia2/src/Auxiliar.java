public class Auxiliar extends Pessoa {
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	private String funcao;
	private double valorOrdenado;
	
	

    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================

	public String getFuncao() {
		return funcao;
	}
	
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	public double getValorOrdenado() {
		return valorOrdenado;
	}
	
	public void setValorOrdenado(double valorOrdenado) throws Exception {
		
		if (valorOrdenado <= 0) {
			throw new Exception("O ordernado n�o pode ser igual ou inferior a zero");  
		}
			
		this.valorOrdenado = valorOrdenado;
	}

    // =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================

  
   
    // CONSTRUTOR DEFAULT

   

    // CONSTRUTOR COM PAR�METROS



    // =======================================================
    // =================== .COMPORTAMENTOS ==================
    // =======================================================




    // =======================================================
    // ============== M�TODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()



    // ----> equals()
}
