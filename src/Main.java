//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInputs = new Scanner(System.in);
        String userGuess;



        WordSelector chosenWord = new WordSelector();
        chosenWord.setWord();
        System.out.println(chosenWord.getWord());


        System.out.println("Enter Letter");
        userGuess = userInputs.nextLine();


        if (userGuess.length() == 1) {
            System.out.println("You have selected letter " + userGuess);
        } else  {
            System.out.println("Please only type one letter");
        }


    }
}