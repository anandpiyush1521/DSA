import java.util.*;
class Node{
    Node left, right;
    int data;
    public Node(int data){
        this.data = data;
    }
}

public class SumTree{
    static Scanner sc =  null;
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
    static int ans = 0;
    public static boolean isSumTree(Node root){
        //code here
        if(root == null){
            return true;
        }
        if(root.left==null || root.right==null){
            return true;
        }

        getSum(root);
        if(ans == 1){
            return true;
        }else{
            return false;
        }
        

    }
    public static int getSum(Node root){
        if(root == null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return root.data;
        }
        int left = getSum(root.left);
        int right = getSum(root.right);
        if((left+right) == root.data){
            ans = 1;
        }
        return left+right+root.data;
    }

    public static void main(String[] args){
        sc = new Scanner(System.in);
        Node root = createTree();

        if(isSumTree(root)){
            System.out.println("tree is sumtree");
        }else{
            System.out.println("tree is not sumtree");
        }
    }
}