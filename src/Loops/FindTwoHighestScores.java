/*(Find the two highest scores) Write a program that prompts the user to enter the
number of students and each student’s name and score, and finally displays the
student with the highest score and the student with the second-highest score.*/
package Loops;

import java.util.Scanner;

public class FindTwoHighestScores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of Students: ");
        int numberofStudents = input.nextInt();

        int highestScore = 0;
        int secondHighestScore = 0;
        String highestScorer = "";
        String secondHighestScorer = "";

        for(int i = 0; i < numberofStudents; i++) {
            System.out.print("Enter the name of Student: ");
            String studentName = input.next();
            System.out.print("Enter the score of Student: ");
            int score = input.nextInt();

            if(score > highestScore) {
                secondHighestScore = highestScore;
                secondHighestScorer = highestScorer;
                highestScore = score;
                highestScorer = studentName;
            } else if (score > secondHighestScore) {
                secondHighestScore = score;
                secondHighestScorer = studentName;
            }
        }
        System.out.println("The student with the highest score is " + highestScorer + " with a score of " + highestScore);
        System.out.println("The student with the second-highest score is " + secondHighestScorer + " with a score of " + secondHighestScore);

    }
}
