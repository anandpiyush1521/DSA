public class MinValueInArray{

    public static void printArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int findMininum(int[] arr){

        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("Invalid array");
        }
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args){
        int[] myarr = {5, 9, 3, 15, 1, 2};
        printArray(myarr);

        MinValueInArray marr = new MinValueInArray();
        System.out.println(marr.findMininum(myarr));
    }
}