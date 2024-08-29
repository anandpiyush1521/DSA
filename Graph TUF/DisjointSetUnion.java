import java.util.*;
import java.io.*;

//Disjoint Set Union by Rank
class DisjointSet{
    List<Integer> rank = new ArrayList<Integer>();
    List<Integer> parent = new ArrayList<Integer>();
    
    public DisjointSet(int n){
        for(int i=0; i<=n; i++){
            rank.add(0);
            parent.add(i);
        }
    }

    //find ultimate parent
    public int findUPar(int node){
        if(node == parent.get(node)){
            return node;
        }
        int ulp = findUPar(parent.get(node));
        parent.set(node, ulp);
        return parent.get(node);
    }

    public void unionByRank(int u, int v){
        int ulp_u = findUPar(u);
        int ulp_v = findUPar(v);
        if(ulp_u == ulp_v){
            return;
        }
        if(rank.get(ulp_u) < rank.get(ulp_v)){
            parent.set(ulp_u, ulp_v);
        }else if(rank.get(ulp_v) < rank.get(ulp_u)){
            parent.set(ulp_v, ulp_u);
        }else{
            parent.set(ulp_v, ulp_u);
            int rankU = rank.get(ulp_u);
            rank.set(ulp_u, rankU+1);
        }
    }
}
public class DisjointSetUnion {
    public static void main(String[] args){
        DisjointSet ds = new DisjointSet(7);
        ds.unionByRank(1, 2);
        ds.unionByRank(2, 3);
        ds.unionByRank(4, 5);
        ds.unionByRank(6, 7);
        ds.unionByRank(5, 6);

        //check if 3 and 7 belongs to smae component or not
        if(ds.findUPar(3) == ds.findUPar(7)){
            System.out.println("same");
        }else{
            System.out.println("not same");
        }

        ds.unionByRank(3, 7);
        //now check if 3 and 7 belongs to smae component or not
        if(ds.findUPar(3) == ds.findUPar(7)){
            System.out.println("same");
        }else{
            System.out.println("not same");
        }
    }
}
