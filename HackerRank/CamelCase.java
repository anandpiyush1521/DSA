import java.util.*;
public class CamelCase{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            String[] split = input.split(";");
            char op = split[0].charAt(0);
            char type = split[1].charAt(0);
            String words = split[2];
            char[] wordsArr = words.toCharArray();
            String output = "";
            
            if (op == 'S') {
                for (char ch: wordsArr) {
                    if (Character.isUpperCase(ch)) {
                        output += " " + Character.toLowerCase(ch);
                    } else if (ch != '(' && ch != ')') {
                        output += ch;
                    }
                }
            } else if (op == 'C') {
                for (int i = 0; i < wordsArr.length; i++) {
                    char currentChar = wordsArr[i];
                    if (currentChar != ' ') {
                        if (i > 0 && wordsArr[i - 1] == ' ') {
                            currentChar = Character.toUpperCase(currentChar);
                        }
                        output += currentChar;
                    }
                }
                if (type == 'M') {
                    output += "()";
                } else if (type == 'C') {
                    output = output.substring(0, 1).toUpperCase() + output.substring(1);
                }     
            }
        }
            
        System.out.println(output.trim());
    }
}