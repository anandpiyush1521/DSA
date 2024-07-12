import java.util.*;
public class hashmap {
    public static void main(String[] args){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(1, 2);
        map.put(2, 3);
        map.put(4, 5);
        map.put(0, 7);
        map.put(1, 3);

        HashMap<Integer, Integer> result = new HashMap<Integer, Integer>();

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getKey() != 0){
                result.put(entry.getKey(), entry.getValue());
            }
        }

        for(Map.Entry<Integer, Integer> entry : result.entrySet()){
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
    }
}  
