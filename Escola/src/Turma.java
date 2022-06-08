import java.util.ArrayList;

public class Turma {
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	private String nomeTurma;
	private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	

    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================

	public String getNomeTurma() {
		return nomeTurma;
	}
	
	public void setNomeTurma(String nomeTurma) {
		this.nomeTurma = nomeTurma;
	}
	
	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}
	
	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}

    // =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================

  
   
    // CONSTRUTOR DEFAULT

   

    // CONSTRUTOR COM PARÂMETROS
	public Turma(String nomeTurma) {
		super();
		this.nomeTurma = nomeTurma;
	}


    // =======================================================
    // =================== .COMPORTAMENTOS ==================
    // =======================================================

	public void AdicionarAluno(Aluno aluno) {
		this.alunos.add(aluno);
	}

	public Aluno ConsultarAluno(String nome) {
		
		for (Aluno aluno : alunos) {
			if (aluno.getNome()==nome){
				
				return aluno;
			}
		}
		return null;
	}
	
    public double CalcularMediaTurma() {
    	
    	double mediaTurma = 0;
    	
    	for (Aluno aluno : alunos) {
    		
    		mediaTurma += aluno.CalcularMedia();	
    			
        }
    	
    	return mediaTurma / alunos.size();
    	
    }

    // =======================================================
    // ============== MÉTODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()



    // ----> equals()
}
