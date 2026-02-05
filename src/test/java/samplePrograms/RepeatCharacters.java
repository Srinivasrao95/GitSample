package samplePrograms;


public class RepeatCharacters {
    public static void main(String[] args) {
        String s = "data";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // repeat (i+1) times
            for (int j = 0; j <= i; j++) {
                result.append(c);
            }
        }

        System.out.println(result.toString()); // Output: daatttaaaa
    }
}

/*__________________________________
public class ExtractNumbersSum {
    public static void main(String[] args) {
        String[] str = {"a20bf", "yh30hj", "ui40"};
        int sum = 0;

        for (String s : str) {
            // remove non-digits and extract the number
            String num = s.replaceAll("[^0-9]", "");
            if (!num.isEmpty()) {
                sum += Integer.parseInt(num);
            }
        }

        System.out.println(sum);  // Output: 90
    }
} */