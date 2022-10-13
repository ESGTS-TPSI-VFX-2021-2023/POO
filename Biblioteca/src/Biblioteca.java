import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {

	public static void main(String[] args) {
		
	
		MenuInicial();
		
		
	}
		public static  void MenuInicial() {
			
			
			ArrayList<Leitor> leitores = new ArrayList<Leitor>();
			ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
			ArrayList<Documento> documentos = new ArrayList<Documento>();
			ArrayList<Emprestimo> emprestimos = new ArrayList<Emprestimo>();
			
			Scanner sc = new Scanner(System.in);
			int opcao;
			
			do {
				
				System.out.println("#########################");
				System.out.println("# 1 - Empréstimo  		#");
				System.out.println("# 2 - Catagolação   	#");
				System.out.println("# 3 - Leitores      	#");
				System.out.println("# 4 - Funcionário   	#");
				System.out.println("#########################");
				
				System.out.println("Qual a opção que pretende?");
				opcao = sc.nextInt();
				
				switch (opcao) {
				case 1:
				
					System.out.println("#############################");
					System.out.println("# 1 - Adicionar Empréstimo 	#");
					System.out.println("# 2 - Listar Empréstimos  	#");
					System.out.println("#############################");
					System.out.println("Qual a opção que pretende?");
					opcao = sc.nextInt();
		
					switch(opcao) {
					
					case 1:
					CriarEmprestimo(emprestimos);
					
					break;
					
					case 2:
					ListarEmprestimos(emprestimos);	
					
					break;
					}
					break;
				case 2:
					
					System.out.println("#############################");
					System.out.println("# 1 - Adicionar Documento 	#");
					System.out.println("# 2 - Listar Documentos  	#");
					System.out.println("#############################");
					System.out.println("Qual a opção que pretende?");
					opcao = sc.nextInt();
		
					switch(opcao) {
					
					case 1:
					CriarDocumento(documentos);
					
					break;
					
					case 2:
					ListarDocumentos(documentos);	
					
					break;
					}
					
					break;
					
				case 3:
					System.out.println("########################");
					System.out.println("# 1 - Adicionar Leitor #");
					System.out.println("# 2 - Listar Leitores  #");
					System.out.println("########################");
					System.out.println("Qual a opção que pretende?");
					opcao = sc.nextInt();
		
					switch(opcao) {
					
					case 1:
					CriarLeitor(leitores);
					
					break;
					
					case 2:
					ListarLeitores(leitores);	
					
					break;
					}
					break;
					
				case 4:
					
					System.out.println("#################################");
					System.out.println("# 1 - Adicionar Funcionário 	#");
					System.out.println("# 2 - Listar Funcionários  		#");
					System.out.println("#################################");
					System.out.println("Qual a opção que pretende?");
					opcao = sc.nextInt();
		
					switch(opcao) {
					
					case 1:
					CriarFuncionario(funcionarios);
					
					break;
					
					case 2:
					ListarFuncionarios(funcionarios);	
					
					break;
					}
					
				break;
			
					
				default:
					
					break;
			}
			} while (opcao != 4);
			
		}
		
		public static void CriarEmprestimo(ArrayList<Emprestimo> emprestimos) {
			
			Scanner sc = new Scanner(System.in);
			
			int numeroFuncionario;
			String nomeLeitor;
			int numeroLeitor;
			String tituloObra;
			String autor;
			int prazo;
			
			Emprestimo e1 = new Emprestimo();
			Leitor l1 = new Leitor();
			Funcionario f1 = new Funcionario();
			Documento d1 = new Documento();
			
			System.out.print("Funcionário n.º: ");
			numeroFuncionario = sc.nextInt();
			f1.setNumeroFuncionario(numeroFuncionario);
			
			System.out.println("Qual o nome do Leitor?");
			nomeLeitor = sc.next();
			l1.setNome(nomeLeitor);
			
			System.out.println("Qual o numero do Leitor?");
			numeroLeitor = sc.nextInt();
			l1.setNumeroLeitor(numeroLeitor);
			
			System.out.println("Qual o Titulo?");
			tituloObra = sc.next();
			d1.setTitulo(tituloObra);
			
			System.out.println("Qual o Autor?");
			autor = sc.next();			
			d1.setAutor(autor);
			
			System.out.println("Prazo:");
			prazo = sc.nextInt();
			e1.setPrazo(prazo);
			
			System.out.println(e1);
			
			emprestimos.add(e1);
			
			
		}
		
		public static void CriarDocumento(ArrayList<Documento> documentos) {
		String titulo;
		String autor;
		String suporte;
		
		Scanner sc = new Scanner(System.in);
		
		Documento d1 = new Documento();
		
		System.out.println("Título?");
		titulo = sc.next();
		d1.setTitulo(titulo);
		
		System.out.println("Autor?");
		autor = sc.next();	
		d1.setAutor(autor);
		
		System.out.println("Suporte");
		suporte = sc.next();
		d1.setSuporte(suporte);
		
		documentos.add(d1);
		System.out.println(documentos.toString());
		}
		
		
		
		
		public static void CriarLeitor(ArrayList<Leitor> leitores) {
			String nomeLeitor;
			String endereco;
			String telefone;
			int numeroLeitor;
			int validade;
			
			Scanner sc = new Scanner(System.in);
			
			Leitor l1 = new Leitor();
			
			System.out.println("Número Leitor?");
			numeroLeitor = sc.nextInt();
			for (Leitor leitor : leitores) {
				if(leitor.getNumeroLeitor() == numeroLeitor ) {
				System.out.println("Este leitor já existe");	
					break;
				}
			}
			l1.setNumeroLeitor(numeroLeitor);
			
			System.out.println("Nome Leitor?");
			nomeLeitor = sc.next();
			l1.setNome(nomeLeitor);
			
			System.out.println("Endereço Leitor?");
			endereco = sc.next();
			l1.setEndereco(endereco);
			
			System.out.println("Número de Telefone?");
			telefone = sc.next();
			l1.setTelefone(telefone);
			
			System.out.println("Validade?");
			validade = sc.nextInt();
			l1.setValidade(validade);
			
			leitores.add(l1);
			System.out.println(l1);
			
		}
	
		public static void CriarFuncionario(ArrayList<Funcionario> funcionarios) {
			String nomeFuncionario;
			String endereco;
			String telefone;
			int numeroFuncionario;
			String tipoFuncionario;
			
			Scanner sc = new Scanner(System.in);
			
			Funcionario f1 = new Funcionario();
			
			System.out.println("Número Funcionário?");
			numeroFuncionario = sc.nextInt();
			for (Funcionario funcionario : funcionarios) {
				if(funcionario.getNumeroFuncionario() == numeroFuncionario ) {
				System.out.println("Este Funcionário já existe");	
					break;
				}
			}
			f1.setNumeroFuncionario(numeroFuncionario);
			
			System.out.println("Nome Leitor?");
			nomeFuncionario = sc.next();
			f1.setNome(nomeFuncionario);
			
			System.out.println("Endereço Funcionario?");
			endereco = sc.next();
			f1.setEndereco(endereco);
			
			System.out.println("Número de Telefone?");
			telefone = sc.next();
			f1.setTelefone(telefone);
			
			System.out.println("Tipo?");
			tipoFuncionario = sc.next();
			f1.setTipoFuncionario(tipoFuncionario);
			
			funcionarios.add(f1);
			
			System.out.println(f1);
			
		}
	
		public static void ListarLeitores(ArrayList<Leitor> leitores) {
		
		System.out.println(leitores.toString());	
			
			
		}

		public static void ListarEmprestimos(ArrayList<Emprestimo> emprestimos) {
			
			System.out.println(emprestimos.toString());	
				
				
			}
		
		public static void ListarFuncionarios(ArrayList<Funcionario> funcionarios) {
			
			System.out.println(funcionarios.toString());	
				
				
			}
		
		public static void ListarDocumentos(ArrayList<Documento> documentos) {
			
			System.out.println(documentos.toString());	
				
				
			}
		
}


