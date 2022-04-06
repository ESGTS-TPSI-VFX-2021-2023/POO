
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lampada l1 = new Lampada();
		//System.out.println(l1.getCor());
		
		Lampada l2 = new Lampada("Led", "Azul", true);
		//System.out.println(l2.getCor());
		
		Semaforo s1 = new Semaforo();
		System.out.println(s1.getEstadoCor());
		s1.MudarCor();
		System.out.println(s1.getEstadoCor());
		s1.MudarCor();
		System.out.println(s1.getEstadoCor());
		s1.MudarCor();
		System.out.println(s1.getEstadoCor());
		
		
	}

}
