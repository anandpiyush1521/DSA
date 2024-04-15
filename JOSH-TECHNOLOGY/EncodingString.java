import java.util.*;
class EncodingString {
    
    public static void main(String[] args) {
        String str1 = "john";
        String str2 = "johny";
        String str3 = "janardhan";
        String[] ans1 = new String[3];
        String[] ans2 = new String[3];
        String[] ans3 = new String[3];
        ans1 = getParts(str1);
        ans2 = getParts(str2);
        ans3 = getParts(str3);
        
        StringBuilder sb1 = new StringBuilder(ans1[0] + ans2[2] + ans3[1]);
        StringBuilder sb2 = new StringBuilder(ans1[2] + ans2[0] + ans3[2]);
        StringBuilder sb3 = new StringBuilder(ans1[2] + ans2[1] + ans3[0]);
        
        String res1 = sb1.toString();
        String res2 = sb2.toString();
        String res3 = sb3.toString();
        
        for (int i = 0; i < res3.length(); i++) {
            char c = res3.charAt(i);
            
            // Toggle case of characters
            if (Character.isLowerCase(c)) {
                c = Character.toUpperCase(c);
            } else if (Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);
            }
            
            // Update the character in the string
            // res3.setCharAt(i, c);
        }
        
        
        System.out.println(res2);
        
    }
    public static String[] getParts(String str) {
		int len = str.length();
		String[] parts = new String[3];
		int partLen = len / 3;
		
        //System.out.println("str: " + str + " len: " + len + " partLen: " + partLen);
		//System.out.println(new String("HelloWorld").substring(3, 6));
		
		if (len % 3 == 0) {
			parts[0] = str.substring(0, partLen);
			parts[1] = str.substring(partLen, 2 * partLen);
			parts[2] = str.substring(2 * partLen, len);
// 			System.out.println("case 0: " + parts[0] + " " + parts[1] + " " + parts[2]);
		} else if (len % 3 == 1) {
			parts[0] = str.substring(0, partLen);
			parts[1] = str.substring(partLen, 2 * partLen + 1);
			parts[2] = str.substring(2 * partLen + 1, len);
// 			System.out.println("case 1: " + parts[0] + " " + parts[1] + " " + parts[2]);
		} else if (len % 3 == 2) {
			parts[0] = str.substring(0, partLen + 1);
			parts[1] = str.substring(partLen + 1, 2 * partLen + 1);
			parts[2] = str.substring(2 * partLen + 1, len);
// 			System.out.println("case 2: " + parts[0] + " " + parts[1] + " " + parts[2]);
		}
		return parts;

	}
}
