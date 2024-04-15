import java.util.*;
class Node{
    Node left, right;
    int data;

    public Node(int data){
        this.data = data;
    }
}

public class TreeBlanced{
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
    public static boolean isBalanced(Node root){
        //code here
        if(root == null) return true;

        int left = height(root.left);
        int right = height(root.right);

        int diff = Math.abs(left - right);
        if(diff > 1) return false;
        else return true;

        // boolean leftBalanced = isBalanced(root.left);
        // boolean rightBalanced = isBalanced(root.right);

        // return leftBalanced && rightBalanced;
    }
    public static int height(Node root){
        if(root == null){
            return 0;
        }

        return Math.max(height(root.left), height(root.right))+1;
    }
    public static void main(String[] args){
        sc = new Scanner(System.in);

        Node root = createTree();
        if(isBalanced(root)){
            System.out.println("Tree is BALANCED");
        }else{
            System.out.println("Tree is UNBALANCED");
        }
    }
}