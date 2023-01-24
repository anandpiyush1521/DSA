import java.util.*;
public class DefanginganIPAddress1108{
    public static String defangIPaddr(String address){
        String ip = "";
        //HashSet<Character> set = new HashSet<>();
        char[] addr = address.toCharArray();
        for(int i = 0; i < addr.length; i++){
            if(addr[i] == '.'){
                ip+="[.]";
            }else{
                ip+=addr[i];
            }
        }
        return ip;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String address = sc.nextLine();
        System.out.print(defangIPaddr(address));
    }
}