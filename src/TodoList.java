import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
    private static ArrayList<String> tasks = new ArrayList<String>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;
        while (!quit) {
            System.out.println("Please Choose an Option\n");
            System.out.println("1. Update a task\n");
            System.out.println("2. Add a task\n");
            System.out.println("3. Remove a task\n");
            System.out.println("4. Remove all tasks\n");
            System.out.println("5. Quit\n");
            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    UpdateTask();
                    break;
                case "2":
                      AddTask();
                    break;
                case "3":
                    RemoveTask();
                    break;
                case "4":
                    RemoveAllTask();
                    break;
                case "5":
                    System.out.println("\nQuit\n");
                    quit = true;
                    break;
                default:
                    System.out.println("\nInvalid Option\n");
            }
        }
        scanner.close();
    }

    private static void UpdateTask(){
        if (tasks.size() == 0){
            System.out.println("\n0 Tasks\n");
        }
        else{
            System.out.println("\nTasks: ");
            for (int i = 0; i < tasks.size(); i++){
                System.out.println((i+1) + ". " + tasks.get(i));
            }
            System.out.println("\n");
        }
    }

    private static void AddTask(){
        System.out.println("\nAdd Task: ");
        String task = scanner.nextLine();
        tasks.add(task);
        System.out.println("\nTask Added\n");
    }

    private static void RemoveTask(){
        System.out.println("\nChoose index of Task to Remove: ");
        int index = scanner.nextInt();
        scanner.nextLine();
        if (index >= 0 && index < tasks.size()){
            String task = tasks.remove(index-1);
            System.out.println("\nTask Removed\n");
        }
        else{
            System.out.println("\nInvalid Index\n");
        }
    }

    private static void RemoveAllTask(){
        tasks.clear();
        System.out.println("\nAll Tasks Removed\n");
    }
}
