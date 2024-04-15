import java.util.*;
class Node{
    Node left, right;
    int data;

    public Node(int data){
        this.data = data;
    }
}

public class MaxHeightOfBimaryTreeBetweenNode{
    static Scanner sc = null;
    public static Node createTree(){
        Node root = null;
        System.out.print("Enter data: ");
        int data = sc.nextInt();
        if(data == -1){
            return null;
        }

        root = new Node(data);
        System.out.println("Enter left for "+data);
        root.left = createTree();
        System.out.println("Enter right for "+data);
        root.right = createTree();

        return root;
    }
    public static int maxDepth(Node root){
        if(root == null){
            return 0;
        }

        return Math.max(maxDepth(root.left), maxDepth(root.right))+1;
    }
    public static void main(String[] args){
        sc = new Scanner(System.in);

        Node root = createTree();

        System.out.println("Maximum Depth of tree is: "+ maxDepth(root));
    }
}