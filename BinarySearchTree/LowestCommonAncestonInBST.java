import java.util.*;
class Node{
    Node left, right;
    int data;
    public Node(int data){
        this.data = data;
    }
}
public class LowestCommonAncestonInBST{
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
    public static Node LowestCommonAncestor(Node root, int a, int b){
        if(root == null) return null;
        if(root.data==a || root.data==b) return root;

        Node left = LowestCommonAncestor(root.left, a, b);
        Node right = LowestCommonAncestor(root.right, a, b);

        if(left == null) return right;

        if(right == null) return left;

        return root;
    }
    public static void main(String[] args){
        sc = new Scanner(System.in);
        Node root = createTree();
        int a = 1;
        int b = 3;
        Node ans = LowestCommonAncestor(root, a, b);
        System.out.println("The lowest common ancestor is: "+ans.data);
    }
}