import java.util.*;
class Node{
    Node left, right;
    int data;
    public Node(int data){
        this.data = data;
    }
}
public class DeleteNodeInBST{
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
    public static Node deleteNode(Node root, int key){
        if(root == null) return null;
        if(root.data < key){
            root.right = deleteNode(root.right, key);
        }else if(root.data > key){
            root.left = deleteNode(root.left, key);
        }else{
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }
            root.data = minValue(root.right);
            root.right = deleteNode(root.right, root.data);
        }
        return root;
    }
    public static int minValue(Node root){
        Node curr = root;
        while(curr.left != null){
            curr = curr.left;
        }
        return curr.data;
    }
    public static void main(String[] args){
        sc = new Scanner(System.in);
        Node root = createTree();
        int key = 50;
        System.out.println(deleteNode(root, key));
    }
}