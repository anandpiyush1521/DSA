import java.util.*;
class Node{
    Node left, right;
    int data;
    public Node(int data) {
        this.data = data;
    }
}
public class KthLargestSuminaBST{
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
    public static Long kthLargestLevelSum(Node root, int k){
        List<Long> list = new ArrayList<Long>();
        Queue<Node> qu = new LinkedList<Node>();
        qu.add(root);
        while(!qu.isEmpty()){
            int len = qu.size();
            long sum=0;
            for(int i=0; i<len; i++){
                Node curr = qu.poll();
                sum += (long)curr.data;
                if(curr.left != null){
                    qu.add(curr.left);
                }
                if(curr.right != null){
                    qu.add(curr.right);
                }
            }
            list.add(sum);
        }
        return getLargestLevelSum(list, k); 
    }
    public static Long getLargestLevelSum(List<Long> list, int k){
        Collections.sort(list);
        
        return list.get(list.size() - k);
    }
    public static void main(String[] args){
        sc = new Scanner(System.in);
        Node root = createTree();
        int k = 4;
        System.out.println(kthLargestLevelSum(root, k));
    }
}