import java.util.*;
public class FindDuplicateInArray{
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        // int duplicate=-1;
        // for(int i=0; i<arr.size()-1; i++){
        //     if(arr.get(i) == arr.get(i+1)){
        //         duplicate = arr.get(i);
        //         break;
        //     }
        // }
        // return duplicate;

        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0; i<arr.size(); i++){
            if(!set.add(arr.get(i))){
                return arr.get(i);
            }
        }
        return -1;
    }
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(2);
        list.add(2);
        int n = 5;
        System.out.println(findDuplicate(list, n));
    }
}