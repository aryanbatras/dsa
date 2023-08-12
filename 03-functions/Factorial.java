// Write a program to print the factorial of a number 
// by defining a method named 'Factorial'. 

import java.util.Scanner;

public class Factorial {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("type ur num: ");
        int num = in.nextInt();
        in.close();

        factorial(num);
    } 

    static void factorial(int num) {

        int ans = 1;
        while(num != 0) {

            ans = ans * num;
            num--;
        }

        System.out.println("FACTORIAL: " + ans);
    }
}
