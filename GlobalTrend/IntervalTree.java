import java.util.*;

class Interval {
    int low, high;

    Interval(int low, int high) {
        this.low = low;
        this.high = high;
    }

    @Override
    public String toString() {
        return "[" + low + ", " + high + "]";
    }
}

class Node {
    Interval interval;
    int max;
    Node left, right;

    Node(Interval interval) {
        this.interval = interval;
        this.max = interval.high;
        this.left = this.right = null;
    }
}

class IntervalTree {
    private Node root;

    public IntervalTree() {
        this.root = null;
    }

    // Insert a new interval 
    public void insertInterval(int start, int end) {
        Interval newInterval = new Interval(start, end);
        root = insert(root, newInterval);
    }

    // Delete an interval 
    public void deleteInterval(int start, int end) {
        Interval delInterval = new Interval(start, end);
        root = deleteNode(root, delInterval);
    }

    // Find all intervals that overlap 
    public List<Interval> findOverlappingIntervals(int start, int end) {
        Interval target = new Interval(start, end);
        List<Interval> result = new ArrayList<>();
        findOverlappingIntervals(root, target, result);
        return result;
    }

    // Insert an interval 
    private Node insert(Node node, Interval interval) {
        if (node == null) {
            return new Node(interval);
        }

        int low = node.interval.low;

        if (interval.low < low) {
            node.left = insert(node.left, interval);
        } else {
            node.right = insert(node.right, interval);
        }

        node.max = Math.max(node.max, interval.high);
        return node;
    }

    // Delete an interval 
    private Node deleteNode(Node node, Interval interval) {
        if (node == null) {
            return null;
        }

        if (interval.low < node.interval.low) {
            node.left = deleteNode(node.left, interval);
        } else if (interval.low > node.interval.low) {
            node.right = deleteNode(node.right, interval);
        } else {
            if (interval.high == node.interval.high) {
                if (node.left == null) {
                    return node.right;
                } else if (node.right == null) {
                    return node.left;
                } else {
                    Node minLargerNode = getMin(node.right);
                    node.interval = minLargerNode.interval;
                    node.right = deleteNode(node.right, minLargerNode.interval);
                }
            } else {
                if (interval.high < node.interval.high) {
                    node.left = deleteNode(node.left, interval);
                } else {
                    node.right = deleteNode(node.right, interval);
                }
            }
        }

        node.max = Math.max(node.interval.high, 
                           Math.max(getMax(node.left), getMax(node.right)));
        return node;
    }

    //minimum interval 
    private Node getMin(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    //maximum value in the subtree
    private int getMax(Node node) {
        if (node == null) {
            return Integer.MIN_VALUE;
        }
        return node.max;
    }

    //intervals overlapping with the target interval in the subtree rooted at node
    private void findOverlappingIntervals(Node node, Interval target, List<Interval> result) {
        if (node == null) {
            return;
        }

        if (doOverlap(node.interval, target)) {
            result.add(node.interval);
        }

        if (node.left != null && node.left.max >= target.low) {
            findOverlappingIntervals(node.left, target, result);
        }

        findOverlappingIntervals(node.right, target, result);
    }

    // Check if two intervals overlap
    private boolean doOverlap(Interval i1, Interval i2) {
        return i1.low <= i2.high && i2.low <= i1.high;
    }

    public static void main(String[] args) {
        IntervalTree tree = new IntervalTree();
        
        tree.insertInterval(15, 20);
        tree.insertInterval(10, 30);
        tree.insertInterval(17, 19);
        tree.insertInterval(5, 20);
        tree.insertInterval(12, 15);
        tree.insertInterval(30, 40);

        System.out.println("Overlapping intervals with [14, 16]: " + tree.findOverlappingIntervals(14, 16));
        System.out.println("Overlapping intervals with [21, 23]: " + tree.findOverlappingIntervals(21, 23));

        tree.deleteInterval(10, 30);
        System.out.println("Overlapping intervals with [14, 16] after deletion: " + tree.findOverlappingIntervals(14, 16));
    }
}
