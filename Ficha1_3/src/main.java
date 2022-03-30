
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Quadrado q1 = new Quadrado();
		q1.setLado(10);
		q1.calcularArea();
		q1.calcularPerimetro();
		//System.out.println(q1.getArea());
		//System.out.println(q1.getPerimetro());
		
		Quadrado q2 = new Quadrado();
		q2.setLado(15);
		
		Circulo c1 = new Circulo();
		c1.setRaio(10);
		c1.CalcularDiametro();
		c1.CalcularPerimetro();
		c1.CalcularArea();
		
		System.out.println(c1.getDiametro());
		System.out.println(c1.getPerimetro());
		System.out.println(c1.getArea());
		
	}

}
