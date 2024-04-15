import java.util.*;
class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
    }
}

public class ReverseOddLevelsOfBinaryTree {
    public static void insert(TreeNode root, int val) {
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);

        while (!qu.isEmpty()) {
            TreeNode curr = qu.poll();
            if (curr.left == null) {
                curr.left = new TreeNode(val);
                return;
            } else {
                qu.add(curr.left);
            }
            if (curr.right == null) {
                curr.right = new TreeNode(val);
                return;
            } else {
                qu.add(curr.right);
            }
        }
    }

    public static TreeNode buildTree(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return null;
        }

        TreeNode root = new TreeNode(list.get(0));

        for (int i = 1; i < list.size(); i++) {
            insert(root, list.get(i));
        }

        return root;
    }

    // public static TreeNode reverseOddLevels(TreeNode root) {
    //     if (root == null) {
    //         return null;
    //     }

    //     ArrayList<ArrayList<Integer>> levelOrder = new ArrayList<>();
    //     Queue<TreeNode> qu = new LinkedList<>();
    //     qu.add(root);
    //     int level = 0;

    //     while (!qu.isEmpty()) {
    //         int len = qu.size();
    //         ArrayList<Integer> temp = new ArrayList<>();
    //         for (int i = 0; i < len; i++) {
    //             TreeNode curr = qu.poll();
    //             temp.add(curr.data);

    //             if (curr.left != null) {
    //                 qu.add(curr.left);
    //             }
    //             if (curr.right != null) {
    //                 qu.add(curr.right);
    //             }
    //         }
    //         if (level % 2 != 0) {
    //             Collections.reverse(temp);
    //         }
    //         levelOrder.add(temp);
    //         level++;
    //     }

    //     // Reconstruct tree with reverse level order traversal
    //     Queue<TreeNode> queue = new LinkedList<>();
    //     TreeNode newRoot = new TreeNode(levelOrder.get(0).get(0));
    //     queue.add(newRoot);

    //     int index = 1;

    //     while (!queue.isEmpty() && index < levelOrder.size()) {
    //         int size = queue.size();
    //         for (int i = 0; i < size; i++) {
    //             TreeNode node = queue.poll();

    //             if (index < levelOrder.size()) {
    //                 node.left = new TreeNode(levelOrder.get(index).get(0));
    //                 queue.add(node.left);
    //                 index++;
    //             }
    //             if (index < levelOrder.size()) {
    //                 node.right = new TreeNode(levelOrder.get(index).get(0));
    //                 queue.add(node.right);
    //                 index++;
    //             }
    //         }
    //     }
    //     return newRoot;
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        ArrayList<Integer> tree = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int val = sc.nextInt();
            tree.add(val);
        }

        TreeNode root = buildTree(tree);

        // TreeNode ans = reverseOddLevels(root);

        // ArrayList<Integer> answer = levelOrderTraversal(ans);

        // for (int val : answer) {
        //     System.out.print(val + " ");
        // }
        List<Integer> list = leftView(root);
        System.out.println(list);
    }

    public static List<Integer> leftView(TreeNode node){
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(node);

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

    // public static ArrayList<Integer> levelOrderTraversal(TreeNode root) {
    //     ArrayList<Integer> list = new ArrayList<>();
    //     Queue<TreeNode> q = new LinkedList();
    //     q.add(root);

    //     while (!q.isEmpty()) {
    //         TreeNode temp = q.poll();
    //         list.add(temp.data);

    //         if (temp.left != null) {
    //             q.add(temp.left);
    //         }
    //         if (temp.right != null) {
    //             q.add(temp.right);
    //         }
    //     }
    //     return list;
    // }
}
