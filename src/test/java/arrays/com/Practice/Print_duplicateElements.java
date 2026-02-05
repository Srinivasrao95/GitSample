package arrays.com.Practice;

public class Print_duplicateElements {

    public static void main(String[] args) {
        int arr1[] = {1, 5, 6, 8, 9, 8};
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] == arr1[j]) {
                    System.out.println(arr1[j]);
                }
            }
        }

    }

}
