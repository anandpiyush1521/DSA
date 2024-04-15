import java.util.ArrayList;

public class Wipro2 {
    public static int calculateWeight(String word, int[] weights) {
        int weight = 0;
        char[] charArray = word.toCharArray();
        int lastIndex = charArray.length - 1;

        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            int index = c - 'a';
            if (index >= 0 && index < weights.length) {
                if (i == lastIndex && weights[index] < 0) {
                    // Add the alphabetic position if the weight is negative for the last character
                    weight += (weights[index] + (index + 1));
                } else {
                    weight += weights[index];
                }
            }
        }

        return weight;
    }

    public static int count(int[] arr, String company) {
        ArrayList<Integer> list = new ArrayList<>();
        String[] words = company.toLowerCase().split("\\s+");
        for (String word : words) {
            int weight = calculateWeight(word, arr);
            list.add(weight);
        }
        
        int ans = 1;
        for (Integer num : list) {
            ans *= num;
        }
        return ans;
    }

    public static void main(String[] args) {
        // Array specifying the individual weight of 26 alphabetical characters
        int[] arr = {15, 16, 1, -2, -13, 61, 11, 4, 3, 19, -4, 17, -3, 90, -65, 67, 12, 0, 13, 2, 3, 43, 21, -17, 2, 42};

        String str = "AND"; // Note that the string should be enclosed in double quotes

        int weight = count(arr, str);
        System.out.println("Weight of the string: " + weight);
    }
}
