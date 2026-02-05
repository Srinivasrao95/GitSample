
package samplePrograms;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        int no, fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the factorial number");
        no = sc.nextInt();

        for (int i = 1; i <= no; i++) {
            fact = fact * i;
        }
        System.out.println(fact);

    }
}
