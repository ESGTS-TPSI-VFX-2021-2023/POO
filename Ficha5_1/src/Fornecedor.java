public class Fornecedor extends Pessoa {
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	private double valorCredito;
	private double valorDivida;
	
    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================

	public double getValorCredito() {
		return valorCredito;
	}
	
	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}
	
	public double getValorDivida() {
		return valorDivida;
	}
	
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}

    // =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================

  
   
    // CONSTRUTOR DEFAULT
	public Fornecedor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
    public Fornecedor(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
		// TODO Auto-generated constructor stub
	}

	// CONSTRUTOR COM PAR�METROS
	public Fornecedor(double valorCredito, double valorDivida) {
		super();
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}


    public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
		super(nome, endereco, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}

	// =======================================================
    // =================== .COMPORTAMENTOS ==================
    // =======================================================

	public double obterSaldo() {
		return this.getValorCredito() - this.getValorDivida();
	}


    // =======================================================
    // ============== M�TODOS COMPLEMENTARES ==============
    // =======================================================

    

	// ----> toString()
	@Override
	public String toString() {
		return "Fornecedor [valorCredito=" + valorCredito + ", valorDivida=" + valorDivida + ", Nome=" + getNome()
				+ ", Endere�o=" + getEndereco() + ", Telefone=" + getTelefone() + "]";
	}

    // ----> equals()
}
