import java.util.ArrayList;

public class Aluno {
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	private String nome;
	private String numeroAluno;
	private ArrayList<Nota> notas = new ArrayList<Nota>();
	

    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNumeroAluno() {
		return numeroAluno;
	}
	
	public void setNumeroAluno(String numeroAluno) {
		this.numeroAluno = numeroAluno;
	}
	
	public ArrayList<Nota> getNotas() {
		return notas;
	}
	
	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}

    // =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================

	
   
    // CONSTRUTOR DEFAULT

   

    // CONSTRUTOR COM PARÂMETROS
	public Aluno(String nome, String numeroAluno) {
		super();
		this.nome = nome;
		this.numeroAluno = numeroAluno;
	}


    // =======================================================
    // =================== .COMPORTAMENTOS ==================
    // =======================================================

	public void AdicionarNota(Nota nota) {
		this.notas.add(nota);
	}

	public double CalcularMedia() {
		
		double total = 0;
		
		for (Nota nota : notas) {
			total += nota.getValor();
		}
		
		return total / notas.size();
		
	}


    // =======================================================
    // ============== MÉTODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()
	@Override
	public String toString() {
		
		String resultado;
		
		resultado = "Nome: " + this.nome;
		resultado += "\nNúmero: " + this.numeroAluno;
		
		for (Nota nota : notas) {
			resultado += "\n" + nota;
		}
		
		resultado += "\nMédia: " + this.CalcularMedia();
		
		return resultado;
	}

    // ----> equals()
}
