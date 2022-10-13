
public class Leitor extends Pessoa {
	// =======================================================
    // ===================== ATRIBUTOS =======================        //nome,morada,contacto telefonicp,email,tipo, numero de leitor.
    // =======================================================
		private int numeroLeitor;
		private int validade;
 
		// =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================
		public int getNumeroLeitor() {
			return numeroLeitor;
		}

		public void setNumeroLeitor(int numeroLeitor) {
			this.numeroLeitor = numeroLeitor;
		}
		   public int getValidade() {
				return validade;
			}

			public void setValidade(int validade) {
				this.validade = validade;
			}


    // =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================

  
   
    // CONSTRUTOR DEFAULT
		public Leitor() {
			super();
		
		}

	// CONSTRUTOR COM PARÂMETROS
		public Leitor(String nome, String endereco, String telefone,int numeroLeitor) {
			super(nome, endereco, telefone);
			this.numeroLeitor = numeroLeitor;
		}

		@Override
		public String toString() {
			return super.toString() + "Leitor [numeroLeitor = " + numeroLeitor + ", validade = " + validade + "] ";
		}

		
		
		


    // =======================================================
    // =================== .COMPORTAMENTOS ==================
    // =======================================================




    // =======================================================
    // ============== MÉTODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()
	


    // ----> equals()
}
