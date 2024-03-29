import java.util.*;
public class LCSOfThreeStrings{
    public static int LCSof3(String A, String B, String C, int n1, int n2, int n3) { 
        // Set<Character> set1 = new HashSet<>();
        // Set<Character> set2 = new HashSet<>();
        // Set<Character> set3 = new HashSet<>();
        // for(char c: A.toCharArray()){
        //     set1.add(c);
        // }
        // for(char c: B.toCharArray()){
        //     set2.add(c);
        // }
        // for(char c: C.toCharArray()){
        //     set3.add(c);
        // }
        // set1.retainAll(set2);
        // set1.retainAll(set3);
        // StringBuilder sb = new StringBuilder();
        // for(char c: A.toCharArray()){
        //     sb.append(c);
        // }
        // String res = sb.toString();
        // return res.length();
        int [][][]dp=new int[n1+1][n2+1][n3+1];
        for(int i=1;i<=n1;i++){
            for(int j=1;j<=n2;j++){
                for(int k=1;k<=n3;k++){
                    if(A.charAt(i-1)==B.charAt(j-1) && B.charAt(j-1)==C.charAt(k-1)){
                        dp[i][j][k]=1+dp[i-1][j-1][k-1];
                    }else{
                        dp[i][j][k]=Math.max(dp[i-1][j][k],Math.max(dp[i][j-1][k],dp[i][j][k-1]));
                    }
                }
            }
        }
        return dp[n1][n2][n3];
    }
    public static void main(String[] args){
        String A = "abcd";
        String B = "efgh";
        String C = "ijkl";
        int n1 = A.length();
        int n2 = B.length();
        int n3 = C.length();

        System.out.println(LCSof3(A, B, C, n1, n2, n3));
    }
}