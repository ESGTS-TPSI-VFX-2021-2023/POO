
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Ecra ecra1 = new Ecra();
		
		// LINHA 1
		Linha linha1 = new Linha();
		Pixel pixel1 = new Pixel(true);
		Pixel pixel2 = new Pixel(false);
		linha1.AdicionarPixel(pixel1);
		linha1.AdicionarPixel(pixel2);
		ecra1.AdicionarLinha(linha1);
		
		// LINHA 2
		Linha linha2 = new Linha();
		Pixel pixel21 = new Pixel(true);
		Pixel pixel22 = new Pixel(false);
		linha2.AdicionarPixel(pixel21);
		linha2.AdicionarPixel(pixel22);
		ecra1.AdicionarLinha(linha2);
		
		System.out.println(ecra1);
		
	}

}
