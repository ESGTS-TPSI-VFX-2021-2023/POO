
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro c1 = new Carro();
		
		try {
			c1.Avancar(5);
		}
		catch (ArithmeticException ex) {
			// TODO Auto-generated catch block
			System.out.println(ex.getMessage());
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Chegou ao final");
		}
		
	}

}
