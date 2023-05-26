import java.util.*;
class Node{
    Node left, right;
    int data;
    public Node(int data){
        this.data = data;
    }
}
public class DiameterOfBST{
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
    public static int diameter(Node root){
        if(root == null) return 0;
        int diameterLeft = diameter(root.left);
        int diameterRight = diameter(root.right);
        int temp = Math.max(diameterLeft, diameterRight);

        int curr = height(root.left)+height(root.right)+1;

        return Math.max(curr, temp);

    }
    public static int height(Node root){
        if(root == null) return 0;

        return Math.max(height(root.left), height(root.right))+1;
    }
    public static void main(String[] args){
        sc = new Scanner(System.in);
        Node root = createTree();
        System.out.println("The diameter of BST is: "+diameter(root));
    }
}