package day04_selection_statements;

public class MedianNumber {

    public static void main(String[] args) {

        int a = 100, b = 15, c = 200;

        boolean aIsMedian = (a > b && a < c) || (a > c && a < b);
        boolean bisMedian = (b > a && b < c) || (b > c && b < a);
        int median;

        if (aIsMedian) {
            median = a;
        } else if (bisMedian) {
            median = b;
        } else {
            median = c;
        }

        System.out.println(median + " is the median number");

    }
}
/*
2. Create a class named MedianNumber. Write a program that finds the median number between
three DIFFERENT given integers (Assume that the given three integers are distinct numbers).

			Example:
				   a = 10;
				   b = 15;
				   c = 20;

			Output:
				  15 is the median number
 */