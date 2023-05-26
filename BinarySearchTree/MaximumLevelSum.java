import java.util.*;
class Node{
    Node left, right;
    int data;
    public Node(int data) {
        this.data = data;
    }
}
public class MaximumLevelSum{
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
    public static int maxLevelSum(Node root){
        int maxSum = Integer.MIN_VALUE;
        int maxLevel =-1;
        int level=1;
        Queue<Node> qu = new LinkedList<Node>();
        qu.add(root);
        while(!qu.isEmpty()){
            int len = qu.size();
            int sum = 0;
            for(int i = 0; i < len; i++){
                Node curr = qu.poll();
                sum += curr.data;
                if(curr.left != null){
                    qu.add(curr.left);
                }
                if(curr.right != null){
                    qu.add(curr.right);
                }
            }
            if(sum > maxSum){
                maxSum = sum;
                maxLevel = level;
            }
            level++;
        }
        return maxLevel;
    }
    public static void main(String[] args){
        sc = new Scanner(System.in);
        Node root = createTree();
        System.out.println(maxLevelSum(root));
    }
}