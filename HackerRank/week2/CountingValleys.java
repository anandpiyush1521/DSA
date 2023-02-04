import java.util.*;
public class CountingValleys{
    public static int countingValleys(int steps, String path){
        int level=0, valleys=0;
        for(int i=0; i<steps; i++){
            if(path.charAt(i) == 'U'){
                level++;
            }else if(path.charAt(i) == 'D'){
                if(level == 0) valleys++;

                level--;
            }
        }
        return valleys;
    }
    public static void main(String[] args){
        int steps = 8;
        String path = "UDDDUDUU";
        System.out.println(countingValleys(steps, path));
    }
}