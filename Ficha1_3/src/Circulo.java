public class Circulo {
	
// =======================================================
// ===================== ATRIBUTOS =======================
// =======================================================

	private double raio;
	private double diametro;
	private double area;
	private double perimetro;

// =======================================================
// ============ ACESSORES e MODIFICADORES ===============
// =======================================================

	public double getRaio() {
		return raio;
	}
	
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double getDiametro() {
		return diametro;
	}
	
	private void setDiametro(double diametro) {
		this.diametro = diametro;
	}
	
	public double getArea() {
		return area;
	}
	
	private void setArea(double area) {
		this.area = area;
	}
	
	public double getPerimetro() {
		return perimetro;
	}
	
	private void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

// =======================================================
// =================== CONSTRUTORES =====================
// =======================================================

  
   
    // CONSTRUTOR DEFAULT

   

    // CONSTRUTOR COM PARÂMETROS



// =======================================================
// =================== .COMPORTAMENTOS ==================
// =======================================================

	public void CalcularDiametro() {
		setDiametro(2 * getRaio());
	}
	
	public void CalcularPerimetro() {
		setPerimetro(2 * Math.PI * getRaio());
	}
	
	public void CalcularArea() {
		setArea(Math.PI * Math.pow(getRaio(), 2));
	}


// =======================================================
// ============== MÉTODOS COMPLEMENTARES ==============
// =======================================================

// ----> toString()



// ----> equals()

}
