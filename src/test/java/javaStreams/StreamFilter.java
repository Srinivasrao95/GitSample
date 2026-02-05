package javaStreams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamFilter {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Srinivas");
		list.add("Ram");
		list.add("Siva");
		list.add("Hello");
		list.add("Sachet");
		
		
		//long a=list.stream().filter(s->s.startsWith("S")).count();
		//System.out.println(a);
		
		//print all names
		list.stream().filter(s->s.length()>6).limit(1).forEach(s->System.out.println(s));
		System.out.println("-------------------");

		 //print names with uppercase by using map in streams
		
		list.stream().filter(s->s.startsWith("S")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	}

}
