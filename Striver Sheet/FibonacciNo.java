public class FibonacciNo{

    public static long[] getFibonacci(int n){
        long x = n;
        if(x == 0){
            System.out.print("0");
        }
        long[] table = new long[x+1];
        table[1] = 1;
        for(int i = 2; i < table.length; i++){
            table[i] = table[i-1] + table[i-2];
            System.out.print(table[x] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        getFibonacci(5);
    }
}