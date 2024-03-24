package day08_string;

import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to split the bill? yes or no");
        String yesOrNo = input.next();

        System.out.println("How many people in the party?");
        int numberOfPeople = input.nextInt();

        System.out.println("What is the check amount?");
        double checkAmount = input.nextDouble();

        System.out.println("What was the service quality? - excellent, great, good, fair, poor");
        String serviceQuality = input.next().toLowerCase();

        input.close();

        double tip = switch (serviceQuality){
            case "excellent" -> 0.25;
            case "great" -> 0.2;
            case "good" -> 0.15;
            case "fair" -> 0.1;
            case "poor" -> 0.05;
            default -> 0.2;
        };

        double tipAmount = checkAmount * tip;
        double totalPay = checkAmount + tipAmount;

        System.out.println("Number of people entered: " + numberOfPeople);
        System.out.println("Base amount: " + checkAmount);
        System.out.println("Total to pay: " + totalPay);
        System.out.println("Total tip: " + tipAmount);

        if(yesOrNo.equalsIgnoreCase("yes")){
            System.out.println("Total per person: " + (totalPay / numberOfPeople));
            System.out.println("Tip per person: " + (tipAmount / numberOfPeople));
        }

    }
}

/*
7. Create a class called TipCalculator and write a program for a tip calculator. There will be different service
quality benchmarks that will determine the tip given. There will also be the ability to calculate based on the
number of people in the party and whether there is a split of the bill.

        Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

      The program should ask the user to enter:
          - Split or No split (Yes or No),
          - Enter the number of people (number)
          - Enter the check amount (number)
          - Service Quality (String)

      And display the output in the following format:

            Example:
                  Split or No Split (Yes or No)?
                  Input: Yes
                  Enter the number of people:
                  Input: 4
                  Enter the check amount:
                  Input: 476
                  How was the service quality? (Excellent/Great/Good/Fair/Poor)
                  Input: Excellent

            Output:
                 Number of people entered: 4
                 Total to pay: 595.0
                 Total tip: 119.0
                 Total per person: 148.75
                 Tip per person: 29.75
 */