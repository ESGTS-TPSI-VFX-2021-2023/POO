
public abstract class Pessoa {
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================
	 private String nome;
	 private String endereco;
	 private String telefone;
	

    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================
	 public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getEndereco() {
			return endereco;
		}
		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}
		public String getTelefone() {
			return telefone;
		}
		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
		

    // =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================

  
   
    // CONSTRUTOR DEFAULT
		public Pessoa() {
			
		} 
   

    // CONSTRUTOR COM PAR�METROS
		public Pessoa(String nome, String endereco, String telefone) {
			super();
			this.nome = nome;
			this.endereco = endereco;
			this.telefone = telefone;
		}
		
		




    // =======================================================
    // =================== .COMPORTAMENTOS ==================
    // =======================================================




    // =======================================================
    // ============== M�TODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()
		@Override
		public String toString() {
			return "Pessoa [nome = " + nome + ", endere�o = " + endereco + ", telefone = " + telefone + "] ";
		}


    // ----> equals()
}
