public class Carro implements IVeiculo {
	
	private int posicao;
	
	
	@Override
	public void Avancar(int valor) throws Exception {
		// TODO Auto-generated method stub
		
		
		if (this.posicao + valor > 4) {
			throw new Exception("Acidente Frontal");
		}
		
		this.posicao += valor;
		
	}

	@Override
	public void Recuar(int valor) {
		// TODO Auto-generated method stub
		
		this.posicao -= valor;
		
	}

}
