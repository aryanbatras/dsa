import java.util.Scanner;

public class Product {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("type num one: ");
        int numone = in.nextInt();

        System.out.println("type num two: ");
        int numtwo = in.nextInt();

        int ans = product(numone, numtwo);
        System.out.println("Product is: " + ans);
    }

    static int product(int n, int m) {
        int mul = n * m;
        return mul;
    }
}