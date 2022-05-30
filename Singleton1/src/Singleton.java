
public class Singleton {

    private static Singleton instance;
    public String value;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        
            instance = new Singleton(value);
    
        return instance;
    }
    
    public void AlterarValor(String value) {
    	instance.value = value;
    }
}
