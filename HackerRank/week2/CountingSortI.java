import java.util.*;
public class CountingSortI{
    public static List<Integer> countingSort(List<Integer> arr){
    // public static int[] countingSort(int[] arr){
        int[] freqArr = new int[100];
        Arrays.fill(freqArr, 0);
        List<Integer> sortedArr = new ArrayList<>();

        for (int i : arr) {
            freqArr[i]++;
        }

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < freqArr[i]; j++) {
                sortedArr.add(i);
            }
        }
        return sortedArr;
    }
    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(1);
        arr.add(3);
        arr.add(2);
        arr.add(1);
        //int[] arr = {1,1,3,2,1};
        
        System.out.println(countingSort(arr));
    }
}