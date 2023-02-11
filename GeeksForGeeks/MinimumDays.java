/* Given a string S of length N containing only lowercase alphabets. You are also given a permutation P of length N containing integers from 0 to N-1. In (i+1)'th day you can take the P[i] value of the permutation array and replace S[P[i]] with a '?'.
For example in day 1, we can choose index of permutation array is i=0 and replace S[P[0]] with '?'.
Similarly in day 2, we can choose index of permutation array is i=1. You can replace S[P[1]] with '?'.
Similarly in day 3,we can choose index of permutation array is i=2. You can replace S[P[2]] with '?'.
You have to tell the minimum number of days required, such that after it for all index i (0<=i<N-1), if S[i]!='?', then S[i]!=S[i+1].

Example 1:
Input:
N = 4
S = "aabb"
P[] = {2, 1, 3, 0}
Output: 2
Explanation: In day 1, we replace S[P[0]] with '?'. 
After that String S = "aa?b". As we can see S 
still has character 'a' at index 0 and 1.
In day 2, we replace S[P[1]] with '?'. After 
that String S = "a??b". As we can see the String 
has for all index i (0<=i<N-1), if S[i]!='?', then S[i]!=S[i+1].             */


import java.util.*;
public class MinimumDays{
    public static int getMinimumDays(int N, String S, int[] P) {
        char[] c = S.toCharArray();
        int ans=0;
        for(int i=0;i<N;i++) {
            int idx = P[i];
            if(idx==0) {
                if(idx+1<N && c[idx]==c[idx+1]) {
                    c[idx]='?';
                    ans = i+1;
                }
            } else if(idx==N-1) {
                if(idx-1>=0 && c[idx]==c[idx-1]) {
                    c[idx]='?';
                    ans = i+1;
                }
            } else {
                if(c[idx]==c[idx-1] || c[idx]==c[idx+1]) {
                    c[idx]='?';
                    ans = i+1;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int n = 4;
        String s = "aabb";
        int[] p = {2, 1, 3, 0};
        System.out.println(getMinimumDays(n, s, p));
    }
}