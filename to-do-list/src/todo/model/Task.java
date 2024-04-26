package todo.model;

public class Task {
    // The description of the task and boolean that tells if it is completed
    private String description;
    private boolean isCompleted;
    
    //Constructor to initialize the task with a description and default completion status
    public Task(String taskDescription){
        this.description = taskDescription;
        this.isCompleted = false;
    }

    //Marks the task as completed
    public void completeTask(){
        isCompleted = true;
    }

    //Checks if the task is completed
    public boolean isCompleted(){
        return isCompleted;
    }

    //Retrieves the description of the task
    public String getTaskDescription(){
        return description;
    }

    //Sets a new description for the task
    public void setDescription(String description){
        this.description = description;
    }

    //Generates a string representation of the task
    @Override
    public String toString() {
        if (isCompleted) {
            return "[X] " + description;
        } else {
            return "[ ] " + description;
        }
    }
}  
