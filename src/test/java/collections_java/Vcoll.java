package collections_java;

import java.util.Vector;

public class Vcoll {

	public static void main(String[] args) {
		Vector<String> v1 = new Vector<>();
		v1.add("Raj");
		v1.add("ramesh");
		v1.add(0, "Srinivas");

		Vector<String> v2 = new Vector<>();
		v2.add("Rohan");
		System.out.println(v1);

		v1.addAll(v2);
		System.out.println(v1);
		System.out.println(v1.indexOf("Raj"));
		

	}

}
