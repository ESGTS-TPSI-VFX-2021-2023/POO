public class Jogador {
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	private String nome;
	private char carater;

    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public char getCarater() {
		return carater;
	}
	
	public void setCarater(char carater) {
		this.carater = carater;
	}

    // =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================

  
   
    // CONSTRUTOR DEFAULT

   

    // CONSTRUTOR COM PARÂMETROS
	public Jogador(String nome, char carater) {
		super();
		this.nome = nome;
		this.carater = carater;
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
