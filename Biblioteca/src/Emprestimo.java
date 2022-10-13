
public class Emprestimo {
	// =======================================================
    // ===================== ATRIBUTOS =======================		numero de leitor, numero de funcionario.		
    // =======================================================
	
	private Leitor leitor;
	private Funcionario funcionario;
	private Documento documento;
	private int prazo;


    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================
	public Leitor getLeitor() {
		return leitor;
	}
	public void setLeitor(Leitor leitor) {
		this.leitor = leitor;
	}
	public int getPrazo() {
		return prazo;
	}
	public void setPrazo(int prazo) {
		this.prazo = prazo;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public Documento getDocumento() {
		return documento;
	}
	public void setDocumento(Documento documento) {
		this.documento = documento;
	}
	


    // =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================

  
   
    // CONSTRUTOR DEFAULT
	public Emprestimo() {
		super();
	}
	
   

    // CONSTRUTOR COM PARÂMETROS
	public Emprestimo(Leitor leitor, Funcionario funcionario, Documento documento, int prazo) {
		super();
		this.leitor = leitor;
		this.funcionario = funcionario;
		this.documento = documento;
		this.prazo = prazo;
	}
	
	


    // =======================================================
    // =================== .COMPORTAMENTOS ==================
    // =======================================================
	
	
	

    // =======================================================
    // ============== MÉTODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()
	@Override
	public String toString() {
		return "Emprestimo [leitor=" + getLeitor() + ", funcionario=" + getFuncionario() + ", documento=" + getDocumento() + ", prazo="
				+ prazo + "]";
	}


    // ----> equals()
}




//public String toString() {
	
	//String resposta = "";
	//resposta += this.leitor.getNumeroLeitor() + "\n";
	//resposta += this.leitor.getNome() +"\n";
	//resposta += this.funcionario.getNumeroFuncionario() +"\n";
	//resposta += this.documento.getTitulo() +"\n";
	//resposta += this.documento.getAutor() +"\n";
	//resposta += this.documento.getSuporte() + "\n";
	
	//return resposta;
//}