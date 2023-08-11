// To find Armstrong Number between two given number.

import java.util.Scanner;
public class Armstrong {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("type your Armstrong num: ");
        int value = in.nextInt();

        int length = String.valueOf(value).length();
        int sum = 0;
        
        int temp = value;

        while(temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, length);
            temp /= 10;
        }

        if(value == sum) {
            System.out.println(sum + " is an Armstrong");
        } else {
            System.out.println(sum + " is NOT Armstrong");
        }
    }
}

