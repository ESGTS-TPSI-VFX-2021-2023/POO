public class Lampada {
// =======================================================
// ===================== ATRIBUTOS =======================
// =======================================================

	private String Tipo; // Led, Normal
	private String Cor;
	private boolean Estado;

// =======================================================
// ============ ACESSORES e MODIFICADORES ===============
// =======================================================

	public String getTipo() {
		return Tipo;
	}
	
	private void setTipo(String tipo) {
		Tipo = tipo;
	}
	
	public String getCor() {
		return Cor;
	}
	
	public void setCor(String cor) {
		Cor = cor;
	}
	
	public boolean isEstado() {
		return Estado;
	}
	
	public void setEstado(boolean estado) {
		Estado = estado;
	}

// =======================================================
// =================== CONSTRUTORES =====================
// =======================================================

  
   
    // CONSTRUTOR DEFAULT
	public Lampada() {
		this.setCor("Branca");
		this.setEstado(false);
		this.setTipo("Normal");
	}

    // CONSTRUTOR COM PARÂMETROS
	public Lampada(String tipo, String cor, boolean estado) {
		super();
		this.setTipo(tipo);
		this.setCor(cor);
		this.setEstado(estado);
	}


// =======================================================
// =================== .COMPORTAMENTOS ==================
// =======================================================

	public void ligar() {
		this.setEstado(true);
	}

	public void desligar() {
		this.setEstado(false);
	}

// =======================================================
// ============== MÉTODOS COMPLEMENTARES ==============
// =======================================================

// ----> toString()



// ----> equals()
}
