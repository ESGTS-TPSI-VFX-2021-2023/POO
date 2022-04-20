import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ponto p1 = new Ponto(0,1);
		Ponto p2 = new Ponto(0,5);
		//ArrayList<Ponto> pontos = new ArrayList<Ponto>();
		//pontos.add(p1);
		//pontos.add(p2);
		
		Desenho d1 = new Desenho();
		d1.AdicionarPonto(p1);
		d1.AdicionarPonto(p2);
		
		Ponto p3 = new Ponto(4,1);
		d1.AdicionarPonto(p3);
		
		System.out.println(d1.MaisEsquerda());
		System.out.println(d1.MaisDireita());

	}

}
