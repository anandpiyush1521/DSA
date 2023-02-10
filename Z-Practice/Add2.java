import java.util.*;
public class Add2{
    public static void main(String[] args) {
        int num = 5696;
        String strNum = Integer.toString(num);
        String result = "";

        for (int i = 0; i < strNum.length(); i++) {
            int digit = Character.getNumericValue(strNum.charAt(i));
            digit += 2;
            result += Integer.toString(digit);
        }

        int newNum = Integer.parseInt(result);
        System.out.println(newNum);
    }
}