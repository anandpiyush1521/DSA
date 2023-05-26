import java.util.*;
class Node{
    Node left, right;
    int data;
    public Node(int data){
        this.data = data;
    }
}
public class LevelOrderTraversal{
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
    public static List<Integer> printLevelOrder(Node root){
        List<Integer> list = new ArrayList<Integer>();
        Queue<Node> qu = new LinkedList<Node>();
        qu.add(root);
        while(!qu.isEmpty()){
            Node curr = qu.poll();
            // if(curr == null){
            //     if(qu.isEmpty()){
            //         return;
            //     }
            //     qu.add(null);
            //     System.out.println("");
            // }
            // System.out.print(curr.data + " ");
            list.add(curr.data);
            if(curr.left != null){
                qu.add(curr.left);
            }
            if(curr.right != null){
                qu.add(curr.right);
            }
        }
        return list;
    }
    public static void main(String[] args){
        sc = new Scanner(System.in);
        Node root = createTree();
        System.out.println(printLevelOrder(root));
    }
}