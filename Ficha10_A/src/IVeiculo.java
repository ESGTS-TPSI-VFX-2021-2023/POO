public interface IVeiculo {
	
	// ATRIBUTOS
	int posicao = 0;
	
	// COMPORTAMENTOS
	public void Avancar(int valor) throws Exception;
	public void Recuar(int valor);
	
}
