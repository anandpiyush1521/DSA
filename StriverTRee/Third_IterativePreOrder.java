import java.util.*;
class Node{
    Node left, right;
    int data;
    public Node(int data){
        this.data = data;
    }
}
public class Third_IterativePreOrder{
    static Scnner sc =  null;
    public static Node createTree(){
        Node root = null;
        System.out.print("Emter data: ");
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
    public static void iterativePreOrder(Node root){
        if(node == null){
            return;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while(stack.empty() == false){
            Node curr = stack.peek();
            System.out.print(curr.data+ " ");
            stack.pop();

            if(curr.right != null){
                stack.push(curr.right);
            }
            if(curr.left != null){
                stack.push(curr.left);
            }
        }
    }
    public static void main(String[] args){
        sc = new Scanner(System.in);

        Node root = createTree();
        iterativePreOrder(root);
    }
}