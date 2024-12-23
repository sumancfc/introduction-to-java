/*(Find the highest score) Write a program that prompts the user to enter the number of students and each student’s
name and score, and finally displays the name of the student with the highest score.*/
package Loops;

import java.util.Scanner;

public class FindHighestScore {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.print("Enter the number of students: ");
       int numberOfStudents = input.nextInt();

       int highestScore = 0;
       String highestScorer = "";

       for( int i = 0; i < numberOfStudents; i++ ) {
           System.out.print("Enter student name: ");
           String nameOfStudent = input.next();
           System.out.print("Enter student score: ");
           int score = input.nextInt();

           if(score > highestScore) {
               highestScore = score;
               highestScorer = nameOfStudent;
           }
       }
       System.out.println("The student with the highest score is " + highestScorer + " with a score of " + highestScore);
   }
}
