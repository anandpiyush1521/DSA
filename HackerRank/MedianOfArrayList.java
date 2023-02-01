//WEEK-1 MOCK TEST

import java.util.*;
public class MedianOfArrayList{
    public static int findMedian(List<Integer> arr){
        Collections.sort(arr);
        if(arr.size() % 2 == 1){
            return arr.get((arr.size() + 1)/2 - 1);
        }else{
            int upper = arr.get(arr.size()/2 -1);
            int lower = arr.get(arr.size() / 2);

            return (lower+upper)/2;
        }
    }
    public static  void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        //arr.add()

        //System.out.println(findMedian(arr));
    }
}