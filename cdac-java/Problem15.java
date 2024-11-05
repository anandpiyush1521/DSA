package cdac;
import java.util.*;
public class Problem15 {
    public static int kthLargestElement(int[] arr, int k){
        PriorityQueue<Integer> q = new PriorityQueue<>(k);
        for (int i:arr){
            q.offer(i);
            if (q.size()>k) q.poll();
            

        }
        return q.peek(); 
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt(); //[6, 1, 7, 3, 8]
        }
        int k = sc.nextInt();
        System.out.println("The kth largest element is: " + kthLargestElement(arr, k));
    }
}
