import java.util.*;
class Node{
    int data;
    Node left, right;
    public Node(int data){
        this.data = data;
    }
}
public class VerticalTree {
    public ArrayList<Integer> verticalSum(Node root){
        ArrayList<Integer> ans = new ArrayList<>();
        if(root==null){
            return ans;
        }
        Map<Integer, Integer> map = new HashMap<>();
        Queue<Pair> qu = new LinkedList<>();
        qu.add(new Pair(0, root));
        
        while(!qu.isEmpty()){
            Pair curr = qu.poll();
            int hd = curr.hd;
            Node node = curr.node;
            
            map.put(hd, map.getOrDefault(hd, 0)+node.data);
            
            if(node.left != null){
                qu.add(new Pair(hd-1, node.left));
            }
            if(node.right != null){
                qu.add(new Pair(hd+1, node.right));
            }
            
        }
        // Extract sums from the map in sorted order of horizontal distance
        TreeMap<Integer, Integer> sortedMap = new TreeMap<>(map);
        for(int num: sortedMap.values()){
            ans.add(num);
        }
        return ans;
    }
}
class Pair{
    int hd;
    Node node;
    public Pair(int hd, Node node){
        this.hd = hd;
        this.node = node;
    }
}
