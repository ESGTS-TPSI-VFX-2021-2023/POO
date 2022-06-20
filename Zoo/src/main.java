
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Zoo z1 = new Zoo();
		
		Animal a1 = new Cao("AAA", "Ladrar", "Rafeiro");
		Animal a2 = new Leao("BBB", "brrr", "Asia");
		Animal a3 = new Crocodilo("CCC", "crcrcr");
		Animal a4 = new Ovelha("BBB", "mmmm", 10);
		
		z1.AdicionarAnimal(a1);
		z1.AdicionarAnimal(a2);
		z1.AdicionarAnimal(a3);
		z1.AdicionarAnimal(a4);
		
		System.out.println(z1.ListarAnimais());
		System.out.println(z1.ContarAnimais());
		System.out.println(z1.ContarAnimaisDomesticos());
		System.out.println(z1.ContarCaes());
		System.out.println(z1.MostrarNome(1));
		System.out.println(z1.OuvirVoz(2));
		System.out.println(z1.MostrarRaca(0));
		System.out.println(z1.ContaDomesticosSelvagens());
		System.out.println(z1.ContaAnimaisAsiaAfrica());
		System.out.println(z1.PesoTotalOvelhas());
		
		
	}

}
