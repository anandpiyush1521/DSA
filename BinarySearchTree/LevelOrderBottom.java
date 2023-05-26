import java.util.*;
class Node{
    Node left, right;
    int data;
    public Node(int data){
        this.data = data;
    }
}
public class LevelOrderBottom{
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
    public static List<List<Integer>> levelOrderBottom(Node root){
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Queue<Node> qu = new LinkedList<Node>();
        qu.add(root);
        while(!qu.isEmpty()){
            int size = qu.size();
            List<Integer> levellist = new ArrayList<Integer>();
            for(int i = 0; i < size; i++){
                Node curr = qu.poll();
                levellist.add(curr.data);
                if(curr.left != null){
                    qu.add(curr.left);
                }
                if(curr.right != null){
                    qu.add(curr.right);
                }
            }
            list.add(levellist);
        }
        Collections.reverse(list);
        return list;
    }
    public static void main(String[] args){
        sc = new Scanner(System.in);
        Node root = createTree();
        System.out.println(levelOrderBottom(root));
    }
}