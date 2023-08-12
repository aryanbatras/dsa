// Write a function that returns the sum of first n natural numbers

import java.util.Scanner;

public class NaturalSum {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("type ur num: ");
        int n = in.nextInt();

        sum(n);
    }

    static void sum(int n) {

        int ans = 0;
        while(n != 0){
            ans = ans + n;
            n --;
        }
        System.out.println("natural sum: " + ans);
    }

}
