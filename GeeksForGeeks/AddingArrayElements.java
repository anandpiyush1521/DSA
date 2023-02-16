import java.util.*;
public class AddingArrayElements{
    public static int minOperations(int[] arr, int n, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i=0; i<n; i++){
            pq.add(arr[i]);
        }
        int count=0;
        while(pq.size() > 1 && pq.peek()<k){
            int a = pq.peek();
            pq.remove();
            int b = pq.peek();
            pq.remove();
            int sum = a + b;
            pq.add(sum);
            count++;
        }
        if(pq.peek() < k){
            return -1;
        }
        return count;
    }
    public static void main(String[] args){
        int[] arr = {1, 10, 12, 9, 2, 3};
        int n =6;
        int k=6;
        System.out.println(minOperations(arr, n, k));
    }
}