package ficha4_3;

public class Empresa {

	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	private String nome;
	private int contacto;
	private String morada;
	private String contribuinte;
	

    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getContacto() {
		return contacto;
	}
	public void setContacto(int contacto) {
		this.contacto = contacto;
	}
	public String getMorada() {
		return morada;
	}
	public void setMorada(String morada) {
		this.morada = morada;
	}
	public String getContribuinte() {
		return contribuinte;
	}
	public void setContribuinte(String contribuinte) {
		this.contribuinte = contribuinte;
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


	@Override
	public String toString() {
		return "Empresa [nome=" + nome + ", contacto=" + contacto + ", morada=" + morada + ", contribuinte="
				+ contribuinte + "]";
	}

    // ----> equals()
	
}
