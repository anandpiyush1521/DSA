import java.util.*;
public class MigratoryBirds{
    public static int migratoryBirds(List<Integer> arr){
        int max=0;
        int[] res = new int[6];
        for(int val: arr){
            res[val]++;
            max = Math.max(max, res[val]);
        }
        for(int i=0; i<res.length; i++){
            if(res[i] == max){
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args){
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(3);

        System.out.println(migratoryBirds(arr));
    }
}