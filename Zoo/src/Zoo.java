import java.util.ArrayList;

public class Zoo {
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	private ArrayList<Animal> animais = new ArrayList<Animal>();

    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================



    // =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================

  
   
    // CONSTRUTOR DEFAULT

   

    // CONSTRUTOR COM PARÂMETROS



    // =======================================================
    // =================== .COMPORTAMENTOS ==================
    // =======================================================

	public void AdicionarAnimal(Animal animal) {
		this.animais.add(animal);
	}
	
	public String ListarAnimais() {
		String resultado = "";
		
		for (Animal animal : animais) {
			resultado += "Nome: " + animal.getNome() + " | Voz: " + animal.getVoz() + "\n";
		}
		
		return resultado;
	}
	
	public int ContarAnimais() {
		return this.animais.size();
	}
	
	public int ContarAnimaisDomesticos() {
		
		int contador = 0;
		
		for (Animal animal : animais) {
			
			if (animal instanceof AnimalDomestico) {
				contador += 1;
			}
			
		}
		
		return contador;
		
	}
	
	public int ContarAnimaisSelvagens() {
		
		int contador = 0;
		
		for (Animal animal : animais) {
			
			if (animal instanceof AnimalSelvagem) {
				contador += 1;
			}
			
		}
		
		return contador;
		
	}
	
	public int ContarCaes() {
	
		int contador = 0;
		
		for (Animal animal : animais) {
			
			if (animal instanceof Cao) {
				contador += 1;
			}
			
		}
		
		return contador;
		
	}
	
	public String MostrarNome(int indice) {
		
		return this.animais.get(indice).getNome();
		
	}
	
	public String OuvirVoz(int indice) {
		
		return this.animais.get(indice).getVoz();
		
	}
	
	public String MostrarRaca(int indice) {
		
		Animal a1 = this.animais.get(indice);
		
		if (a1 instanceof Cao) {
			Cao c1 = (Cao)a1;
			return c1.getRaca();
		} else {
			return "Este animal não tem raça";
		}
		
	}
	
	public String ContaDomesticosSelvagens() {
		
		return "Domésticos = " + this.ContarAnimaisDomesticos() + " | Selvagens = " + this.ContarAnimaisSelvagens();
		
	}
	
	public String ContaAnimaisAsiaAfrica() {
		
		int animaisAsia = 0;
		int animaisAfrica = 0;
		
		for (Animal animal : animais) {
			if (animal instanceof Leao) {
				
				if (((Leao)animal).getContinente() == "Asia") {
					animaisAsia += 1;
				} else if (((Leao)animal).getContinente() == "Africa") {
					animaisAfrica += 1;
				}
				
			}
		}
		
		return "Ásia = " + animaisAsia + " | África = " + animaisAfrica;
		
	}
	
	public double PesoTotalOvelhas() {
		
		
		double pesoTotal = 0;
		
		for (Animal animal : animais) {
			
			if (animal instanceof Ovelha) {
				
				pesoTotal += ((Ovelha)animal).getPeso();
			}
			
		}
		
		return pesoTotal;
		
	}

    // =======================================================
    // ============== MÉTODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()



    // ----> equals()
}
