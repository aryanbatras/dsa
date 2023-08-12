import java.util.Scanner;

public class EvenOdd {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("type num: ");
        int num = in.nextInt();
        in.close();

        String ans = Evenodd(num);
        System.out.println("num is " + ans);
    }

    static String Evenodd(int value) {
        String ans = "";

        if(value % 2 == 0) {
            ans = "Even";
        } else {
            ans = "Odd";
        }

        return ans;
    }
}
