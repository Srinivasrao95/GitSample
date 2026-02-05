package generices;

public class Loops_2 {

	public static void main(String[] args) {
		int term=5;
		for(int i=1;i<=term;i++) {
			for(int j=term;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
