import java.util.*;

public class AddElementToHashMap{

    public static void main(String[] args){

        Map<Integer, String> hm1 = new HashMap<>();
        hm1.put(1, "one");
        hm1.put(3, "three");
        hm1.put(2, "two");
        hm1.put(5, "five");

        System.out.println("Mapping of hashmap hm1 are: "+ hm1);

        // HashMap<Integer, String> hm2 = new HashMap<>(hm1);

        // System.out.println("Mapping of hashmap hm2 are: "+ hm2);

        for(Map.Entry<Integer, String> e: hm1.entrySet()){
            System.out.println("Key: "+ e.getKey() +" value: "+ e.getValue());
        }


    }
}