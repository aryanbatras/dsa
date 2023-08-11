// Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class Largest {
    

    public static void main(String[] args) {
    
        
        Scanner in = new Scanner(System.in);

        System.out.println("type num one: ");
        int num_one = in.nextInt();

        System.out.println("type num two: ");
        int num_two = in.nextInt();

        if(num_one > num_two) {
            System.out.println(num_one + " is bigger");
        } else {
            System.out.println(num_two + " is bigger");
        }
    }
}
