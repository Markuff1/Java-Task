import java.util.ArrayList;
import java.util.List;

/**
 * Manages a list of tasks, allowing tasks to be added, removed, or marked as completed.
 */
public class ToDoList {
    private List<Task> tasks; // List to store tasks

    // Constructor initializes the tasks list
    public ToDoList() {
        tasks = new ArrayList<>();
    }

    /**
     * Adds a new task to the list.
     * @param description the description of the task
     */
    public void addTask(String description) {
        tasks.add(new Task(description));
    }

    /**
     * Marks a specified task as completed.
     * @param index the index of the task to mark as completed
     */
    public void markTaskAsCompleted(int index) {
        if (index >= 0 && index < tasks.size()) { // Check if index is valid
            tasks.get(index).markAsCompleted();
        } else {
            System.out.println("Invalid task number.");
        }
    }

    /**
     * Removes a task from the list by index.
     * @param index the index of the task to remove
     */
    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) { // Check if index is valid
            tasks.remove(index);
        } else {
            System.out.println("Invalid task number.");
        }
    }

    /**
     * Displays all tasks in the to-do list.
     */
    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Your to-do list is empty.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                // Display task index and description
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }
}
