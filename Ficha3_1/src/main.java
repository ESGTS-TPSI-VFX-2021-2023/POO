import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		
		// Criar um cart�o vazio
		Cartao c1 = new Cartao();
		System.out.println(c1);
		
		// Criar um cart�o preenchido
		Cartao c2 = new Cartao("Nome", "Servi�o", "Cargo");
		System.out.println(c2.toString());
		c2.setNome("Jo�o");
		c2.setServico("Teste");
		c2.setCargo("Aluno");
		//System.out.println(c2.getNome());
		System.out.println(c2.toString());
		
		c2.alterarDados("aaa", "bbb", "ccc");
		System.out.println(c2.toString());
		
		
		
		Cartao c1 = new Cartao();
		c1.setNome("Pedro");
		//c1.setApelido("Silva");
		c1.setServico("Servi�o");
		c1.setCargo("Cargo");
		System.out.println(c1.getNome());
		System.out.println(c1);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual o cargo?");
		//c1.setCargo(sc.next());
		System.out.println(c1);
		
		//Cartao c2 = new Cartao(sc.next(), sc.next(), sc.next(), sc.next());
		//c2.alterarDados("nome 21", "apelido 21", "servi�o 21", "Cargo 21");
		//System.out.println(c2);
		*/
		
		//Cartao c2 = c1;
		
		//c2.setNome("David");
		
		//System.out.println(c2.toString());
		//System.out.println(c1.toString());
		//System.out.println(c2);
		
		//c1.setNome("aaaa");
		//c2.setNome("gfd");
		
		Cartao c3 = new Cartao("Jo�o", "Pedro", "aaaa", "bbbb");
		Cartao c4 = new Cartao("Jo�o", "Pedro", "aaaa", "bbbb");
		
		System.out.println(c3.equals(c4));
		
		System.out.println(c3.mostrarNomeCompleto());
		
		
	}

}
