import java.util.*;
import java.io.*;

class DisjointSet{
    List<Integer> rank = new ArrayList<Integer>();
    List<Integer> parent = new ArrayList<Integer>();
    List<Integer> size = new ArrayList<Integer>(); //for union by size
    
    public DisjointSet(int n){
        for(int i=0; i<=n; i++){
            rank.add(0);
            parent.add(i);
            size.add(1);
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

    //Disjoint Set Union by Rank
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

    //Disjoint Set Union by Size
    public void unionBySize(int u, int v){
        int ulp_u = findUPar(u);
        int ulp_v = findUPar(v);
        if(ulp_u == ulp_v){
            return;
        }
        
        if(size.get(ulp_u) < size.get(ulp_v)){
            parent.set(ulp_u, ulp_v);
            size.set(ulp_v, size.get(ulp_v)+size.get(ulp_u));
        }else{
            parent.set(ulp_v, ulp_u);
            size.set(ulp_u, size.get(ulp_u)+size.get(ulp_v));
        }
    }
}
public class DisjointSetUnion {
    public static void main(String[] args){
        DisjointSet ds = new DisjointSet(7);
        // ds.unionByRank(1, 2);
        // ds.unionByRank(2, 3);
        // ds.unionByRank(4, 5);
        // ds.unionByRank(6, 7);
        // ds.unionByRank(5, 6);

        // //check if 3 and 7 belongs to smae component or not
        // if(ds.findUPar(3) == ds.findUPar(7)){
        //     System.out.println("same");
        // }else{
        //     System.out.println("not same");
        // }

        // ds.unionByRank(3, 7);
        // //now check if 3 and 7 belongs to smae component or not
        // if(ds.findUPar(3) == ds.findUPar(7)){
        //     System.out.println("same");
        // }else{
        //     System.out.println("not same");
        // }
        ds.unionBySize(1, 2);
        ds.unionBySize(2, 3);
        ds.unionBySize(4, 5);
        ds.unionBySize(6, 7);
        ds.unionBySize(5, 6);

        //check if 3 and 7 belongs to smae component or not
        if(ds.findUPar(3) == ds.findUPar(7)){
            System.out.println("same");
        }else{
            System.out.println("not same");
        }

        ds.unionBySize(3, 7);
        //now check if 3 and 7 belongs to smae component or not
        if(ds.findUPar(3) == ds.findUPar(7)){
            System.out.println("same");
        }else{
            System.out.println("not same");
        }
    }
}
