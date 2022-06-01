import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MostrarMenu();
		
	}
	
	public static void MostrarMenu() {
		
		System.out.println("Escolha uma opção?");
		System.out.println("1 - Novo Jogo");
		System.out.println("9 - Sair");
		
		Scanner sc = new Scanner(System.in);
		
		switch (sc.nextInt()) {
		case 1: {
			NovoJogo();
			return;
		}
		case 9: {
			return;
		}
		default:
			MostrarMenu();
		}
		
		
	}

	private static void NovoJogo() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o nome do jogador 1?");
		String nomeJogador1 = sc.next();
		System.out.println("Qual o carater do jogador 1?");
		char caraterJogador1 = sc.next().charAt(0);
		Jogador jogador1 = new Jogador(nomeJogador1, caraterJogador1);
		
		System.out.println("Qual o nome do jogador 2?");
		String nomeJogador2 = sc.next();
		System.out.println("Qual o carater do jogador 2?");
		char caraterJogador2 = sc.next().charAt(0);
		
		System.out.println("Qual o numero de colunas?");
		int nrColunas = sc.nextInt();
		
		System.out.println("Qual o numero de linhas?");
		int nrLinhas = sc.nextInt();
		
		Jogador jogador2 = new Jogador(nomeJogador2, caraterJogador2);
		
		Tabuleiro tabuleiro1 = new Tabuleiro(jogador1, jogador2, nrColunas, nrLinhas);
		
		while (tabuleiro1.getEstado() == 0) {
			System.out.println("Qual a coluna?");
			int coluna = sc.nextInt();
			
			System.out.println("Qual a linha?");
			int linha = sc.nextInt();
			
			Jogada jogada = new Jogada(coluna, linha);
			tabuleiro1.AdicionarJogada(jogada);
			
			System.out.println(tabuleiro1);
		}
		
	}

}
