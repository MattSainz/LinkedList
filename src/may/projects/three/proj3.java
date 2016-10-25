package may.projects.three;

import com.sun.xml.internal.xsom.impl.scd.Iterators;

import java.util.Arrays;
import java.util.Scanner;
/**
 * Created by May on 10/24/16.
 * Reads user input and adds and removes items from
 */
public class proj3 {

    private static final Scanner scanner = new Scanner(System.in);
        //New scanner to read user input

    public static void main(String[] args) {
        Boolean isRunning = true;

        String input;
        String[] arg;
        LinkedList l = new LinkedList();

        while(isRunning){
            System.out.print("Please enter a command: ");
            input = scanner.next();
            switch (input) {
                case "a":
                    System.out.print("Please input due date: ");
                    int dueDate = Integer.parseInt(scanner.next());

                    System.out.print("Please enter description: ");
                    String des = scanner.next();

                    l.addNode(des, dueDate);
                    break;
                case "r":
                    System.out.println("Please enter an index to remove: ");
                    if(l.removeNode(scanner.nextInt())){
                        System.out.println("Remove successful");
                    } else {
                        System.out.println("Remove not successful");
                    }
                    break;
                case "d":
                    System.out.println(l.display());
                    break;
                case "f":
                    System.out.println(l.findSoonest());
                    break;
                case "q":
                    isRunning = false;
                    break;
                case "help":
                    System.out.print(
                            "The following options are available: \n" +
                                    "a <description due_date>: Add an assignment to the list \n" +
                                    "r <assignment_position>: Remove an assignment from the list given its position\n" +
                                    "d <>: Display the list of assingments\n" +
                                    "f <>: Display the earliest due assingment\n" +
                                    "q <>: quit the application \n" +
                                    "help: display the list of commands \n"
                    );
                    break;
                default:
                    System.out.println("Invalid command. Enter help for usage info");
                    break;
            }

        }
    }
}
