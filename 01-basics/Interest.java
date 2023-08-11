// Write a program to input principal, time, and rate (P, T, R)
//  and find Simple Interest

import java.util.Scanner;

public class Interest {
    
    public static void main(String[] args) {

        System.out.println("Program for simple interest \n");
        Scanner in = new Scanner(System.in);

        System.out.print("Principal amount: ");
        int principal = in.nextInt();

        System.out.print("Rate in %age: ");
        int rate = in.nextInt();

        System.out.print("Time in yrs: ");
        int time = in.nextInt();

        int interest = principal * rate/100 * time;

        System.out.println("Simple interest: " + interest);
    }
}
