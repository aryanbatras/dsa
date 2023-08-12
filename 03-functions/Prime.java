// Define a method to find out if a number is prime or not.

import java.util.Scanner;

public class Prime {
    
    public static void main(String[] args) {
        
                
        Scanner in = new Scanner(System.in);

        System.out.println("type num: ");
        int num = in.nextInt();
        in.close();

        String ans = prime(num);
        System.out.println("num is " + ans);
    }

    static String prime(int num) {
        String prime = "";

        int i = num - 1;
        while(i > 1) {
            
            if(num % i == 0) {
                prime = "NOT PRIME";
                break;
            } else {
                prime = "PRIME";
            }

            

            i --;
        }

        return prime;
    }
}
