import java.util.*;
class Node{
    Node left, right;
    int data;
    public Node(int data){
        this.data = data;
    }
}
public class BSTtoDLL{
    static Scanner sc = null;
    static Node prev=null, head=null;
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
    public static Node convertToDll(Node root){
        if(root == null) return null;
        convertToDll(root.left);
        if(prev == null){
            head = root;
        }else{
            root.left = prev;
            prev.right = root;
        }
        prev = root;
        convertToDll(root.right);
        return head;
    }
    public static void main(String[] args){
        sc = new Scanner(System.in);
        Node root = createTree();
        Node dllHead = convertToDll(root);
        while(dllHead != null){
            System.out.print(dllHead.data + " ");
            dllHead = dllHead.right;
        }
    }
}