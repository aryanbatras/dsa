// Take in two numbers and an operator (+, -, *, /) 
// and calculate the value. (Use if conditions)

import java.util.Scanner;

public class Calcualate {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("type num one: ");
        int num_one = in.nextInt();

        System.out.print("type num two: ");
        int num_two = in.nextInt();

        System.out.println("select ur operator: (+, -, *, /)");
        String operator = in.next();
        System.out.println(operator);

        int value = 0;
        if(operator.equals("+")) {
            value = num_one + num_two;
        } else if(operator.equals("-")) {
            value = num_one - num_two;
        } else if(operator.equals("*")) {
            value = num_one * num_two;
        } else if(operator.equals("/")) {
            value = num_one / num_two;
        } else {
            System.out.println("wrong operator");
        }

        System.out.println("value " + value);
    }
}
