//  Define two methods to print the maximum 
//  and the minimum number as well ...
//  three numbers entered by the user

import java.util.Scanner;

public class MiniMax {

    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);

        System.out.println("type 3 num: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
       
        int max = max( a, b, c);
        System.out.println("Max is " + max);

        int min = min( a, b, c);
        System.out.println("Min is " + min);
    }

    static int max(int a, int b, int c) {
        int max = a;
        
        if(b > a) {
            max = b;
        }

        if(c > max) {
            max = c;
        }
        return max;
    }

    static int min(int a, int b, int c) {
        int min = a;

        if(b < a) {
            min = b;
        }

        if(c < min) {
            min = c;
        }

        return min;
    }
}