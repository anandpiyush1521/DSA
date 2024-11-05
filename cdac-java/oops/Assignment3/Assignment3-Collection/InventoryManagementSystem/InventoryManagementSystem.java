import java.util.HashMap;
import java.util.Map;

public class InventoryManagementSystem {
    private Map<Integer, Item> inventory;

    public InventoryManagementSystem() {
        inventory = new HashMap<>();
    }

    // Add a new item to the inventory
    public void addItem(int itemId, Item item) {
        if (inventory.containsKey(itemId)) {
            throw new IllegalArgumentException("Item with ID " + itemId + " already exists.");
        }
        inventory.put(itemId, item);
    }

    // Update the quantity of an existing item
    public void updateQuantity(int itemId, int newQuantity) {
        Item item = inventory.get(itemId);
        if (item == null) {
            throw new IllegalArgumentException("Item with ID " + itemId + " does not exist.");
        }
        item.setQuantity(newQuantity);
    }

    // Retrieve the details of an item based on its ID
    public Item getItem(int itemId) {
        Item item = inventory.get(itemId);
        if (item == null) {
            throw new IllegalArgumentException("Item with ID " + itemId + " does not exist.");
        }
        return item;
    }

    // Remove an item from the inventory
    public void removeItem(int itemId) {
        if (!inventory.containsKey(itemId)) {
            throw new IllegalArgumentException("Item with ID " + itemId + " does not exist.");
        }
        inventory.remove(itemId);
    }

    // Display the entire inventory
    public void displayInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            for (Map.Entry<Integer, Item> entry : inventory.entrySet()) {
                System.out.println("Item ID: " + entry.getKey() + ", " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();

        // Add items to the inventory
        ims.addItem(101, new Item("Widget", 50, 19.99));
        ims.addItem(102, new Item("Gadget", 30, 29.99));

        // Display the inventory
        System.out.println("Inventory after adding items:");
        ims.displayInventory();

        // Update the quantity of an item
        ims.updateQuantity(101, 75);

        // Retrieve an item
        Item item = ims.getItem(101);
        System.out.println("\nRetrieved Item: " + item);

        // Remove an item
        ims.removeItem(102);

        // Display the inventory after removal
        System.out.println("\nInventory after removing an item:");
        ims.displayInventory();
    }
}