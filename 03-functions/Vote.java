// A person is eligible to vote if his/her age is greater than or equal to 18. 
// Define a method to find out if he/she is eligible to vote.

import java.util.Scanner;

public class Vote {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("type ur age: ");
        int age = in.nextInt();
        in.close();
        
        boolean ans = Votecheck(age);
        System.out.println("Vote check: " + ans);
    }

    static boolean Votecheck(int num) {

        boolean ans;
        if(num >= 18) {
            ans = true;
        } else {
            ans = false;
        }

        return ans;
    }
}
