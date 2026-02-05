package samplePrograms;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		
		
		Random random=new Random();
		for(int i=1;i<=6;i++) {
			System.out.println("random numers is "+random.nextInt(99));
		
		}
	}

}
