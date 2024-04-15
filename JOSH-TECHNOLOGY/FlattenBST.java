import java.util.*;
class Node{
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
    }
}
public class FlattenBST{
    static Scanner sc = null;
    public static Node createTree(){
        Node root = null;
        System.out.println("Enter data: ");
        int data = sc.nextInt();
        root = new Node(data);
        System.out.println("Enter left for "+data);
        root.left = createTree();
        System.out.println("Enter right for "+data);
        root.right = createTree();

        return root;
    }
    public static void flatten(Node root){
        if(root == null){
            return;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        
        while(!stack.isEmpty()){
            Node curr = stack.pop();
            
            if(curr.right != null){
                stack.push(curr.right);
            }
            if(curr.left != null){
                stack.push(curr.left);
            }
            if(!stack.isEmpty()){
                curr.right = stack.peek();
            }
            curr.left = null;
        }
    }
    public static void main(String[] args){
        sc = new scanner(System.in);
        Node root = createTree();
    }
    
}