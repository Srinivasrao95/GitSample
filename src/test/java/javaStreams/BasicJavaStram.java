package javaStreams;

import java.util.ArrayList;

public class BasicJavaStram {

	public static void main(String[] args) {
		
		ArrayList<String> names=new ArrayList<String>();
		names.add("Srinivas");
		names.add("Ram");
		names.add("Siva");
		names.add("Hello");
	    names.add("Sachet");
		names.add("Sample1");
		names.add("Sample2");
names.add("Sample3");
		names.add("Sample4");

	    int count=0;
	    
	    for(int i=0; i<names.size();i++) 
	    {
	    	String actual=names.get(i);
	    	if(actual.startsWith("S")) 
	    	{
	    		count++;
	    	}
	    }
     System.out.println(count);
	}

}
