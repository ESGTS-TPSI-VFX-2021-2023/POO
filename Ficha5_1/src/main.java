
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Pessoa p1 = new Pessoa("Pedro", "Lisboa", "215 265 235");
		
		System.out.println(p1);
		
		Fornecedor f1 = new Fornecedor();
		
		System.out.println(f1);
		System.out.println(f1.obterSaldo());
	}

}
