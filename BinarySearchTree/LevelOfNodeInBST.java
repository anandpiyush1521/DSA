import java.util.*;
class Node{
    Node left, right;
    int data;
    public Node(int data){
        this.data = data;
    }
}
public class LevelOfNodeInBST{
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
    public static int getLevel(Node root, int data){
        int level=1;
        List<Integer> list = new ArrayList<Integer>();
        Queue<Node> qu = new LinkedList<Node>();
        qu.add(root);
        while(!qu.isEmpty()){
            int len = qu.size();
            for(int i = 0; i < len; i++){
                Node curr = qu.poll();
                if(curr.data == data){
                    list.add(level);
                }
                if(curr.left != null){
                    qu.add(curr.left);
                }
                if(curr.right != null){
                    qu.add(curr.right);
                }
            }
            level++;
        }
        if(list.size() == 0) return 0;

        return list.get(0);
    }  
    public static void main(String[] args){
        sc = new Scanner(System.in);
        Node root = createTree();
        System.out.println(getLevel(root, 4));
    }
}