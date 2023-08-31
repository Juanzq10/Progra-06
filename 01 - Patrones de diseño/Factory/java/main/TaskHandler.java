package main;
public class TaskHandler {
    private Factory factory; 

    public TaskHandler() {
        this.factory = new Factory(); 
    }

    public String executeTask(String task) {
        return factory.createTaskExecuter(task).executeTask(); 
    }
}