import java.util.*;
public class CountUniqueCharacterOfAllSubstring{
    public static int uniqueLetterString(String s) {
        int count=0;
        HashSet<String> items = new HashSet<>();
        for(int i=0; i<s.length(); i++){
            String temp = "";

            HashSet<Character> ans = new HashSet<>();
            for(int j=i; j<s.length(); j++){
                temp = temp + s.charAt(j);
                ans.add(s.charAt(j));
                if(!items.contains(temp)){
                    items.add(temp);
                    count = count + ans.size();
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
		String str = "LEETCODE";
		System.out.println(uniqueLetterString(str));
	}
}