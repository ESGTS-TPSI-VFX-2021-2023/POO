
public class Main {
	public static void main(String[] args) {
    Singleton singleton = Singleton.getInstance("SAPO");
    Singleton anotherSingleton = Singleton.getInstance("BAR");
    System.out.println(singleton.value);
    System.out.println(anotherSingleton.value);
    
   anotherSingleton.AlterarValor("XPTO");
    
    System.out.println(singleton.value);
    System.out.println(anotherSingleton.value);
	}
}
