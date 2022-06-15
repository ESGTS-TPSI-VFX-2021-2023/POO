
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Zoo z1 = new Zoo();
		
		Animal a1 = new Cao("AAA", "Ladrar");
		Animal a2 = new Leao("BBB", "brrr");
		Animal a3 = new Crocodilo("CCC", "crcrcr");
		Animal a4 = new Ovelha("BBB", "mmmm");
		
		z1.AdicionarAnimal(a1);
		z1.AdicionarAnimal(a2);
		z1.AdicionarAnimal(a3);
		z1.AdicionarAnimal(a4);
		
		
	}

}
