import java.util.*;
public class demo{
    public static int findKey(int input1, int input2, int input3){
        List<Integer> list = Arrays.asList(input1, input2, input3);
        List<Integer> res = new ArrayList<>();
        int sm1=Integer.MAX_VALUE;
        int sm2=Integer.MAX_VALUE;
        int sm3=Integer.MAX_VALUE;
        int sm4=Integer.MAX_VALUE;
        for(int i=0; i<list.size(); i++){
            sm1 = Math.min(sm1, thDigit(list.get(i)));
        }
        res.add(sm1);
        for(int i=0; i<list.size(); i++){
            sm2 = Math.min(sm2, hunDigit(list.get(i)));
        }
        res.add(sm2);
        for(int i=0; i<list.size(); i++){
            sm3 = Math.min(sm3, tenDigit(list.get(i)));
        }
        res.add(sm3);
        for(int i=0; i<list.size(); i++){
            sm4 = Math.min(sm4, unitDigit(list.get(i)));
        }
        res.add(sm4);

        int ans = listToNumber(res);

        return ans;
        
    }

    public static int thDigit(int num){
        return num/1000;
    }
    public static int hunDigit(int num){
        return (num/100)%10;
    }
    public static int tenDigit(int num){
        return (num/10)%10;
    }
    public static int unitDigit(int num){
        return num%10;
    }
    public static int listToNumber(List<Integer> list) {
        int result = 0;
        for (int digit : list) {
            result = result * 10 + digit;
        }
        return result;
    }

    public static void main(String[] args){
        int x = 3521;
        int b = 2455;
        int c = 1352;

        System.out.println(findKey(x, b, c));

    }
}