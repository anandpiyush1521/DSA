import java.util.*;
public class matrix{
    public static void main(String[] args){

        // int[][] arr = new int[3][1];
        // arr[0][0] = 3;
        // arr[1][0] =5;
        // arr[2][0] =6;

        // int max=1;

        // int x=0;
        // int y=0;
        
        // for(; x<arr.length; x++){
        //     for(; y<arr[x].length; y++){
        //         if(arr[x][y] > max){
        //             max = arr[x][y];
        //             System.out.println(max);
        //         }
        //         System.out.println(arr[x][y]);
        //     }
        // }
        // System.out.println(arr[x][y]);
        int[] arr  = {1, 2, 3, 4, 6, 2, 4, 6, 1, 7};
        // ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        for(int i=0; i<arr.length; i++){
            if(map.get(arr[i]) == 2){
                set.add(arr[i]);
            }
        }

        ArrayList<Integer> list = new ArrayList<>(set);

        System.out.println(list);
    }
}