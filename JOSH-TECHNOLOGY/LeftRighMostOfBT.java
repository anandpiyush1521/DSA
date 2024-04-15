import java.util.*;
class Node{
    int data;
    Node left, right;
    public Node(int data){
        this.data = data;
    }
}
public class LeftRighMostOfBT{
    static Scanner sc = null;
    public static Node createTree(){
        Node root = null;
        System.out.println("Enter data ");
        int data = sc.nextInt();
        if(data == -1) return null;

        root = new Node(data);
        System.out.println("Enter left for "+data);
        root.left = createTree();
        System.out.println("Enter right for "+data);
        root.right=createTree();

        return root;
    }
    public static void printCorner(Node root){
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Node> qu = new LinkedList<>();
        qu.add(root);

        while(!qu.isEmpty()){
            int len = qu.size();
            for(int i=0; i<len; i++){
                Node curr = qu.poll();
                if(i==0 || i==len-1){
                    list.add(curr.data);
                }
                if(curr.left != null){
                    qu.add(curr.left);
                }
                if(curr.right != null){
                    qu.add(curr.right);
                }
            }
        }
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
    }
    public static void main(String[] args){
        sc =new Scanner (System.in);
        Node root = createTree();

        printCorner(root);
    }
}