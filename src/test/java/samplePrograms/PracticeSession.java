package samplePrograms;

import cucumber.api.java.hu.Ha;
import org.testng.annotations.Test;

import java.util.*;


public class PracticeSession {


    @Test
    public void waits() {


        int array[] = {52, 432, 53};
        int first = array[0];
        int secondlargest = array[0];


        for (int i = 1; i < array.length; i++) {
            if (array[i] > first) {
                secondlargest = first;
                first = array[i];
            } else if (array[i] > secondlargest) {
                secondlargest = array[i];
            }


        }

        System.out.println(secondlargest);
    }
}
