public class ChaveEletronicaVIP extends ChaveEletronicaSimples {
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	private boolean ChaveTrancada;

    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================

	public boolean isChaveTrancada() {
		return ChaveTrancada;
	}


	public void setChaveTrancada(boolean chaveTrancada) {
		ChaveTrancada = chaveTrancada;
	}

    // =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================

  
   
    // CONSTRUTOR DEFAULT
	public ChaveEletronicaVIP() {
		super();
	}
   

    // CONSTRUTOR COM PARÂMETROS
	public ChaveEletronicaVIP(boolean chaveTrancada) {
		super();
		ChaveTrancada = chaveTrancada;
	}


    // =======================================================
    // =================== .COMPORTAMENTOS ==================
    // =======================================================

	public String TrancarChave() {
		this.setChaveTrancada(true);
		
		return "CHAVE TRANCADA";
	}
	
	@Override
	public String Apitar() {
		super.Apitar();
		this.setChaveTrancada(false);
		
		return "APITO E CARRO DESTRANCADO";
	}
	

    // =======================================================
    // ============== MÉTODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()



    // ----> equals()
}
