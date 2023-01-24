import java.util.*;

public class Hashing{

    public static void main(String[] args){
        //Create a hash table to store
        // String value corresponding to integer key

        // Hashtable<Integer,String> hashtable = new Hashtable<Integer,String>();
        //inpur the key 
        // hashtable.put(1, "Galgotias");
        // hashtable.put(3, "College");
        // hashtable.put(2, "university");

        // System.out.println(hashtable);

        // System.out.println("The size of map is: "+hashtable.size());

        // System.out.println("The value: "+ hashtable.get(3));

        /* Set Iterator  */
        Set<String> set = new HashSet<>();
        set.add("welcome");
        set.add("To");
        set.add("Geeks");
        set.add("4");
        set.add("Geeks");

        System.out.println(set);

        Iterator value = set.iterator();
        System.out.println("The iterators value are: ");
        while (value.hasNext()){
            System.out.println(value.next());
        }
    }
}