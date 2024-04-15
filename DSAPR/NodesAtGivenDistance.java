import java.util.*;
class Node{
    Node left, right;
    int data;

    public Node(int data){
        this.data = data;
    }
}
public class NodesAtGivenDistance{
    static Scanner sc = null;
    public static Node createTree(){
        Node root = null;
        System.out.println("Enter data: ");
        int data = sc.nextInt();

        if(data == -1) return null;
        root = new Node(data);
        System.out.println("Enter left for: "+data);
        root.left = createTree();
        System.out.println("Enter right for: "+data);
        root.right = createTree();

        return root;
    }
    public static void markParent(Node root, Map<Node, Node> parent_track, int target) {
        Queue<Node> qu = new LinkedList<>();
        qu.offer(root);
        while (!qu.isEmpty()) {
            Node curr = qu.poll();
            if (curr.left != null) {
                parent_track.put(curr.left, curr);
                qu.offer(curr.left);
            }
            if (curr.right != null) {
                parent_track.put(curr.right, curr);
                qu.offer(curr.right);
            }
        }
    }

    public static ArrayList<Integer> KDistanceNodes(Node root, int target, int k) {
        Map<Node, Node> parent_track = new HashMap<>();
        markParent(root, parent_track, target);

        Map<Node, Boolean> visited = new HashMap<>();
        Queue<Node> qu = new LinkedList<>();

        Node Target = findTarget(root, target);

        qu.offer(Target);
        visited.put(Target, true);
        int curr_level = 0;

        while (!qu.isEmpty()) {
            int size = qu.size();

            if (curr_level == k) {
                break;
            }
            curr_level++;

            for (int i = 0; i < size; i++) {
                Node curr = qu.poll();

                if (curr.left != null && visited.get(curr.left) == null) {
                    visited.put(curr.left, true);
                    qu.offer(curr.left);
                }
                if (curr.right != null && visited.get(curr.right) == null) {
                    visited.put(curr.right, true);
                    qu.offer(curr.right);
                }
                if (parent_track.get(curr) != null && visited.get(parent_track.get(curr)) == null) {
                    visited.put(parent_track.get(curr), true);
                    qu.offer(parent_track.get(curr));
                }
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        while (!qu.isEmpty()) {
            Node curr = qu.poll();
            ans.add(curr.data);
        }
        return ans;
    }

    public static Node findTarget(Node root, int target) {
        if (root == null) return null;
        if (root.data == target) return root;

        Node left = findTarget(root.left, target);
        if (left != null) {
            return left;
        }
        Node right = findTarget(root.right, target);
        if (right != null) {
            return right;
        }
        return null;
    }
    public static void main(String[] args){
        sc = new Scanner(System.in);
        Node root = createTree();

        int target = 6;
        int k = 4;

        System.out.println(KDistanceNodes(root, target, k));
    }
}