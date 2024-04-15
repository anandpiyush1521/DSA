import java.util.*;
public class Spread{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        for(int i = 0; i < input.length(); i++) {
            System.out.print(input.charAt(i));
            // Print a space after each character, except the last one
            if (i < input.length() - 1) {
                System.out.print(" ");
            }
        }
    }
}