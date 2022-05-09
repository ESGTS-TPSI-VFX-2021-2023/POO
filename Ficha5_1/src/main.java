
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Pessoa p1 = new Pessoa("Pedro", "Lisboa", "215 265 235");
		
		//System.out.println(p1);
		
		Fornecedor f1 = new Fornecedor();
		
		//System.out.println(f1);
		//System.out.println(f1.obterSaldo());
		
		Empregado e1 = new Empregado("Manuel", "Porto", "225 623 526", 10, 703, 0.11);
		System.out.println(e1.calcularSalario());
		
		
		Administrador a1 = new Administrador();
		a1.setNome("Manuela");
		a1.setSalarioBase(703);
		a1.setImposto(0.11);
		a1.setAjudaDeCusto(200);
		System.out.println(a1.calcularSalario());
		
		Operario o1 = new Operario();
		o1.setNome("Manuela");
		o1.setSalarioBase(703);
		o1.setImposto(0.11);
		o1.setValorProducao(1000);
		o1.setComissao(0.10);
		System.out.println(o1.calcularSalario());
		
		Vendedor v1 = new Vendedor();
		v1.setNome("António");
		v1.setSalarioBase(703);
		v1.setImposto(0.11);
		v1.setValorVendas(1000);
		v1.setComissao(0.30);
		System.out.println(v1.calcularSalario());
	}

}
