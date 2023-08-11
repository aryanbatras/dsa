// Take name as input 
// and print a greeting message for that particular name.

import java.util.Scanner;

public class Greeting {
    
    public static void main(String[] args) {
     
    Scanner in = new Scanner(System.in);

    System.out.print("type ur name: ");
    String name = in.next();

    System.out.println("Greetings, " + name);
    
    }
}
