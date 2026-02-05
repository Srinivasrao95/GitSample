package samplePrograms;

public class Palindrome {

    public static void main(String[] args) {

        int s, temp, sum = 0;
        int num = 676;
        temp = num;
        while (num > 0) {
            s = num % 10;
            sum = (sum * 10) + s;
            num = num / 10;
        }
        if (temp == sum) {
            System.out.println("its palindrome");

        } else {
            System.out.println("its not palindrome");
        }
    }
}