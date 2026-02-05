package samplePrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveduplicateElements {

    public static void main(String[] args) {

        int b[] = {1, 2, 45, 3, 2, 6, 7, 7, 33};
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < b.length; i++) {
            set.add(b[i]);
        }
        Integer[] c = set.toArray(new Integer[set.size()]);
        System.out.println(Arrays.toString(c));

    }
}

/*
 * int a[] ={1,1,2,3,4,6,6};
 * Set<Integer>set=
 */






