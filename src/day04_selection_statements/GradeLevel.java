package day04_selection_statements;

public class GradeLevel {

    public static void main(String[] args) {

        byte grade = 20;

        boolean isValidGrade = grade > 0 && grade < 19;
        String result = "";

        if (isValidGrade) {

            if (grade >= 17) {
                result = "Grad School";
            } else if (grade >= 13) {
                result = "College";
            } else if (grade >= 9) {
                result = "High School";
            } else if (grade >= 6) {
                result = "Middle School";
            } else { // these numbers can only be 1-5
                result = "Elementary";
            }

        } else {
            result = "Invalid grade level";
        }

        System.out.println(result);

    }
}
/*
6. Create a class called GradeLevel. Given a number (byte) gradeLevel, determine and print which
	school type someone is in. The grade levels and types are:

		1-5: Elementary school
		6-8: Middle school
		9-12: High school
		13-16: College
		17-18: Grad School
		For any other grade level, print "Invalid grade level."

			Example:
				   gradeLevel = 8

			Output:
				  Middle school
 */