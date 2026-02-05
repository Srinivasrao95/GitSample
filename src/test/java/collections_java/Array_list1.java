package collections_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array_list1 {

	public static void main(String[] args) {
		
		Integer[] int1=new Integer[] {23,43,56};
		ArrayList<Integer> ar1=new ArrayList<>(Arrays.asList(int1));
		System.out.println(ar1.size());
		System.out.println(ar1);
		System.out.println(ar1.remove(1));
		System.out.println(ar1);
		for (Integer integer : ar1) {
			System.out.print(integer +" ");
			
		}
Collections.synchronizedList(ar1);
	}

}
