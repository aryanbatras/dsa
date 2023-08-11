// Code Fibonacci Series up to n numbers.

import java.util.Scanner;

public class Fibonacci {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Fibonacci num: ");
        
        int num = in.nextInt();
        in.close();

        int a = 0;
        int b = 1;

        while(num != 2) {

            int sum = a + b;
            a = b;
            b = sum;

            System.out.println(sum);
            num--;
        }

        if(num == 1) {
            System.out.println(num);
        } else if(num == 0) {
            System.out.println(num);
        }
    }
}
