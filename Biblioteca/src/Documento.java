
public class Documento {
	// =======================================================
    // ===================== ATRIBUTOS =======================      titulo,autor,suporte.
    // =======================================================
	private String titulo;
	private String autor;
	private String suporte;

    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getSuporte() {
		return suporte;
	}
	public void setSuporte(String suporte) {
		this.suporte = suporte;
	}
	
    // =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================

  
   
    // CONSTRUTOR DEFAULT
	public Documento() {
		super();
	
	}
    // CONSTRUTOR COM PARÂMETROS
	public Documento(String titulo, String autor, String suporte) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.suporte = suporte;
	}



    // =======================================================
    // =================== .COMPORTAMENTOS ==================
    // =======================================================
	
	

    // =======================================================
    // ============== MÉTODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()
	@Override
	public String toString() {
		return "Documento [titulo=" + titulo + ", autor=" + autor + ", suporte=" + suporte + "]";
	}


    // ----> equals()
}
