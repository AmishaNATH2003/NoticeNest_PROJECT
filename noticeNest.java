import java.util.*;
public class noticeNest{
    public static void main(String[] arg){
        System.out.println("=====================================");
        System.out.println("SMART DEADLINE MANAGER");
        System.out.println("=====================================");

        System.out.println("Enter your name: ");
        Scanner value = new Scanner(System.in);
        String userName = value.nextLine();
        System.out.println("Welcome, " + userName + "!");
        System.out.println("Manage your tasks in one place.");
        System.out.println("Enter today's goal: ");
        ArrayList<String> tasks = new ArrayList<>();
        String task = value.nextLine();
        System.out.println("Today's goal: "+ task); 
        tasks.add(task);
        
       
        while(true){
        System.out.println("\n1. Add a task");
        System.out.println("2. View tasks");
        System.out.println("3. Exit");
        System.out.println("Choose an option: ");
        int choice = value.nextInt();
        switch (choice) {
            case 1:
                value.nextLine();
                System.out.println("Enter your task:");
                //System.out.println("Complete java practice: ");
                String new_task = value.nextLine();
                tasks.add(new_task);
                System.out.println("Task added: "+ new_task);
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
                System.out.println("Exiting NoticeNest. Goodbye!");

                return;
                default:
                System.out.println("Invalid option. Please choose 1, 2, or 3");
                break;
            }
        
        //value.close();
        }
    }
}