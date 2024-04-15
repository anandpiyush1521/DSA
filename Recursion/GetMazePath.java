import java.util.*;
public class GetMazePath{
    public static void main(String[] args){
        int dr = 4;
        int dc = 4;

        ArrayList<String> ans = getMazePath(0, 0, dr, dc);

        System.out.println(ans);
    }
    public static ArrayList<String> getMazePath(int sr, int sc, int dr, int dc){
        if(sr==dr-1 && sc==dc-1){
            ArrayList<String> temp = new ArrayList<>();
            temp.add("");
            return temp;
        }

        ArrayList<String> horizontalPaths = new ArrayList<>();
        ArrayList<String> verticalPaths = new ArrayList<>();

        if(sc < dc){
            horizontalPaths = getMazePath(sr, sc+1, dr, dc);
        }
        if(sr < dr){
            verticalPaths = getMazePath(sr+1, sc, dr, dc);
        }

        ArrayList<String> ans= new ArrayList<>();
        for(String hpath: horizontalPaths){
            ans.add("h"+hpath);
        }
        for(String vpath: verticalPaths){
            ans.add("v"+vpath);
        }
        return ans;
    }
}