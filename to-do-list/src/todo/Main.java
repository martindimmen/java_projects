package todo;
import java.util.Scanner;
import todo.model.Todo;

public class Main {
    public static void main(String[] args) {
        Todo list = new Todo();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("What do you want to do?");
            System.out.println("1. Display Tasks");
            System.out.println("2. Add Task");
            System.out.println("3. Complete Task");
            System.out.println("4. Remove Task");

            if (!input.hasNextInt()) {
                input.nextLine();
                System.out.println("Please enter a number.");
                continue;
            }

            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    list.displayTasks();
                    break;
                case 2:
                    System.out.println("Add description to task: ");
                    String description = input.nextLine();
                    list.addTask(description);
                    list.displayTasks(); 
                    break;
                case 3:
                    System.out.println("Choose which task should be marked as complete");
                    list.displayTasks();  
                    if (input.hasNextInt()) {
                        int taskNumberComplete = input.nextInt();
                        list.completeTask(taskNumberComplete - 1);
                        input.nextLine();  
                        list.displayTasks();  
                    } else {
                        input.nextLine();  
                        System.out.println("Invalid input. Please enter a valid task number.");
                    }
                    break;
                case 4:
                    System.out.println("Choose which task should be removed");
                    list.displayTasks(); 
                    if (input.hasNextInt()) {
                        int taskNumberRemove = input.nextInt();
                        list.removeTask(taskNumberRemove - 1);
                        input.nextLine();  
                        list.displayTasks(); 
                    } else {
                        input.nextLine();  
                        System.out.println("Invalid input. Please enter a valid task number.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                    break;
            }
        }
    }
}
