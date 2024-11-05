package cdac;
import java.util.*;
public class Problem14 {
    public static int[] mergeTwoSortedArrays(int[] a1, int n, int[] a2, int m){
        int[] res = new int[n+m];
        List<Integer> list = new ArrayList<Integer>();
        for(int i: a1){
            list.add(i);
        }
        for(int i: a2){
            list.add(i);
        }
        Collections.sort(list);
        int index=0;
        for(int i: list){
            res[index++] = i;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++){
            arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++){
            arr2[i] = sc.nextInt();
        }

        int[] ans = mergeTwoSortedArrays(arr1, n, arr2, m);
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
