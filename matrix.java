public class matrix{
    public static void main(String[] args){

        int[][] arr = new int[3][1];
        arr[0][0] = 3;
        arr[1][0] =5;
        arr[2][0] =6;

        int max=1;

        int x=0;
        int y=0;
        
        for(; x<arr.length; x++){
            for(; y<arr[x].length; y++){
                if(arr[x][y] > max){
                    max = arr[x][y];
                    System.out.println(max);
                }
                System.out.println(arr[x][y]);
            }
        }
        System.out.println(arr[x][y]);
    }
}