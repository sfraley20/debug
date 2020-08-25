import jdk.internal.util.xml.impl.Input;

import java.util.Scanner;

public class Debug {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int testScore;

        testScore = 68;

        char grade;
        grade = 'B';

        if (testScore >= 90) {
            grade = 'A';

        }
       else if (testScore >= 80) {
            grade = 'B';
        }
       else if (testScore >= 70) {
            grade = 'C';
        }
       else if (testScore >= 60) {
            grade = 'D';
        }
        else if (testScore < 60) {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);
    }
}