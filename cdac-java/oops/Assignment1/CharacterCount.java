public class CharacterCount {
    public static int countCharacter(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String inputString = "hello world";
        char targetChar = 'o';
        
        int occurrences = countCharacter(inputString, targetChar);
        System.out.println("The character '" + targetChar + "' appears " + occurrences + " times in the string.");
    }
}
