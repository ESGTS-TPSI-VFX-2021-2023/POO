import java.util.ArrayList;

public class Escola {
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	private String nome;
	private String contato;
	private String email;
	private String morada;
	
	private ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMorada() {
		return morada;
	}

	public void setMorada(String morada) {
		this.morada = morada;
	}

    // =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================

  
   
    // CONSTRUTOR DEFAULT

   

    // CONSTRUTOR COM PARÂMETROS



    // =======================================================
    // =================== .COMPORTAMENTOS ==================
    // =======================================================

	public void AdicionarPessoa(Pessoa pessoaAdd) throws Exception {
		
		for (Pessoa pessoa : pessoas) {
			if (pessoa.getCC() == pessoaAdd.getCC()) {
				throw new Exception("Já existe uma pessoa com este numero de CC na escola");
			}
		}
		
		this.pessoas.add(pessoaAdd);
	}
	
	public int ContarPessoas() {
		return this.pessoas.size();
	}
	
	public int ContarAlunos() {
		
		int conta = 0;
		
		for (Pessoa pessoa : pessoas) {
			if (pessoa instanceof Aluno) {
				conta++;
			}
		}
		
		return conta;
		
	}
	
	public double ValorPropinas() {
		
		double valor = 0;
		
		for (Pessoa pessoa : pessoas) {
			
			if (pessoa instanceof Aluno) {
				valor += ((Aluno) pessoa).getValorPropina();
			}
			
		}
		
		return valor;
		
	}
	
	public double ValorOrdenados() {
			
		double valor = 0;
		
		for (Pessoa pessoa : pessoas) {
			
			if (pessoa instanceof Docente) {
				valor += ((Docente)pessoa).getValorOrdenado();
			}
			
			if (pessoa instanceof Auxiliar) {
				valor += ((Auxiliar)pessoa).getValorOrdenado();
			}
			
		}
		
		return valor;
		
	}
	
	public double ValorFinal() {
		return this.ValorPropinas() - this.ValorOrdenados();
	}
	

    // =======================================================
    // ============== MÉTODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()



    // ----> equals()
}
