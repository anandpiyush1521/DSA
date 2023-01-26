

import java.util.*;
public class TotalDecoding{
    public static int CountWays(String str)
    {
        int mod=1000000007;
        if(str.length()==0 || str.charAt(0)=='0') return 0;
       
        if(str.length()==1) return 1;
       
        int count1=1,count2=1;
        for(int i=1;i<str.length();i++){
            int count=0;
            int d=str.charAt(i)-'0';
            int dd=(str.charAt(i-1)-'0')*10+d;
            
            if(d>0) count+=(count2%mod);
            
            if(dd>=10 && dd<=26) count+=(count1%mod);
            
            count1=count2%mod;
            count2=count%mod;      
        }
        return count2%mod;
    }
    public static void main(String[] args){
        String s = "123";
        System.out.println(CountWays(s));
    }
}