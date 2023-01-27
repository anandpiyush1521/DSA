import java.util.*;
public class ScrambledString{
    static HashMap<String,Boolean> map;
    public static boolean isScramble(String S1,String S2)
    {
        //code here
        map = new HashMap<>();
        return fun(S1,S2);
    }
    public static boolean fun(String S1,String S2)
    {
        if(S1.equals(S2)){
            map.put(S1+" "+S2,true);
            return true;
        }
        if(map.containsKey(S1+" "+S2)){
            return map.get(S1+" "+S2);
        }
        if(S1.length()==S2.length()){
            int n=S1.length();
            for(int i=1;i<n;i++){
                if(fun(S1.substring(0,i),S2.substring(0,i)) && fun(S1.substring(i,n),S2.substring(i,n))){
                    map.put(S1+" "+S2,true);
                    return true;
                }
                if(fun(S1.substring(0,i),S2.substring(n-i,n)) && fun(S1.substring(i,n),S2.substring(0,n-i))){
                    map.put(S1+" "+S2,true);
                    return true;
                }
            }
        }
        map.put(S1+" "+S2,false);
        return false;
    }
    public static void main(String[] args){
        String s1 = "coder";
        String s2 = "ocder";
        System.out.println(isScramble(s1, s2));
    }
}