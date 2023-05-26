import java.util.*;
class Node{
    Node left, right;
    int data;
    public Node(int data){
        this.data = data;
    }
}
public class ValidBST{

    // Make PREORDER of list and if it is present in sorted form then BST is valid otherwise it is not.

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
    public static boolean isBST(Node root){
        if(inOrder(root)){
            return true;
        }else{
            return false;
        }
    }
    public static boolean inOrder(Node root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(root == null) return true;

        Stack<Node> stack = new Stack<Node>();
        Node curr = root;
        while(curr!=null || !stack.isEmpty()) {
            while(curr!=null){
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            list.add(curr.data);
            curr = curr.right;
        }
        List<Integer> res = new ArrayList<Integer>(list);
        Collections.sort(res);
        if(isListEqual(list, res)){
            return true;
        }else{
            return false;
        }
    }
    public static boolean isListEqual(List<Integer> list1, List<Integer> list2){
        if(list1.equals(list2)){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        sc = new Scanner(System.in);
        Node root = createTree();
        System.out.println("The result are: "+isBST(root));
    }
}