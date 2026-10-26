import java.util.*;
public class main{
    public static void main(String[] arg){
        System.out.println("=====================================");
        System.out.println("SMART DEADLINE MANAGER");
        System.out.println("=====================================");

        System.out.println("Enter your name: ");
        Scanner value = new Scanner(System.in);
        String userName = value.nextLine();
        System.out.println("Welcome, " + userName + "!");
        System.out.println("Manage your tasks in one place.");
        ArrayList<String> tasks = new ArrayList<>();
        //String task = value.nextLine();
        
        while(true){
        System.out.println("\n1. Add a task");
        System.out.println("2. View tasks");
        System.out.println("3. Delete a task");
        System.out.println("4. Mark a task as completed");
        System.out.println("5. Exit");
        System.out.println("Choose an option: ");
        int choice = value.nextInt();
        switch (choice) {
            case 1:
                value.nextLine();
                System.out.println("Enter your task:");
                //System.out.println("Complete java practice: ");
                String new_task = value.nextLine();
                System.out.println("Choose task priority:");
                System.out.println("1. High");
                System.out.println("2. Medium");
                System.out.println("3. Low");
                System.out.println("Enter priority(1-3)");
                int priorityChoice = value.nextInt();
                String priority = "";
                if(priorityChoice==1){
                    priority="HIGH";
                    
                }else if(priorityChoice==2){
                    priority = "MEDIUM";
                }else if(priorityChoice==3){
                    priority ="LOW";
                }else{
                    System.out.println("Invalid priority");
                    break;
                }
                tasks.add(new_task + " [" + priority + "]");
                System.out.println("Task added successfully!");
                break;
            case 2:
                System.out.println("View task");
                if(tasks.isEmpty()){
                    System.out.println("No tasks added yet! You need to enter task!!");
                }
                else{
                    System.out.println("Your task: " );
                    for(int i=0; i<tasks.size();i++){
                    System.out.println((i+1) + " " +tasks.get(i));
                    }
                }
                break;
            case 3:
                System.out.println("Delete task");
                if(tasks.isEmpty()){
                    System.out.println("No task need to select");
                }else{
                    System.out.println("Select deteting task: " );
                    for(int i=0;i<tasks.size();i++){
                    System.out.println((i+1) + " " +tasks.get(i));
                    }
                    System.out.println("Enter the task number to delete:");
                    int deleteChoice = value.nextInt();
                    if(deleteChoice>=1 && deleteChoice<=tasks.size()){
                    tasks.remove(deleteChoice - 1);
                    System.out.println("Task deleted successfully!");
                    }
                    else{
                        System.out.println("Invalid task number. Please try again.");
                    }
               }
               break;
            case 4:
                System.out.println("Mark a task as completed");
                if(tasks.isEmpty()){
                    System.out.println("There are no tasks to complete");
                }else{
                    System.out.println("Availabe task: ");
                    for(int i=0;i<tasks.size(); i++){
                    System.out.println((i+1) + " " +tasks.get(i));
                    }
                    System.out.println("Enter the task number to mark as completed: ");
                    int updatingTask= value.nextInt();
                    //String index = value.nextLine();
                    if(updatingTask>=1 && updatingTask<= tasks.size()){
                        int index = updatingTask-1;
                        if(tasks.get(index).endsWith("[COMPLETED]")){
                            System.out.println("This task is already completed!");
                        }else{
                            tasks.set(index, tasks.get(index) + " [COMPLETED]");
                            System.out.println("Task marked as completed successfully!");
                        }
                    }else{
                        System.out.println("Invalid task number. Please try again.");
                    }
                }
                break;
            case 5:
                System.out.println("Exiting NoticeNest. Goodbye!");
                return;

            default:
                System.out.println("Invalid option. Please choose 1 to 5");
                break;
            }
        
        //value.close();
        }
    }
}