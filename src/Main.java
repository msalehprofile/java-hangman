//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInputs = new Scanner(System.in);
        String userGuess;

        String[] words = {"Summer", "Short", "Pasta", "Coffee", "Travel", "Plants", "Tumbler", "Jazz", "Jumper", "Vampire"};

        int min=0, max=9;
        int rand_int = (int)(Math.random()*((max-min)+1))+min;
        System.out.println(rand_int);
        System.out.println(words[rand_int]);

        WordSelector chosenWord = new WordSelector(words[rand_int]);
        System.out.println(chosenWord);


        System.out.println("Enter Letter");
        userGuess = userInputs.nextLine();


        if (userGuess.length() == 1) {
            System.out.println("You have selected letter " + userGuess);
        } else  {
            System.out.println("Please only type one letter");
        }


    }
}