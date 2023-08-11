// To find out whether the given String is Palindrome

import java.util.Scanner;

public class Palindrome {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("type a string: ");
        String word = in.next();

        boolean isPalindrome = true; 
        for(int i = 0; i < word.length()/2; ++i) {
            if(word.charAt(i) != word.charAt(word.length() - i - 1 ) ) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome == true) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }
}
