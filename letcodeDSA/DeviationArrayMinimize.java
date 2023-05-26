import java.util.*;
public class DeviationArrayMinimize{
    public static int minimumDeviation(int[] nums) {
        // TreeSet<Integer> tr = new TreeSet<Integer>();
        // for(int num: nums){
        //     if(num%2 != 0){
        //         num = num*2;
        //     }
        //     tr.add(num);
        // }
        // int diff = Integer.MAX_VALUE;
        // while(true){
        //     int min = tr.first();
        //     int max = tr.last();
        //     diff = Math.min(diff, max-min);
        //     if(max%2 == 0){
        //         tr.remove(max);
        //         tr.add(max/2);
        //     }else{
        //         break;
        //     }
        // }
        // return diff;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a, b) -> b - a);
        int min = Integer.MAX_VALUE;
        for(int num: nums){
            if(num%2 != 0){
                num = num*2;
            }
            min = Math.min(min, num);
            pq.add(num);
        }
        int diff = Integer.MAX_VALUE;
        while(pq.peek()%2 == 0){
            int max = pq.remove();
            diff = Math.min(diff, max-min);
            min = Math.min(max/2, min);
            pq.add(max/2);
        }
        return Math.min(diff, pq.peek() - min);
    }
    public static void main(String[] args){
        int[] arr = {4, 1, 5, 20, 3};
        System.out.println(minimumDeviation(arr));
        // TreeSet<Integer> tr = new TreeSet<Integer>();
        // for(int num: arr){
        //     tr.add(num);
        // }
        // System.out.println(tr);
        // int max = tr.last();
        // System.out.println(max);
        // int min = tr.first();
        // System.out.println(min);    
    }
}