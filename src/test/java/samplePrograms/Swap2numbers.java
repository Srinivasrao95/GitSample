package samplePrograms;

import java.util.Scanner;

public class Swap2numbers {

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the a number");
		a=sc.nextInt();
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the b number");
		b=sc1.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping a value is: "+a);
		System.out.println("After swapping b value is: "+b);
	}

}
