// Input currency in rupees and output in USD.

import java.util.Scanner;

public class Currency {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("type currency in rupees: ");
        int currency = in.nextInt();

        int conversion = currency / 83;
        System.out.println(conversion + " USD");
    }
}
