package day08_string;


import java.util.Scanner;

public class WithoutFirstCharacter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word1 = input.next();
        String word2 = input.next();

        System.out.println(word1.substring(1) + word2.substring(1));


    }

}

/*
2. Create a class named WithoutFirstChar. Ask the user to enter two words. Print the first word without its
first character, then print the second word without its first character.

        Example:
              Inputs:
                  apple
                  banana

              Output:
                   ppleanana
 */