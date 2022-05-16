
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Teste t1 = new Teste(8);
		
		AvaliacaoSemestral as = new AvaliacaoSemestral();
		as.AdicionarNota(t1);
		as.setComportamento(15);
		as.CalcularNotaFinal();
		as.VerificaAprovacao();
		System.out.println(as);
		
		AvaliacaoAnual aa = new AvaliacaoAnual();
		aa.AdicionarNota(t1);
		aa.setComportamento(15);
		aa.setNotaTrabalho(15);
		aa.CalcularNotaFinal();
		aa.VerificaAprovacao();
		System.out.println(aa);
		
		AvaliacaoSeminario ase = new AvaliacaoSeminario();
		ase.AdicionarNota(t1);
		ase.setComportamento(15);
		ase.setNotaTrabalho(9);
		ase.setFrequentouSeminario(true);
		ase.CalcularNotaFinal();
		ase.VerificaAprovacao();
		System.out.println(ase);
	}

}
