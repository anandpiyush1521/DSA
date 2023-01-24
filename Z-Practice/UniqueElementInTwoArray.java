import java.util.*;
public class UniqueElementInTwoArray{
    public static void main(String[] args){
        //TreeSet doest not contain duplicat element
        //Treeset.java
        TreeSet<Integer> treeset = new TreeSet<Integer>();
        int[] arr1 = new int[] { 1, 2, 3, 4, 5, 6 };
        int[] arr2 = new int[] { 5, 6, 7, 8 };
        for(int i: arr1){
            treeset.add(i);
        }
        for(int i: arr2){
            treeset.add(i);
        }
        System.out.println(treeset);
    }
}