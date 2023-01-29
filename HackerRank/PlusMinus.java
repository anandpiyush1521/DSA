import java.util.*;
public class PlusMinus{
    public static void plusMinus(List<Integer> arr){
        // int posCount=0;
        // int negCount=0;
        // int zeroCount=0;
        List<Integer> posList=new ArrayList<Integer>();
        List<Integer> negList=new ArrayList<Integer>();
        List<Integer> zeroList=new ArrayList<Integer>();

        for(int i=0; i<arr.size(); i++){
            if(arr.get(i) > 0){
                posList.add(arr.get(i));
            }else if(arr.get(i) < 0){
                negList.add(arr.get(i));
            }else{
                zeroList.add(arr.get(i));
            }
        }
        //System.out.println(zeroList.size());
        double posAvg = (double)(posList.size())/(arr.size());
        double negAvg = (double)(negList.size())/(arr.size());
        double zeroAvg = (double)(zeroList.size())/(arr.size());
        System.out.println(posAvg);
        System.out.println(negAvg);
        System.out.println(zeroAvg);
    }
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(0);
        list.add(-1);
        list.add(-1);

        plusMinus(list);
    }
}