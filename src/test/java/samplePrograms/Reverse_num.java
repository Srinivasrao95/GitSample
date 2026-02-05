package samplePrograms;

public class Reverse_num {

    public static void main(String[] args) {


        int num = 345, rev = 0;
        while (num != 0) {
            int remainder = num % 10;
            rev = rev * 10 + remainder;
            num = num / 10;
        }
        System.out.println(rev);

    }

}