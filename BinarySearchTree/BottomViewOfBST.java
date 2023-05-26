import java.util.*;
class Node{
    Node left, right;
    int data;
    public Node(int data){
        this.data = data;
    }
}
public class BottomViewOfBST{
    static Scanner sc = null;
    public static Node createTree(){
        Node root = null;
        System.out.println("Enter data: ");
        int data = sc.nextInt();
        if(data == -1) return null;

        root = new Node(data);
        System.out.println("Enter left for "+data);
        root.left = createTree();
        System.out.println("Enter right for "+data);
        root.right = createTree();

        return root;
    }
    public static ArrayList<Integer> bottomView(Node root){
        Queue<Pair> qu = new ArrayDeque<Pair>();
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        qu.add(new Pair(0, root));
        while(!qu.isEmpty()){
            Pair curr = qu.poll();
            map.put(curr.hd, curr.node.data);
            if(curr.node.left != null){
                qu.add(new Pair(curr.hd-1, curr.node.left));
            }
            if(curr.node.right != null){
                qu.add(new Pair(curr.hd+1, curr.node.right));
            }
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            list.add(entry.getValue());
        }
        return list;
    }
    public static class Pair{
        int hd;
        Node node;
        public Pair(int hd, Node node){
            this.hd = hd;
            this.node = node;
        }
    }
    public static void main(String[] args){
        sc = new Scanner(System.in);
        Node root = createTree();
        System.out.println(bottomView(root));
    }
}