public class Ponto {
	// =======================================================
	// ===================== ATRIBUTOS =======================
	// =======================================================
	
	private int x;
	private int y;
		
	
	// =======================================================
	// ============ ACESSORES e MODIFICADORES ===============
	// =======================================================
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
		
	
	// =======================================================
	// =================== CONSTRUTORES =====================
	// =======================================================
	
	  
	   
	// CONSTRUTOR DEFAULT
	public Ponto () {
		
	}
	   
	
	// CONSTRUTOR COM PARÂMETROS
	public Ponto(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
	// =======================================================
	// =================== .COMPORTAMENTOS ==================
	// =======================================================
	
	public void AlterarCoordenadas(int x, int y) {
		this.setX(x);
		this.setY(y);
	}

	
	
	
	// =======================================================
	// ============== MÉTODOS COMPLEMENTARES ==============
	// =======================================================
	
	// ----> toString()
	@Override
	public String toString() {
		return "Ponto [x=" + x + ", y=" + y + "]";
	}
	
	// ----> equals()
}
