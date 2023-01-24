public class SecondMaxValueArray{

    public static void printArray(int[] array){
        int n = array.length;
        for(int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public int findSecondMaxValue(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            } else if(arr[i] > secondMax && arr[i]!=max){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    public static void main(String[] args){
        int[] arr = {12, 34, 2, 34, 34,  33, 1};
        printArray(arr);

        SecondMaxValueArray smax = new SecondMaxValueArray();
        System.out.println(smax.findSecondMaxValue(arr));
    }
}