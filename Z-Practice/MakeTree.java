import java.util.*;
class TreeNode{
    int data;
    TreeNode left, right;

    public TreeNode(int data){
        this.data = data;
    }
}
public class MakeTree{
    public static void insert(TreeNode root, int val){
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);

        while(!qu.isEmpty()){
            TreeNode curr = qu.poll();
            if(curr.left == null){
                curr.left = new TreeNode(val);
                return;
            }else{
                qu.add(curr.left);
            }

            if(curr.right == null){
                curr.right = new TreeNode(val);
                return;  
            }else{
                qu.add(curr.right);        
            }
        }
    }
    public static TreeNode buildTree(ArrayList<Integer> list){
        TreeNode root = new TreeNode(list.get(0));
        for(int i=1; i<list.size(); i++){
            insert(root, list.get(i));
        }
        return root;
    }
    public static ArrayList<Integer> leftView(TreeNode root){
        ArrayList<Integer> list = new ArrayList<>();
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);

        while(!qu.isEmpty()){
            int len = qu.size();
            for(int i=0; i<len; i++){
                TreeNode curr = qu.poll();
                if(i == 0){
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
        return list;
    }
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(5, 2, -4));

        TreeNode node = buildTree(list);

        ArrayList<Integer> ans = leftView(node);

        System.out.println(ans);
    }
}