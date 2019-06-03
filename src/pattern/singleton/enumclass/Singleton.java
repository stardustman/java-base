package pattern.singleton.enumclass;

public enum Singleton {
    INSTANCE;
    public void whateverMethod() {
    	System.out.println("what's the fuck?");
    }
    
    public static void main(String[] args) {
		Singleton.INSTANCE.whateverMethod();
	}
}