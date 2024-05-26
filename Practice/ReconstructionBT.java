import java.util.*;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class ReconstructionBT {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length == 0 || postorder.length == 0) return null;
        int ip = inorder.length - 1;
        int pp = postorder.length - 1;

        Stack<TreeNode> stack = new Stack<>();
        TreeNode prev = null;

        TreeNode root = new TreeNode(postorder[pp]);
        stack.push(root);
        pp--;

        while (pp >= 0) {
            TreeNode curr = new TreeNode(postorder[pp]);
            while (!stack.isEmpty() && stack.peek().data == inorder[ip]) {
                prev = stack.pop();
                ip--;
            }

            if (prev != null) {
                prev.left = curr;
            } else if (!stack.isEmpty()) {
                TreeNode currTop = stack.peek();
                currTop.right = curr;
            }

            stack.push(curr);
            prev = null;
            pp--;
        }
        return root;
    }

    public static void printPreOrder(TreeNode node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        printPreOrder(node.left);
        printPreOrder(node.right);
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] inorder = new int[n];
        int[] postorder = new int[n];

        for(int i=0; i<n; i++){
            inorder[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            postorder[i] = sc.nextInt();
        }

        ReconstructionBT treeBuilder = new ReconstructionBT();
        TreeNode root = treeBuilder.buildTree(inorder, postorder);
        
        printPreOrder(root);
    }
}
