package pattern.singleton.inner;

public class Singleton {

	private Singleton() {
	}

	public static Singleton getInstance() {
		return SingletonInstanceHolder.instance;
	}

	private static class SingletonInstanceHolder {

		static Singleton instance = new Singleton();

	}
}