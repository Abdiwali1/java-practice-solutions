package day04_selection_statements;

public class NumberOfDays {

    public static void main(String[] args) {

        int month = 2;
        int days = 0;

        switch (month){
            case 1, 3, 5, 7, 8, 10, 12:
                days = 31;
                break;
            case 2:
                days = 28;
                break;
            case 4, 6, 9, 11:
                days = 30;
        }
/*
        int days = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 2 -> 28;
            case 4, 6, 9, 11 -> 30;
            default -> 0;
        };
 */

        if(days > 0){
            System.out.println(days + " days");
        } else {
            System.out.println("Invalid");
        }


    }

}
/*
12. Create a class named NumberOfDays. An integer variable named month is given.
	Write a program to determine the number of days in a given month.

			Example:
				   month = 5

			Output:
				   31 days

			(Assume that February has 28 days)

		If the given month number is not between 1~12, then print "Invalid."

		Hints:
			Months with 31 days: 1, 3, 5, 7, 8, 10, 12
			Months with 30 days: 4, 6, 9, 11
 */