import java.util.*;

public class TaskManagementSystem {
    private Stack<Task> inProgressTasks;
    private Queue<Task> waitingTasks;
    private LinkedList<Task> allTasks;

    public TaskManagementSystem() {
        inProgressTasks = new Stack<>();
        waitingTasks = new LinkedList<>();
        allTasks = new LinkedList<>();
    }

    // Stack methods for "In Progress" tasks
    public void pushTask(Task task) {
        inProgressTasks.push(task);
    }

    public Task popTask() {
        Task task = inProgressTasks.pop();
        task.setCompleted(true);
        return task;
    }

    public Task peekTask() {
        return inProgressTasks.peek();
    }

    // Queue methods for "Waiting" tasks
    public void enqueueTask(Task task) {
        waitingTasks.add(task);
    }

    public Task dequeueTask() {
        return waitingTasks.poll();
    }

    public Task viewNextTask() {
        return waitingTasks.peek();
    }

    // LinkedList methods for all tasks
    public void addTask(Task task) {
        allTasks.add(task);
    }

    public void removeTask(Task task) {
        allTasks.remove(task);
    }

    public void displayAllTasks() {
        for (Task task : allTasks) {
            System.out.println(task);
        }
    }

    public static void main(String[] args) {
        TaskManagementSystem tms = new TaskManagementSystem();

        // Create tasks
        Task task1 = new Task("Task 1", "Description 1");
        Task task2 = new Task("Task 2", "Description 2");
        Task task3 = new Task("Task 3", "Description 3");

        // Add tasks to the system
        tms.addTask(task1);
        tms.addTask(task2);
        tms.addTask(task3);

        // Enqueue tasks to waiting list
        tms.enqueueTask(task1);
        tms.enqueueTask(task2);
        tms.enqueueTask(task3);

        // Display all tasks
        System.out.println("All Tasks:");
        tms.displayAllTasks();

        // Move tasks from waiting to in progress
        tms.pushTask(tms.dequeueTask());
        tms.pushTask(tms.dequeueTask());

        // Display in progress tasks
        System.out.println("\nIn Progress Tasks:");
        System.out.println(tms.peekTask());

        // Complete a task
        Task completedTask = tms.popTask();
        System.out.println("\nCompleted Task:");
        System.out.println(completedTask);

        // Display all tasks again to show updated status
        System.out.println("\nAll Tasks After Completion:");
        tms.displayAllTasks();
    }
}