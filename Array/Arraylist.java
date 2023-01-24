public class Arraylist{

    public void printArray(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void arrayDemo(){
        int[] myArray = new int[5];
        myArray[0] = 5;
        myArray[1] = 4;
        myArray[2] = 10;
        myArray[4] = 45;

        myArray[3] = 54;
        myArray[1] = 87;

        //myArray[5] = 100;
        printArray(myArray);
        System.out.println(myArray.length);
        //Accesing last elemt of an array
        System.out.println(myArray[myArray.length - 1]);

        int[] array = {1, 2, 3, 4};
        printArray(array);
    }

    public static void main(String[] args){
        Arraylist arr = new Arraylist();
        arr.arrayDemo();
    }
}