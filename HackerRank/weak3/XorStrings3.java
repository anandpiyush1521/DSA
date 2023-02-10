import java.util.*;
public class XorStrings3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        System.out.println(strings_xor(a, b));
    }
    public static String strings_xor(String a, String b){
        String ans ="";
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i) == b.charAt(i)){
                ans += "0";
            }else{
                ans += "1";
            }
        }
        return ans;
    }
}