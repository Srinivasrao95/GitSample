package generices;

class Store<T>{
	private T item;
	public void setitem(T item) {
		this.item=item;
	}
	public T getitem() {
		return this.item;
	}

}

class Hashtable<K,V>{
	private K key;
	private V value;
	public Hashtable(K key,V value) {
		this.key=key;
		this.value=value;
	}
	@Override
	public String toString() {
		return "Hashtable [key=" + key + ", value=" + value + "]";
	}
}
public class Generices1 {

	public static void main(String[] args) {
		Hashtable<Integer,String> hashtable=new Hashtable<>(22, "Srinivas");
		System.out.println(hashtable);
	}
}
