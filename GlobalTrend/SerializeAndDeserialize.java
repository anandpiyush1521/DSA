import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class SerializeAndDeserialize {

    // Serializes a binary tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) {
            return "X";
        }

        Queue<TreeNode> queue = new LinkedList<>();
        StringBuilder serialized = new StringBuilder();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();

            if (current == null) {
                serialized.append("X,");
            } else {
                serialized.append(current.val).append(",");
                queue.add(current.left);
                queue.add(current.right);
            }
        }
        return serialized.toString();
    }

    // Deserializes the encoded string to a binary tree.
    public TreeNode deserialize(String data) {
        if (data.equals("X")) {
            return null;
        }

        String[] nodes = data.split(",");
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.parseInt(nodes[0]));
        queue.add(root);

        for (int i = 1; i < nodes.length; ) {
            TreeNode parent = queue.poll();

            if (!nodes[i].equals("X")) {
                TreeNode left = new TreeNode(Integer.parseInt(nodes[i]));
                parent.left = left;
                queue.add(left);
            }

            i++;

            if (!nodes[i].equals("X")) {
                TreeNode right = new TreeNode(Integer.parseInt(nodes[i]));
                parent.right = right;
                queue.add(right);
            }

            i++;
        }
        return root;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SerializeAndDeserialize codec = new SerializeAndDeserialize();

        System.out.println("Enter the tree nodes in level order (use X for null nodes):");
        String treeInput = scanner.nextLine();

        TreeNode root = codec.deserialize(treeInput);

        String serialized = codec.serialize(root);
        System.out.println("Serialized tree: " + serialized);

        TreeNode deserializedRoot = codec.deserialize(serialized);
        System.out.println("Deserialization complete.");

        printLevelOrder(deserializedRoot);
    }

    // Helper method to print the tree in level order
    private static void printLevelOrder(TreeNode root) {
        if (root == null) {
            System.out.println("Tree is empty.");
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            if (current == null) {
                System.out.print("X ");
            } else {
                System.out.print(current.val + " ");
                queue.add(current.left);
                queue.add(current.right);
            }
        }
        System.out.println();
    }
}
