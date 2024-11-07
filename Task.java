/**
 * Represents a single task in the to-do list.
 */
public class Task {
    private String description; // Task description
    private boolean isCompleted; // Task completion status

    // Constructor to create a new task with a description
    public Task(String description) {
        this.description = description;
        this.isCompleted = false; // Default: task is not completed
    }

    // Getter for task description
    public String getDescription() {
        return description;
    }

    // Getter to check if task is completed
    public boolean isCompleted() {
        return isCompleted;
    }

    // Mark the task as completed
    public void markAsCompleted() {
        isCompleted = true;
    }

    // Custom string representation of the task
    @Override
    public String toString() {
        return (isCompleted ? "[✓] " : "[ ] ") + description;
    }
}
