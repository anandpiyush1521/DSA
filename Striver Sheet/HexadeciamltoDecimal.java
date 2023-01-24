import java.util.*;
public class HexadeciamltoDecimal{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String hexadec = sc.nextLine();
        String hs = "0123456789ABCDEF";
        hexadec = hexadec.toUpperCase();
        int dec = 0;
        for (int i = 0; i < hexadec.length(); i++){
            char c = hexadec.charAt(i);
            int n = hs.indexOf(c);
            dec = dec*16 + n;
        }

        System.out.println(dec);
    }
}