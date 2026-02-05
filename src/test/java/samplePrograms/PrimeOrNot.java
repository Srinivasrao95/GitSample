package samplePrograms;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {

		int no,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		no=sc.nextInt();
		if(no<=1) {
			System.out.println("Least prime number is 2");
		}
		for(i=2;i<no;i++) {
			if(no%i==0) {
				System.out.println("not prime");
				break;
			}
		}
		if(no==i) {
			System.out.println("Its Prime");
		}
		}
		
		
	}


