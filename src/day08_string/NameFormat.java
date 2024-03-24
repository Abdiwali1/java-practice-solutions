package day08_string;

import java.util.Scanner;

public class NameFormat {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = input.next().trim().toLowerCase();
        System.out.println("Enter your last name");
        String lastName = input.next().trim().toLowerCase();
        input.close();

        String fullName = firstName.substring(0, 1).toUpperCase();
        fullName += firstName.substring(1);
        fullName += " " + lastName.substring(0, 1).toUpperCase();
        fullName += lastName.substring(1);

        System.out.println(fullName);

    }
}
/*
6. Write a program that asks the user to enter first and last names and then prints the full name in regular format
(first character in uppercase).

        Example:
              Input:
                  firstName = "cyDEo";
                  lastName = "SCHOOL";

              Output:
                   Cydeo School
 */