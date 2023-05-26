import java.util.*;
class Node{
    Node left, right;
    int data;
    public Node(int data){
        this.data = data;
    }
}
public class BinaryTree{
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
    public static void inOrder(Node root){
        if(root == null) return;

        inOrder(root.left);
        System.out.print(root.data+ " ");
        inOrder(root.right);
    }
    public static void main(String[] args){
        sc = new Scanner(System.in);
        //createTree();

        Node root = createTree();
        inOrder(root);
    }
}