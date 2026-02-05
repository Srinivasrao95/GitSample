package collections_java;

import java.util.LinkedList;

public class Linkedlist1 {

	public static void main(String[] args) {
		
		LinkedList<Integer> list=new LinkedList<>();
		
		list.add(5);
		list.add(50);
		list.add(51);
		list.add(58);
		list.addFirst(100);
		System.out.println(list.contains(51));
		list.set(3, 66);
		System.out.println(list);
		for (Integer l1 : list) {
			System.out.println(l1);
		}
		}
		
	}

