
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Turma t1 = new Turma("VFX");
		Aluno a1 = new Aluno("Jo�o", "1");
		Aluno a2 = new Aluno("Adriano", "2");
		Nota n1 = new Nota(15, "Matem�tica");
		Nota n2 = new Nota(16, "Portugu�s");
		
		a1.AdicionarNota(n1);
		a1.AdicionarNota(n2);
		a2.AdicionarNota(n2);
		t1.AdicionarAluno(a1);
		t1.AdicionarAluno(a2);
		
		System.out.println(a1);
		System.out.println(t1.ConsultarAluno("Jo�o"));
		System.out.println(t1.CalcularMediaTurma());
		
	}

}
