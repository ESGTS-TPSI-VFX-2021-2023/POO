import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double lado1;
		double lado2;
		double somaAreas;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o lado 1?");
		lado1 = sc.nextDouble();
		
		System.out.println("Qual o lado 2?");
		lado2 = sc.nextDouble();
		
		somaAreas = (lado1 * lado1) + (lado2 * lado2);
		
		System.out.println("somaAreas = " + somaAreas);
		
		
	}

}
