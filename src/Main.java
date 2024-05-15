//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInputs = new Scanner(System.in);
        String userGuess;

        WordSelector chosenWord = new WordSelector();
        UserGuesses userGuesses = new UserGuesses();
        chosenWord.setWord();
        chosenWord.setUnderscores();

        System.out.println(chosenWord.getWord());
        System.out.println(chosenWord.getUnderscores());

        System.out.println("Enter Letter");
        userGuess = userInputs.nextLine().toLowerCase();


        if (userGuess.length() == 1) {
            userGuesses.addAllLetters(userGuess);
            if(chosenWord.getWord().toLowerCase().contains(userGuess)) {
                System.out.println("You have selected letter " + userGuess + ", which is correct!");
                int index = chosenWord.getWord().indexOf(userGuess);
                System.out.println(index);
                while(index >= 0){
                    System.out.println(index);
                    index = chosenWord.getWord().indexOf(userGuess, index+1);
                    String newView = chosenWord.getUnderscores().substring(0,index) + " " + userGuess;
                    System.out.println(newView);
                }

            } else {
                System.out.println("You have selected letter " + userGuess + ", which is incorrect.");
            }
        } else  {
            System.out.println("Please only type one letter");
        }
    }


}