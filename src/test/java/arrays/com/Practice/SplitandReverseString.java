package arrays.com.Practice;

public class SplitandReverseString {
    public static void main(String[] args) {

        String text="Hello java Program";
        String[] s1=text.split(" ");

        for(String s2: s1){
            for(int i=s2.length()-1; i>=0;i--){
                System.out.print(s2.charAt(i));
            }
            System.out.print(" ");
        }

    }
}
