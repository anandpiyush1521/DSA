import java.util.*;

class KthLargesyElement {
    public static int findKthLargest(int[] nums, int k) {
    
        PriorityQueue<Integer> q = new PriorityQueue<>(k);
        for (int i:nums){
            q.offer(i);
            if (q.size()>k) q.poll();
            

        }
        return q.peek();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of elements: ");
        int n = sc.nextInt();

        System.out.println("Create Array");

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Target element: ");
        int k = sc.nextInt();

        System.out.println("Kth largest element: "+ findKthLargest(arr, k));
    }
    
}