package samplePrograms;

public class SecondHighestNumberinArray {

    public static void main(String[] args) {

        int[] array = {11, 44, 77, 99, 888};

        int largest = array[0];
        int secondlargest = array[0];

        for (int i = 1; i < array.length; i++) {

            if (array[i] > largest) {
                secondlargest = largest;
                largest = array[i];

            } else if (array[i] > secondlargest) {
                secondlargest = array[i];
            }
        }

        System.out.println(largest);
        System.out.println(secondlargest);
    }
}
////

