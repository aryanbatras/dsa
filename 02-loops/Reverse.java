// Reverse a number

import java.util.Scanner;

public class Reverse {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("type num: ");
        int num = in.nextInt();
 
        String ans = ""; 
        while(num > 0){
            int rem = num % 10;
            ans += String.valueOf(rem);
            num /= 10;
        }

        System.out.println("reverse num: " + ans);
    }
}

