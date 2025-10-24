import com.todolist.TodoList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TodoList todoList = new TodoList();
        int choice;

        do {
            System.out.println("\n--- To-Do List Menu ---");
            System.out.println("1. Add Task");
            System.out.println("2. Update Task");
            System.out.println("3. Delete Task");
            System.out.println("4. Mark Task as Done");
            System.out.println("5. List All Tasks");
            System.out.println("6. List Tasks by Status");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter description: ");
                    String desc = sc.nextLine();
                    todoList.addTask(title, desc);
                    break;
                case 2:
                    System.out.print("Enter Task ID to update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new title: ");
                    String newTitle = sc.nextLine();
                    System.out.print("Enter new description: ");
                    String newDesc = sc.nextLine();
                    todoList.updateTask(updateId, newTitle, newDesc);
                    break;
                case 3:
                    System.out.print("Enter Task ID to delete: ");
                    int deleteId = sc.nextInt();
                    sc.nextLine();
                    todoList.deleteTask(deleteId);
                    break;
                case 4:
                    System.out.print("Enter Task ID to mark as done: ");
                    int doneId = sc.nextInt();
                    sc.nextLine();
                    todoList.markAsDone(doneId);
                    break;
                case 5:
                    todoList.lsitAllTask();
                    break;
                case 6:
                    System.out.print("Enter status (Pending/Done): ");
                    String status = sc.nextLine();
                    todoList.listTaskByStatus(status);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
        while (choice != 0);
        sc.close();

    }
}