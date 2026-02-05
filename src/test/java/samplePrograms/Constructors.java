package samplePrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Constructors {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		System.out.println("Execution starts");
		int a = 10;
		int b = 0;
		int c = 0;

		try{
			c = a / b;
		}
		
		catch(ArithmeticException e) {
			System.out.println(e.toString());
			throw(e);
		}
		finally {
			System.out.println("Finally block executed");
		}
		FileInputStream file=new FileInputStream("c://resume.docx");
		System.out.println(file);
		
		
		System.out.println("value is: " + c);
		System.out.println("Execution Ends");

	}

}
