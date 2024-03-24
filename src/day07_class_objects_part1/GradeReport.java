package day07_class_objects_part1;

import java.util.Scanner;

public class GradeReport {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your score");
        int score = input.nextInt();
        input.close();

        String result = "Your grade is ";
        if(score >= 0 && score <= 100){

            if(score >= 90) {
                result += "A";
            } else if(score >= 80){
                result += "B";
            } else if(score >= 70){
                result += "C";
            } else if(score >= 60){
                result += "D";
            } else {
                result += "F";
            }

        } else {
            result = "Invalid Score " + score + ". Needs to be between 0 - 100";
        }

        System.out.println(result);

    }

}

/*
7. Create a class named GradeReport and write a program asking the user to enter their score and print the student's grade.

  If the user enters an invalid score (negative or more than 100), print "Invalid Score."

        Example:
             Enter your score:
             Input: 85

        Output:
             Your grade is B
 */