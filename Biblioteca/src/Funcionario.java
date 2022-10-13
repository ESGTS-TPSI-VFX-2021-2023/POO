//numero de funcionario.
public class Funcionario extends Pessoa {
	// =======================================================
    // ===================== ATRIBUTOS =======================        
    // =======================================================
	private int numeroFuncionario;
	private String tipoFuncionario;
    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================
	
	public String getTipoFuncionario() {
		return tipoFuncionario;
	}

	public void setTipoFuncionario(String tipoFuncionario) {
		this.tipoFuncionario = tipoFuncionario;
	}

	public int getNumeroFuncionario() {
		return numeroFuncionario;
	}

	public void setNumeroFuncionario(int numeroFuncionario) {
		this.numeroFuncionario = numeroFuncionario;
	}

    // =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================

  
   
    // CONSTRUTOR DEFAULT
	public Funcionario() {
		super();
	
	}

	
   

    // CONSTRUTOR COM PARÂMETROS
	public Funcionario(int numeroFuncionario, String tipoFuncionario) {
		super();
		this.numeroFuncionario = numeroFuncionario;
		this.tipoFuncionario = tipoFuncionario;
	}
	


    // =======================================================
    // =================== .COMPORTAMENTOS ==================
    // =======================================================




    // =======================================================
    // ============== MÉTODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()



    // ----> equals()
}
