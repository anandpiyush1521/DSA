// Level order traversal => BFS

import java.util.*;
class Node{
    int data;
    Node left, right;
    public Node(int data){
        this.data = data;
    }
}
public class Second_LevelOrder{
    static Scanner sc = null;
    public static Node createTree(){
        Node root = null;
        System.out.print("Enter data: ");
        int data = sc.nextInt();

        if(data == -1){
            return null;
        }
        root = new Node(data);
        System.out.println("Enter left for "+ data);
        root.left = createTree();
        System.out.println("Enter right for "+data);
        root.right = createTree();

        return root;
    }
    public static void LevelOrderTraversal(Node root){
        Queue<Node> qu = new LinkedList<>();
        qu.add(root);
        while(!qu.isEmpty()){
            Node curr = qu.poll();

            System.out.print(curr.data + " ");
            if(curr.left != null){
                qu.add(curr.left);
            }
            if(curr.right != null){
                qu.add(curr.right);
            }
        }
    }
    public static void main(String[] args){
        sc = new Scanner(System.in);
        Node root = createTree();

        LevelOrderTraversal(root);
    }
}