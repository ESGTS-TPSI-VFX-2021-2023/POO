package ficha4_3;

import java.util.ArrayList;

public class Documento {
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================
       private ArrayList<Detalhe> Detalhes = new ArrayList<Detalhe>();
       private double totalDocumento;
	
       private Cliente cliente;
       private Empresa empresa;


    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================
	
    public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public ArrayList<Detalhe> getDetalhes() {
		return Detalhes;
	}
	public void setDetalhes(ArrayList<Detalhe> detalhes) {
		Detalhes = detalhes;
	}
	public double getTotalDocumento() {
		return totalDocumento;
	}
	public void setTotalDocumento(double totalDocumento) {
		this.totalDocumento = totalDocumento;
	}


    // =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================

  
   
    // CONSTRUTOR DEFAULT

   

    // CONSTRUTOR COM PARÂMETROS
	


    // =======================================================
    // =================== .COMPORTAMENTOS ==================
    // =======================================================

	public void calcularTotal () {
		for (Detalhe detalhe : Detalhes) {
			this.totalDocumento = this.totalDocumento + detalhe.getTotal();
		}
	}
	
	public void adicionarDetalhe (Detalhe detalhe) {
		this.Detalhes.add(detalhe);
	}
	


    // =======================================================
    // ============== MÉTODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()

	@Override
	public String toString() {
		
		String resposta = "";
		resposta += this.empresa.getNome() + "\n";
		resposta += this.empresa.getMorada() + "\n";
		resposta += this.empresa.getContribuinte() + "\n";
		resposta += this.empresa.getContacto() + "\n";
		resposta += this.cliente.getNome() + "\n";
		resposta += this.cliente.getMorada() + "\n";
		resposta += this.cliente.getContribuinte() + "\n";
		resposta += this.cliente.getCodigoCliente() + "\n";
   		
		return resposta;
	}


    // ----> equals()
}
