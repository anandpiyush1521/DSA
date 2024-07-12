import java.util.*;

public class LruCache {
    Node head = new Node(0, 0);
    Node tail = new Node(0, 0);
    Map<Integer, Node> map = new HashMap<>();
    int capacity;

    public LruCache(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;    
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            Node data = map.get(key);
            //move data to top
            //remove node
            remove(data);
            //insert node
            insert(data);

            return data.value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        // if value is already present remove it
        if(map.containsKey(key)){
            remove(map.get(key));
        }
        //If cache is full
        // remove least recently used
        //tail.prev => least recently used

        if(capacity == map.size()){
            remove(tail.prev);
        }

        insert(new Node(key, value));
    }
    public void remove(Node node){
        //remove the node from the map using the key, not the node itself. 
        map.remove(node.key);
        
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    public void insert(Node node){
        map.put(node.key, node);

        Node headNext = head.next;
        head.next = node;
        node.prev = head;

        headNext.prev = node;
        node.next = headNext;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the capacity of the cache: ");
        int capacity = scanner.nextInt();
        LruCache cache = new LruCache(capacity);
        
        while (true) {
            System.out.print("Enter command (put/get/exit): ");
            String command = scanner.next();
            
            if (command.equals("exit")) {
                break;
            }
            
            if (command.equals("put")) {
                System.out.print("Enter key: ");
                int key = scanner.nextInt();
                System.out.print("Enter value: ");
                int value = scanner.nextInt();
                cache.put(key, value);
                System.out.println("Inserted (" + key + ", " + value + ")");
            } else if (command.equals("get")) {
                System.out.print("Enter key: ");
                int key = scanner.nextInt();
                int value = cache.get(key);
                if (value != -1) {
                    System.out.println("Value for key " + key + " is " + value);
                } else {
                    System.out.println("Key " + key + " not found.");
                }
            } else {
                System.out.println("Invalid command.");
            }
        }
        
        scanner.close();
    }
}

class Node {
    Node prev, next;
    int key, value;

    Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}
