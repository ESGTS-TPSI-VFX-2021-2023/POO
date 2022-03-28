public class Quadrado {

// =======================================================
// ===================== ATRIBUTOS =======================
// =======================================================

	private double lado;
	private double area;
	private double perimetro;

// =======================================================
// ============ ACESSORES e MODIFICADORES ===============
// =======================================================

	public double getLado() {
		return lado;
	}
	
	public void setLado(double lado) {
		this.lado = lado;
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

	public void calcularArea() {
	 	setArea(getLado() * getLado());
	}
	
	public void calcularPerimetro() {
		setPerimetro(4 * getLado());
	}

// =======================================================
// ============== MÉTODOS COMPLEMENTARES ==============
// =======================================================

// ----> toString()



// ----> equals()
	
}
