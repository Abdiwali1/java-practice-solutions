package day07_class_objects_part1;

import java.util.Scanner;

public class FamilyMembers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many people do you live with?");
        int people = input.nextInt();
        input.close();

        String result;
        if(people < 3){
            result = "Live with less than three people";
        } else if(people < 6){
            result = "Live with 3 - 6 people";
        } else {
            result = "Live with more than six people";
        }
        System.out.println(result);

    }

}
/*
5. Create a class named FamilyMembers and write a program that asks the user how many people they live with.

    If the user lives with fewer than three people, print "Live with less than three people."
    If the user lives with 3 - 6 people, print "Live with 3 - 6 people."
    If the user lives with more than six people, print "Live with more than six people."

        Example:
             How many people do you live with?
             Input: 3

        Output:
             Live with less than three people

 */