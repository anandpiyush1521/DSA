

import java.util.*;
import java.lang.*;
import java.io.*;

class Driver
{
    public static void main(String args[]) 
	{ 
	    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int []a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            
            int  m= sc.nextInt();
            int []b = new int[m];
            for (int i = 0; i < m; i++) b[i] = sc.nextInt();
            
            double res = new GFG().medianOfArrays(n, m, a, b);
            
            if (res == (int)res) System.out.println ((int)res);
            else System.out.println (res);
        }
    		
	} 
}



class GFG 
{ 
    static double medianOfArrays(int n, int m, int a[], int b[]) 
    {
        // Your Code Here
        int[] arr=new int[m+n];
        int k=0;
        for(int i=0;i<a.length;i++){
            arr[k]=a[i];
            k++;
        }
        for(int j=0;j<b.length;j++){
            arr[k]=b[j];
            k++;
        }
        Arrays.sort(arr);
        if(arr.length%2==0){
            int mid=0+(arr.length-0)/2;
            return (double)(arr[mid]+arr[mid-1])/2;
        }
        else{
            int mid=0+(arr.length-0)/2;
            return arr[mid];
        }
    }
}
