package ficha4_3;

public class Produto {
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================
		private String nome;
		private double preco;
		private double taxa;
	    


    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public double getPreco() {
			return preco;
		}
		public void setPreco(double preco) {
			this.preco = preco;
		}
		public double getTaxa() {
			return taxa;
		}
		public void setTaxa(double taxa) {
			this.taxa = taxa;
		}
		

    // =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================

  
   
    // CONSTRUTOR DEFAULT

   

    // CONSTRUTOR COM PARÂMETROS



    // =======================================================
    // =================== .COMPORTAMENTOS ==================
    // =======================================================




    // =======================================================
    // ============== MÉTODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()

		@Override
		public String toString() {
			return "Produto [nome=" + nome + ", preco=" + preco + ", taxa=" + taxa + "]";
		}


    // ----> equals()
}
