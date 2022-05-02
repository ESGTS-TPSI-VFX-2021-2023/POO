package ficha4_3;

public class main_fatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Documento doc1 = new Documento();
		Empresa emp1 = new Empresa();
	    emp1.setNome("Frescos");
	    emp1.setMorada("Rua das Amoreiras");
	    emp1.setContribuinte("932436939");
	    emp1.setContacto(236811567);
		Cliente cli1 = new Cliente();
		cli1.setNome("Manuel");
		cli1.setMorada("Rua Speed Silva");
		cli1.setContribuinte(210756298);
		cli1.setCodigoCliente(7860);
		Detalhe det1 = new Detalhe();
		Produto prod1= new Produto();
		
		doc1.setEmpresa(emp1);
		doc1.setCliente(cli1);
		det1.setProduto(prod1);
		doc1.adicionarDetalhe(det1);
		
		System.out.println(doc1);
	}

}
