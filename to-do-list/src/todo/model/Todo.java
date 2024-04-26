package todo.model;
import java.util.ArrayList;
import java.util.List;

public class Todo {

    //List to store tasks
    private List<Task> tasks;

    //Constructor to initialize the to-do list with empty task list
    public Todo(){
        tasks=new ArrayList<>();
    }

    public void addTask(String description){
        //Creates a new task with the given description
        Task newTask = new Task(description);
        //Adds the task to the tasklist
        tasks.add(newTask);
    }

    //Method to mark a task as completed at specified index
    public void completeTask(int index){
        //check if index is valid
        if (index >=0 && index<tasks.size()){
            //Retreive task at specified index
            Task taskToComplete = tasks.get(index);

            //If it exists, use the completeTask method
            if(taskToComplete != null){
                taskToComplete.completeTask();
            }
        }
    }
    //Removes a task with specified index
    public void removeTask(int index){
        if (index >=0 && index<tasks.size()){
            tasks.remove(index);
        }
    }

    //Display tasks by 
    public void displayTasks(){
        if (tasks.isEmpty()){
            System.out.println("No tasks to display!");
            return;
        }
        System.out.println("To-do list :");
        System.out.println("____________");
        for (int i =0; i<tasks.size();i++){
            String stringTask=tasks.get(i).toString();
            System.out.println((i+1) + "." + stringTask);
        }
    }

    public List<Task> getTasks(){
        return tasks;
    }
}
