package arrays.com.Practice;

import java.util.HashSet;
import java.util.Set;

public class removeduplicateelements {
    public static void main(String[] args) {

        int arr[] = {1, 5, 5, 8, 8, 8, 9};

        HashSet<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);

        }
        System.out.println(set);


    }
}
