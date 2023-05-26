import java.util.*;
class Node{
    Node left, right;
    int data;
    public Node(int data){
        this.data = data;
    }
}
public class TwoSumBST{
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
    public static int isPairPresent(Node root, int target){
        if(root == null) return 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        Stack<Node> stack = new Stack<Node>();
        Node curr = root;
        while(curr != null || !stack.isEmpty()){
            while(curr != null){
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            list.add(curr.data);
            curr = curr.right;
        }
        Collections.sort(list);
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int num: list){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(int i=0; i<list.size(); i++){
            int temp = target - list.get(i);
            if(map.containsKey(temp) && map.get(temp) != i){
                return 1;
            }
        }
        return 0;

    }
    public static void main(String[] args){
        sc = new Scanner(System.in);
        Node root = createTree();
        int target = 2;
        System.out.println("The answer is: "+isPairPresent(root, target));
    }
}