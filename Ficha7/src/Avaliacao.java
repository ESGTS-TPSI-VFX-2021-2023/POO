import java.util.ArrayList;

public abstract class Avaliacao {
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	private ArrayList<Teste> notas = new ArrayList<Teste>();
	private boolean aprovado;
	private double notaFinal;
	private String indiceAproveitamento;

    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================

	public ArrayList<Teste> getNotas() {
		return notas;
	}
	
	public void setNotas(ArrayList<Teste> notas) {
		this.notas = notas;
	}
	
	public boolean isAprovado() {
		return aprovado;
	}
	
	protected void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}
	
	public double getNotaFinal() {
		return notaFinal;
	}

	protected void setNotaFinal(double notaFinal) {
		this.notaFinal = notaFinal;
	}
	
	public String getIndiceAproveitamento() {
		return indiceAproveitamento;
	}
	
	private void setIndiceAproveitamento(String indiceAproveitamento) {
		this.indiceAproveitamento = indiceAproveitamento;
	}

    // =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================

  
   
    // CONSTRUTOR DEFAULT

   

    // CONSTRUTOR COM PARÂMETROS



    // =======================================================
    // =================== .COMPORTAMENTOS ==================
    // =======================================================

	public void AdicionarNota(Teste teste) {
		this.notas.add(teste);
	}
	
	public abstract void CalcularNotaFinal();
	
	public void VerificaAprovacao() {
		this.setAprovado(this.getNotaFinal() >= 9.5);
	}

    // =======================================================
    // ============== MÉTODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()
	@Override
	public String toString() {
		return "Avaliacao [notas=" + notas + ", aprovado=" + aprovado + ", notaFinal=" + notaFinal
				+ ", indiceAproveitamento=" + indiceAproveitamento + "]";
	}


    // ----> equals()
}
