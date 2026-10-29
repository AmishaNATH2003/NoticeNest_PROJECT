public class Task {
   public String name ;
   public String priority;
   public boolean completed;

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
   

}
