import java.util.*;
public class FirstNegativeInteger{
    public static long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        int k=0;
        long[] arr=new long[N-K+1];
        for(int i=0;i<=N-K;i++)
        {
            int j;
            for(j=i;j<K+i;j++)
                if(A[j]<0)
                {
                    arr[k]=A[j];
                    k++;
                    break;
                }
                if(j==K+i)
                {
                    arr[k]=0;
                    k++;
                }
            }
        return arr;
    }
    public static void main(String[] args){
        long[] arr = {-8, 2, 3, -6, 10};
        int n = 5;
        int k = 2;
        System.out.println(printFirstNegativeInteger(arr, n, k));
    }
}