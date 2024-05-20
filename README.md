# Hangman

A terminal game for Hangman.

## Task
For our first Java project we were set the challenge of creating a terminal Hangman game. This game has to randomly select a word and display said words with underscores. The game has to capture the plays guess; if the letter is in the word it must display the places in which the letter appears, if the letter is not in the word, it must tell the player and reduce their lives.

## Functionality
When you first run the game you are asked whether you would like to play. If no the terminal breaks, if yes the next question is what level the player(s) would like to play at.

If you play easy you will have 10 lives, medium 7 lives and hard 4 lives. Next you are asked if you would like to play as one player or two.

If one player is selected a random word is chosen from a list of stored words within WordSelector class. If two players are selected then one of the players gets to choose the word.

Once set up is complete you can start to play. A player picks what letter they want and the game will tell them whether this is a correct guess or not. If a player loses all their lives the full hangman will show and it will let the player know what the word was. If the player successfully finds the word it will let them know how many guesses they used, how many lives they ended with and what letters they guessed, along with the final state of the hangman based on lives. Both of these scenarios gives the player the option of playing again.

