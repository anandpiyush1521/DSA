import java.util.*;
public class SalesByMatch{
    public static int sockMerchant(int n, List<Integer> ar){
        List<Integer> list = new ArrayList<Integer>();
        int pairs = 0;
        for(int sock: ar){
            if(!list.contains(sock)){
                list.add(sock);
            }else{
                pairs++;
                list.remove(sock);
            }
        }
        return pairs;
    }
    public static void main(String[] args){
        List<Integer> ar = new ArrayList<Integer>();
        ar.add(10);
        ar.add(20);
        ar.add(20);
        ar.add(10);
        ar.add(10);
        ar.add(30);
        ar.add(50);
        ar.add(10);
        ar.add(20);

        int n = 9;
        System.out.println(sockMerchant(n, ar));
    }
}