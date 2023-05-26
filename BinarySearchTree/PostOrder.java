import java.util.*;
class Node{
    Node left, right;
    int data;
    public Node(int data){
        this.data = data;
    }
}
public class PostOrder{
    static Scanner sc = null;
    public static Node createTree(){
        Node root = null;
        System.out.println("Enter data: ");
        int data = sc.nextInt();
        if(data == -1) return null;
        root = new Node(data);
        System.out.println("Enter left for : "+data);
        root.left = createTree();
        System.out.println("Enter right for : "+data);
        root.right = createTree();

        return root;
    }

    public static void postOrder(Node root){
        if(root == null) return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    // CHECKING FOR THE TREE IS BST OR NOT. 
    // public static void inOrder(Node root){
    //     ArrayList<Integer> list = new ArrayList<Integer>();
    //     if(root == null) return;
    //     inOrder(root.left);
    //     list.add(root.data);
    //     inOrder(root.right);

    //     if(isEqual(list)){
    //         System.out.println("TRUE");
    //     }else{
    //         System.out.println("FALSE");
    //     }
    // }
    // public static boolean isEqual(ArrayList<Integer> res){
    //     ArrayList<Integer> list = new ArrayList<Integer>(res);
    //     Collections.sort(list);
    //     for(int i=0; i<list.size(); i++){
    //         if(list.get(i) == res.get(i)) return true;
    //     }
    //     return false;
    // }
    // public static boolean isBST(Node root){
    //     inOrder(root);

    // }
    public static void main(String[] args){
        sc = new Scanner(System.in);
        Node root = createTree();

        postOrder(root);
    }
}