import java.util.*;
class Node{
    // Node left, right;
    Node parent;
    int data;
    public Node(int data){
        this.data = data;
        this.parent = null;
    }
}
public class JuspyTree{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int T = sc.nextInt(); // no of testcase
        for(int i=0; i<T; i++){
            int N = sc.nextInt(); //No of nodes

            int[] parentValues = new int[N];
            for(int j=0; j<N; j++){
                parentValues[j] = sc.nextInt();
            }

            Node[] nodes = new Node[N];
            for(int j=0; j<N; j++){
                nodes[i] = new Node(i);
            }

            for(int j=0; j<N; j++){
                if(parentValues[j] == -1){
                    nodes[j].parent = null;
                }else{
                    nodes[j].parent = nodes[parentValues[i]];
                }
            }
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();

            Node ansector  = findNearestAncestor(nodes[x1], nodes[x2]);

            if(ansector == null){
                System.out.println("-1");
            }else{
                System.out.println(ansector.data);
            }
        }

    }
    public static Node findNearestAncestor(Node node1, Node node2){
        Set<Node> ansector = new HashSet<>();
        while(node1 != null){
            ansector.add(node1);
            node1 = node1.parent;
        }
        while(node2 != null){
            if(ansector.contains(node2)){
                return node2;
            }
            node2 = node2.parent;
        }
        return null;
    }
}