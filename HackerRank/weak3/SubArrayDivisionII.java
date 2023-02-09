import java.util.*;
public class SubArrayDivisionII{
    public static int birthday(List<Integer> s, int d, int m){
        int count=0;
        int n = s.size();
        for(int i=0; i<n-m+1; i++){
            int sum = 0;
            for(int j=i; j<i+m; j++){
                sum = sum + s.get(j);
            }
            if(sum == d){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(2);

        int d = 4;
        int m = 2;

        System.out.println(birthday(list, d, m));
    }
}