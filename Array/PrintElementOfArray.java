public class PrintElementOfArray{

    public void printArray(int[] array){
        int n = array.length;
        for(int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void arrayDemo(){
        int[] newarray = new int[4];
        newarray[0] = 45;
        newarray[1] = 57;
        newarray[2] = 17;
        newarray[3] = 79;
        printArray(newarray);
    }


    public static void main(String[] args){
        PrintElementOfArray arr = new PrintElementOfArray();
        arr.printArray(new int[] { 1, 2, 3, 4 });
        arr.arrayDemo();
    }
}