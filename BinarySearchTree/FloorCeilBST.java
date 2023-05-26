import java.util.*;
class Node{
    Node left, right;
    int data;
    public Node(int data){
        this.data = data;
    }
}
public class FloorCeilBST{
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
    public static int floor(Node root, int key){
        if(root == null) return 0;
        int ans = Integer.MAX_VALUE;
        while(root != null){
            if(root.data == key) return root.data;

            if(root.data > key){
                root = root.left;
            }else{
                ans = root.data;
                root = root.right;
            }
        }
        return ans;
    }
    public static int Ceil(Node root, int key){
        if(root == null) return 0;
        int ans = Integer.MIN_VALUE;
        while(root != null){
            if(root.data == key){
                return root.data;
            }
            if(root.data > key){
                ans = root.data;
                root = root.left;
            }else{
                root = root.right;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        sc = new Scanner(System.in);
        Node root = createTree();
        int key = 25;
        System.out.println("The floor value = "+floor(root, key));
        System.out.println("");
        System.out.println("The Ceil value = "+Ceil(root, key));
    }
}