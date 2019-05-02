package generic.with;
public class GenericHolder<T> {

	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	public boolean equals (Object obj) {
		return t.equals(obj);
	}

}
