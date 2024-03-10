package day04_selection_statements;

public class CrewAndPassengers {
    public static void main(String[] args) {

        int number = 100;
        int crew, passengers;

        boolean isValid = number == 50 || number == 75 || number == 100;

        if(isValid){

            if(number == 50){
                crew = 20;
                passengers = 30;
            } else if(number == 75){
                crew = 25;
                passengers = 50;
            } else {
                crew = 30;
                passengers = 70;
            }

            System.out.println(crew + " crew, " + passengers + " passengers");

        } else {
            System.out.println("Invalid total number of people");
        }

    }

}
/*
7. Create a class called CrewAndPassenger. Given the total number of people on the ship,
	determine how many should be crew members and how many can be passengers.

		Total: 50 ====> 20 crew, 30 passengers
		Total: 75 ====> 25 crew, 50 passengers
		Total: 100 ====> 30 crew, 70 passengers
		Any other number of people on the ship is not valid.
		Print how many of each type there should be.

			Example:
				   number = 75

			Output:
				  25 crew, 50 passengers
 */