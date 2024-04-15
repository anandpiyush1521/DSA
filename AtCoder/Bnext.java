import java.util.*;
public class Bnext{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(nextLargest(N, arr));
    }
    public static int nextLargest(int N, int[] arr){
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i: arr){
            if(!list.contains(i)){
                list.add(i);
            }
        }
        if(list.size() <= 1){
            return -1;
        }
        return list.get(list.size()-2);
    }
}