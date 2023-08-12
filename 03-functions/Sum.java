// Write a program to print the sum of two numbers 
// entered by user by defining your own method.

import java.util.Scanner;

public class Sum {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("type num one: ");
        int n = in.nextInt();

        System.out.println("type num two:");
        int m = in.nextInt();

        in.close();
        
        int ans = sum(n, m);
        System.out.println("sum is " + ans);
    }

    static int sum(int n, int m) {
    
        int sum = n + m;
        return sum;
    }
}
