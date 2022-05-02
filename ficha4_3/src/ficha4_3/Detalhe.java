package ficha4_3;

import java.util.ArrayList;

public class Detalhe  {
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================
		private Produto produto;
		private double quantidade;
		private double total;
		
		


    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================
		public Produto getProduto() {
			return produto;
		}
		public void setProduto(Produto produto) {
			this.produto = produto;
		}
		public double getQuantidade() {
			return quantidade;
		}
		public void setQuantidade(double quantidade) {
			this.quantidade = quantidade;
		}
		public double getTotal() {
			return total;
		}
		public void setTotal(double total) {
			this.total = total;
		}
		


    // =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================

  
   
    // CONSTRUTOR DEFAULT

   

    // CONSTRUTOR COM PARÂMETROS



    // =======================================================
    // =================== .COMPORTAMENTOS ==================
    // =======================================================

	public void calcularTotal (){
		this.total = (this.quantidade * this.produto.getPreco()) * this.produto.getTaxa();
	}
	


    // =======================================================
    // ============== MÉTODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()


	@Override
	public String toString() {
		return "Detalhe [produto=" + produto + ", quantidade=" + quantidade + ", total=" + total + "]";
	}

    // ----> equals()
}
