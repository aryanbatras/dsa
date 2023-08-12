//  Count the occurance of a digit in a given number

import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("type a number: ");
        int number = in.nextInt();

        String[] value = String.valueOf(number).split(""); 

        System.out.println("type a digit: ");
        int digit = in.nextInt();

        int length = String.valueOf(number).length();
        
        // 7
        // 179797
        int ans = 0;
        for(int i = 0; i < length; i++ ) {
            if( digit == Integer.valueOf(value[i]) ) {
                ans += 1;
            }
        }

        System.out.println("num " + digit + " occured " + ans + " times");

    }
}
