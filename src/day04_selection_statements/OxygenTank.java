package day04_selection_statements;

public class OxygenTank {

    public static void main(String[] args) {

        int oxygenTank = 64;

        if(oxygenTank >= 90){
            System.out.println("Your tank is full");
        } else if(oxygenTank >= 80){
            System.out.println("Still okay");
        } else if(oxygenTank >= 70){
            System.out.println("Don't go too far");
        } else if(oxygenTank >= 60){
            System.out.println("Start to head back");
        } else if(oxygenTank >= 50){
            System.out.println("Be careful, you're at 50%");
        }

    }

}
/*
2. Create a class named OxygenTank. You are diving in the ocean. Your oxygen tank has a certain
level (number), and you must print a message based on the level:

		Above 90 - Your tank is full
		Above 80 - Still okay
		Above 70 - Don't go too far
		Above 60 - Start to head back
		Above 50 - Be careful, you're at 50%

			Example:
				   oxygenLevel = 75;

			Output:
				  Don't go too far
 */