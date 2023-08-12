// Write a program that will ask the user to enter his/her marks (out of 100). 
// Define a method that will display grades according to the marks entered as below:

import java.util.Scanner;

public class Marks {
 
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Enter ur marks: ");
        int score = in.nextInt();
        in.close();

        Score(score);
    }

    // Marks        Grade 

    // 91-100         AA 
    // 81-90          AB 
    // 71-80          BB 
    // 61-70          BC 
    // 51-60          CD 
    // 41-50          DD 
    // <=40          FAIL

    static void Score(int num) {
       String grade = "";

        if(num >= 91 && num <= 100) {
            grade = "AA";
        } else if (num >= 81 && num <= 90) {
            grade = "AB";
        } else if (num >= 71 && num <= 80) {
            grade = "BB";
        } else if (num >= 61 && num <= 70) {
            grade = "BC";
        } else if (num >= 51 && num <= 60) {
            grade = "CD";
        } else if (num >= 41 && num <= 50) {
            grade = "DD";
        } else if (num <= 40) {
            grade = "FAIL";
        } else {
            System.out.println("WRONG MARKS ");
        }

        System.out.println("Grade: " + grade);
    }
}
