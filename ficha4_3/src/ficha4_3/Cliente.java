package ficha4_3;

public class Cliente {

	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================
	
	private String nome;
	private int contribuinte;
	private String morada;
	private int codigoCliente;

    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getContribuinte() {
		return contribuinte;
	}
	public void setContribuinte(int contribuinte) {
		this.contribuinte = contribuinte;
	}
	public String getMorada() {
		return morada;
	}
	
	public void setMorada(String morada) {
		this.morada = morada;
	}
	public int getCodigoCliente() {
		return codigoCliente;
	}
	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
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
		return "Cliente [nome=" + nome + ", contribuinte=" + contribuinte + ", morada=" + morada + ", codigoCliente="
				+ codigoCliente + "]";
	}

    // ----> equals()
	
}
