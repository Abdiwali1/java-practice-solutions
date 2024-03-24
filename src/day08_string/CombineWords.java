package day08_string;


import java.util.Scanner;

public class CombineWords {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word1 = input.next();
        String word2 = input.next();
        input.close();

        boolean sameLetter = word1.charAt(word1.length() - 1) == word2.charAt(0);

        if(sameLetter){
            word2 = word2.substring(1);
        }

        System.out.println(word1 + word2);

    }

}

/*
3. Create a class named CombineWords. Ask the user to enter two words. Then, add them together and print. But if the
last letter of the first word and the first letter of the second word are the same, print that character once.

        Example:
              Input:
                 one
                 eight

              Output:
                   oneight
 */