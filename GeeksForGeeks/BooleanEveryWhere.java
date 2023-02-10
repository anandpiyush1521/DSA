import java.util.*;
public class BooleanEveryWhere{
    public static int maxInstance(String s){
        // Set<Character> set = new HashSet<>();
        // Map<Character, Integer> set2 = new HashMap<>();
        // int count=0;
        // for(int i=0; i<s.length(); i++){
        //     set.add(s.charAt(i));
        // }
        // for(int i=0; i<s.length(); i++){
        //     if(set.contains(s.charAt(i))){
        //         set2.put(s.charAt(i), count++);
        //     }
        // }
        // System.out.println(set2);
        String res = "balloon";
        int[] map = new int[26];
        int count=0;
        
        for(char ch : s.toCharArray()){
            map[ch-'a']++;
        }
        
        while(true){
            int i;
            for(i=0; i<res.length(); i++){
                if(map[res.charAt(i)-'a'] == 0){
                    break;
                }else{
                    map[res.charAt(i)-'a']--;
                }
            }
            if(i <= res.length()-1){
                break;
            }else{
                count++;
            }
        }
        
        return count;
    }
    public static void main(String[] args){
        String s = "nlaebolko";
        System.out.println(maxInstance(s));
        
    }
}