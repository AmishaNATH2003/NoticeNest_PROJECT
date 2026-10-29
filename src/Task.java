public class Task {
   private String name ;
   private String priority;
   private boolean completed;

   //constructor
   public Task(String name, String priority){
    this.name = name;
    this.priority = priority;
    this.completed = false;
   }

   public String getInformation(){
      String status;
      if(completed) status = "COMPLETED";
      else status = "PENDING";
      return name + " [" + priority + "]" + " [" + status + "]";
   }
   
   public String getName(){
      return name;
   }

   public String getPriority(){
      return priority;
   }

   public boolean isCompleted(){
      return completed;
   }

   


}
