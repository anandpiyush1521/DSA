import java.util.*;
public class KthMissingElement{
    public static int KthMissingElement(int a[], int n, int k){
        HashSet<Integer> set = new HashSet<Integer>();
        for (int num : a) {
            set.add(num);
        }
        int missingCount = 0;
        int i = a[0];
        while (i <= a[n - 1]) {
            if (!set.contains(i)) {
                missingCount++;
                if (missingCount == k) {
                    return i;
                }
            }
            i++;
        }
        return -1;
    }
    public static void main(String[] args){
        int[] num = {32, 59, 77};
        int k = 1;
        int n = 3;
        System.out.println(KthMissingElement(num, n, k));
    }
}