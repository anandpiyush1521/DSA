import java.util.*;
class Node{
    Node left, right;
    int data;
    public Node(int data){
        this.data = data;
    }
}
public class LeftViewOfBST{
    static Scanner sc = null;
    public static Node createTree(){
        Node root = null;
        System.out.println("Enter data: ");
        int data = sc.nextInt();

        if(data == -1) return null;
        root = new Node(data);
        System.out.println("Enter left for: "+data);
        root.left = createTree();
        System.out.println("Enter right for: "+data);
        root.right = createTree();
        
        return root;
    }
    // public static void printLeftViewUtil(Node root, ArrayList<Node> list, int level){
    //     if(root == null) return;

    //     if(list.get(level) == null){
    //         list.add(root);
    //     }
    //     printLeftViewUtil(root.left, list, level+1);
    //     printLeftViewUtil(root.right, list, level+1);
    // }
    // public static void printLeftView(Node root){
    //     ArrayList<Node> list = new ArrayList<Node>();
    //     printLeftViewUtil(root, list, 0);
    //     for(Node curr: list){
    //         System.out.print(curr.data + " ");
    //     }
    // }
    public static void printLeftView(Node root){
        Queue<Node> qu = new LinkedList<Node>();
        qu.add(root);
        while(!qu.isEmpty()){
            int len = qu.size();
            for(int i=0; i<len; i++){
                Node curr = qu.poll();
                if(i == 0){
                    System.out.print(curr.data + " ");
                }
                if(curr.left != null){
                    qu.add(curr.left);
                }
                if(curr.right != null){
                    qu.add(curr.right);
                }
            }
        }
    }
    public static void main(String[] args){
        sc = new Scanner(System.in);
        Node root = createTree();
        printLeftView(root);
    }
}