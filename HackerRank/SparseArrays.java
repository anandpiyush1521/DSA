import java.util.*;
public class SparseArrays{
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries){
        ArrayList<Integer> result = new ArrayList<Integer>();
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(String str : strings){
            if(!map.containsKey(str)){
                map.put(str, 1);
            }else{
                map.put(str, map.get(str)+1);
            }
        }
        for(String query: queries){
            if(map.containsKey(query)){
                result.add(map.get(query));
            }else{
                result.add(0);
            }
        }
        return result;
    }
    public static void main(String[] args){
        ArrayList<String> strings = new ArrayList<String>();
        ArrayList<String> queries = new ArrayList<String>();
        strings.add("ab");
        strings.add("ab");
        strings.add("abc");

        queries.add("ab");
        queries.add("abc"); 
        queries.add("bc"); 
        
        System.out.println(matchingStrings(strings, queries));
    }    
}