import java.util.*;

public class ConcurrentModificationExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        try {
            //throw ConcurrentModificationException
            for (String item : list) {
                if (item.equals("B")) {
                    list.remove(item); //modifying the list while iterating
                }
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("ConcurrentModificationException caught!");
        }

        // Display the final list
        System.out.println("Final list: " + list);
    }
}

