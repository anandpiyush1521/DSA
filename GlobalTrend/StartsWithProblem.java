import java.util.*;

class Node {
    Node[] children;
    boolean eow;

    public Node() {
        children = new Node[26];
        eow = false;
    }
}

public class StartsWithProblem {
    static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (curr.children[index] == null) {
                curr.children[index] = new Node();
            }
            if (i == word.length() - 1) {
                curr.children[index].eow = true;
            }
            curr = curr.children[index];
        }
    }

    public static boolean search(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (curr.children[index] == null) {
                return false;
            }
            curr = curr.children[index];
        }
        return curr.eow;
    }

    public static boolean startsWith(String prefix) {
        Node curr = root;
        for (int i = 0; i < prefix.length(); i++) {
            int index = prefix.charAt(i) - 'a';
            if (curr.children[index] == null) {
                return false;
            }
            curr = curr.children[index];
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the operations
        System.out.println("Enter operations (e.g., [\"Trie\", \"insert\", \"search\", \"search\", \"startsWith\", \"insert\", \"search\"]):");
        String[] operations = scanner.nextLine().replaceAll("[\\[\\]\"]", "").split(",\\s*");

        // Read the arguments
        System.out.println("Enter arguments (e.g., [[], [\"apple\"], [\"apple\"], [\"app\"], [\"app\"], [\"app\"], [\"app\"]]):");
        String argsInput = scanner.nextLine();
        String[] arguments = argsInput.split("],\\s*\\[");

        List<Object> results = new ArrayList<>();
        StartsWithProblem trie = new StartsWithProblem();

        for (int i = 0; i < operations.length; i++) {
            String operation = operations[i].trim();
            String argument = arguments[i].replaceAll("[\\[\\]\"]", "").trim();

            switch (operation) {
                case "Trie":
                    results.add(null); // "Trie" operation initialization, do nothing
                    break;
                case "insert":
                    trie.insert(argument);
                    results.add(null); // Insert operation doesn't return anything
                    break;
                case "search":
                    boolean searchResult = trie.search(argument);
                    results.add(searchResult);
                    break;
                case "startsWith":
                    boolean startsWithResult = trie.startsWith(argument);
                    results.add(startsWithResult);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown operation: " + operation);
            }
        }

        // Print the results
        System.out.println("Output: " + results);
    }
}
