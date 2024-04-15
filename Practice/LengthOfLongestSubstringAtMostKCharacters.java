package Practice;
import java.util.*;

public class LengthOfLongestSubstringAtMostKCharacters {
    public static int maxNormalSubstring(String p, Set<Character> q, int k, int n){
        if(k==0){
            return 0;
        }
        int count=0;
        int left=0, right=0;
        int ans=0;
        while(right < n){
            while(right<n && count<=k){
                if(q.contains(p.charAt(right))){
                    if(count+1 > k){
                        break;
                    }else{
                        count++;
                    }
                }
                right++;
                if(count <= k){
                    ans = Math.max(ans, right-left);
                }
            }
            while(left < right){
                left++;
                if(q.contains(p.charAt(left-1)))
                    count--;
                if(count < k)
                    break;
                }
        }
        return ans;
    }
    public static void main(String[] args){
        String p = "normal";
        Set<Character> Q = new HashSet<>();
 
        // Construction of set
        Q.add('a');
        Q.add('f');
        Q.add('g');
        Q.add('r');
     
        int K = 2;
        int N = p.length();
    }    
}
