import java.util.Objects;

public class Cartao {
	
// =======================================================
// ===================== ATRIBUTOS =======================
// =======================================================
	
	private String Nome;
	private String Apelido;
	private String Servico;
	private String Cargo;

// =======================================================
// ============ ACESSORES e MODIFICADORES ===============
// =======================================================

	public String getNome() {
		return Nome;
	}


	public void setNome(String nome) {
		Nome = nome;
	}
	
	public String getApelido() {
		return Apelido;
	}


	public void setApelido(String apelido) {
		Apelido = apelido;
	}


	public String getServico() {
		return Servico;
	}


	public void setServico(String servico) {
		Servico = servico;
	}


	public String getCargo() {
		return Cargo;
	}


	public void setCargo(String cargo) {
		Cargo = cargo;
	}

// =======================================================
// =================== CONSTRUTORES =====================
// =======================================================

  
   
    // CONSTRUTOR DEFAULT
	public Cartao() {
		
	}


	// CONSTRUTOR COM PARÂMETROS
	public Cartao(String nome, String apelido, String servico, String cargo) {
		super();
		Nome = nome;
		Apelido = apelido;
		Servico = servico;
		Cargo = cargo;
	}

// =======================================================
// =================== .COMPORTAMENTOS ==================
// =======================================================

	public void alterarDados(String nome, String apelido, String servico, String cargo) {
		
		this.setNome(nome);
		this.setApelido(apelido);
		this.setServico(servico);
		this.setCargo(cargo);
		
	}
	
	public String mostrarNomeCompleto() {
		return this.getApelido() + ", " + this.getNome();
	}


// =======================================================
// ============== MÉTODOS COMPLEMENTARES ==============
// =======================================================

// ----> toString()
	@Override
	public String toString() {
		return "Cartao [Nome=" + Nome + ", Apelido=" + Apelido + ", Servico=" + Servico + ", Cargo=" + Cargo + "]";
	}


	


// ----> equals()
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cartao other = (Cartao) obj;
		return Objects.equals(Apelido, other.Apelido) && Objects.equals(Cargo, other.Cargo)
				&& Objects.equals(Nome, other.Nome) && Objects.equals(Servico, other.Servico);
	}
	

}
