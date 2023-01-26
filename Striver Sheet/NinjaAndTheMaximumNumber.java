/* Ninja is a brilliant student in the class and hence his teacher assigned him a problem.
He has been given a long integer ‘A’ containing only digits 5 and 7. He has been asked to tell the maximum number that can be achieved by changing at most one digit in the ‘A’.
Note: After the operation, the resultant number should have only digits 5 and 7.
Your task is to find and return the maximum resultant number after at most one digit changing operation.
Example :
Input: ‘A’ = 5755
Output: 7755

We will change the first 5 to 7 and it will give the maximum possible number here.
Detailed explanation ( Input/output format, Notes, Constraints, Images )

Sample Input 1 :
2
7557
77
Sample Output 1 :
7757
77
Explanation For Sample Input 1 :
For test case 1:
We will change the second digit from 5 to 7 and it will give the maximum possible number here.

For test case 2:
The number is already the maximum possible here no need to do any operation.
Sample Input 2 :
2
55557
757575
Sample Output 2 :
75557
777575  */

import java.util.*;
public class NinjaAndTheMaximumNumber{
    public static String maximumNumber(String a) {
        // Write your code here.
        int n = a.length();
        char[] arr = a.toCharArray();
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == '5') {
                if (!flag) {
                    arr[i] = '7';
                    flag = true;
                }
            }
        }
        return new String(arr);
    }
    public static void main(String[] args){
        String s = "5755";
        System.out.println(maximumNumber(s));
    }
}