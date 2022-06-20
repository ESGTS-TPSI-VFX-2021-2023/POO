public abstract class Animal {
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	private String nome;
	private String voz;
	

    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getVoz() {
		return voz;
	}


	public void setVoz(String voz) {
		this.voz = voz;
	}

    // =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================

  
   
    // CONSTRUTOR DEFAULT

   

    // CONSTRUTOR COM PARÂMETROS
	public Animal(String nome, String voz) {
		super();
		this.nome = nome;
		this.voz = voz;
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
