import java.util.Scanner;

/**
 * Provides a command-line interface for interacting with the to-do list.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList toDoList = new ToDoList(); // Create a new ToDoList instance
        
        System.out.println("Welcome to the To-Do List Application!");

        while (true) {
            // Display menu options
            System.out.println("\nChoose an option:");
            System.out.println("1. Add a new task");
            System.out.println("2. Mark a task as completed");
            System.out.println("3. Remove a task");
            System.out.println("4. View all tasks");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            // Handle user's choice
            switch (choice) {
                case 1:
                    // Add a new task
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    toDoList.addTask(description);
                    System.out.println("Task added.");
                    break;

                case 2:
                    // Mark a task as completed
                    System.out.print("Enter task number to mark as completed: ");
                    int completeIndex = scanner.nextInt() - 1; // Convert to zero-based index
                    toDoList.markTaskAsCompleted(completeIndex);
                    System.out.println("Task marked as completed.");
                    break;

                case 3:
                    // Remove a task
                    System.out.print("Enter task number to remove: ");
                    int removeIndex = scanner.nextInt() - 1; // Convert to zero-based index
                    toDoList.removeTask(removeIndex);
                    System.out.println("Task removed.");
                    break;

                case 4:
                    // Display all tasks
                    System.out.println("\nYour To-Do List:");
                    toDoList.displayTasks();
                    break;

                case 5:
                    // Exit the application
                    System.out.println("Exiting the application. Goodbye!");
                    scanner.close(); // Close the scanner resource
                    return;

                default:
                    // Handle invalid choices
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
