import java.util.*;
public class FindIndex{
    public static int[] findIndex(int a[], int N, int key){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<N; i++){
            if(a[i] == key){
                list.add(i);
            }
        }
        int[] ans = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 5};
        int N= 6;
        int key = 5;
        System.out.print(findIndex(arr, N, key));
    }
}