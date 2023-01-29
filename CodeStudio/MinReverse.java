/* You are given an array 'A' of length 'N'. You can reverse any subarray of this array of any length ( between 1 to 'N' ) any number of times (possibly 0).
Return the minimum possible value of A[i] * A[i+1] for any 'i' (1 to 'N' - 1 ) after reversing any subarray, any number of times.
A subarray is a contiguous part of an array.
For Example:-
Let 'N' = 5, 'A' = [2, 1, 3, 1, 4]
We can reverse subarray from 3 to 4 (1-based indexing).
'A' becomes = [2, 1, 1, 3, 4]
'A[1]' * 'A[2]' = 2.
'A[2]' * 'A[3]' = 1.
'A[3]' * 'A[4]' = 3.
'A[4]' * 'A[5]' = 12.
Our answer is 1.
Detailed explanation ( Input/output format, Notes, Constraints, Images )

Sample Input 1:-
2
3
3 1 2
2
3 5
Sample Output 1:-
2
15
Explanation Of Sample Input 1:-
First test case:-
We don't need to reverse any subarray.
'A' becomes = [3, 1, 2]
'A[1]' * 'A[2]' = 3.
'A[2]' * 'A[3]' = 2.
Our answer is 2.
Second test case:-
We can reverse subarray from 1 to 2 (1-based indexing).
'A' becomes = [5, 3]
'A[1]' * 'A[2]' = 15.
Our answer is 15.   */
 
import java.util.*;
public class MinReverse{
    public static int minReverse(int[] a) {
        int n = a.length;
        int[] res = Arrays.copyOf(a, n);
        Arrays.sort(res);
        int minProduct = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            int j = n - 1;
            while (j > i && res[j] >= res[i] * res[i + 1]) {
                j--;
            }
            if (j > i) {
                int left = i;
                int right = j;
                while (left < right) {
                    int temp = res[left];
                    res[left] = res[right];
                    res[right] = temp;
                    left++;
                    right--;
                }
            }
            int product = res[i] * res[i + 1];
            if (product < minProduct) {
                minProduct = product;
            }
        }
        return minProduct;
    }
    public static void main(String[] args){
        int[] arr = {3, 1, 2};
        System.out.println(minReverse(arr));
    }
}