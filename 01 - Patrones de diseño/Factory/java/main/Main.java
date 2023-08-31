package main;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskHandler taskHandler = new TaskHandler(); 
        System.out.print("Tu request por favor: ");
        Scanner sc = new Scanner(System.in); 
        String str = sc.nextLine(); 
        System.out.println(taskHandler.executeTask(str));
        sc.close();
        
    }
}
