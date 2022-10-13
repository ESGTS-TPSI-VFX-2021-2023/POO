import java.util.ArrayList;

public class Organizacao {
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================
	private ArrayList<Leitor> leitores = new ArrayList<Leitor>();
	private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
	private ArrayList<Documento> documentos = new ArrayList<Documento>();
	private ArrayList<Emprestimo> emprestimos = new ArrayList<Emprestimo>();
	


    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================
	public ArrayList<Leitor> getLeitores() {
		return leitores;
	}
	
	public void setLeitores(ArrayList<Leitor> leitores) {
		leitores = leitores;
	}
	public ArrayList<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
		funcionarios = funcionarios;
	}
	public ArrayList<Documento> getDocumentos() {
		return documentos;
	}
	public void setDocumentos(ArrayList<Documento> documentos) {
		documentos = documentos;
	}


    // =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================

  
   
    // CONSTRUTOR DEFAULT

   

    // CONSTRUTOR COM PARÂMETROS



    // =======================================================
    // =================== .COMPORTAMENTOS ==================
    // =======================================================
	
	

	public void AdicionarLeitor(Leitor leitor) {
		
		this.leitores.add(leitor);
		
	}
	
	public String ListarLeitores() {
		String resultado = "";
		
		for (Leitor leitor : leitores) {
			resultado += "Nome: " + leitor.getNome() + " | Endereço: " + leitor.getEndereco() + "\n" + " | Telefone: " + leitor.getTelefone() + "\n" + 
			" | NumeroLeitor: " + leitor.getTelefone() + "\n" + " | Validade: " + leitor.getValidade() + "\n" ;
		}
		
		return resultado;
		
	}
	
	public void AdicionarFuncionario(Funcionario funcionario) {
		
		
		this.funcionarios.add(funcionario);
		
	}
	
	public void AdicionarDocumento(Documento documento) {
		
		this.documentos.add(documento);
		
	}


    // =======================================================
    // ============== MÉTODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()
	@Override
	public String toString() {
		return "Organizacao [leitores=" + leitores + ", funcionarios=" + funcionarios + ", documentos=" + documentos
				+ ", emprestimos=" + emprestimos + "]";
	}


    // ----> equals()
}
