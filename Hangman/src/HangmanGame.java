import java.util.Scanner;
import java.util.Random;

public class HangmanGame {

    public static void main(String[] args) {

        // Create Scanner and Random objects
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        // List of possible words
        String[] words = {"APPLE", "PIZZA", "TIGER", "MUSIC", "BEACH"};

        // Randomly select the secret word
        int randomNumber = random.nextInt(words.length);
        String secretWord = words[randomNumber].toUpperCase();

        // Game variables
        int maxAttempts = 6;
        int incorrectGuesses = 0;
        boolean wordGuessed = false;
        String guessedLetters = "";

        // Use Math class and String length()
        int wordLength = Math.abs(secretWord.length());

        System.out.println("Welcome to Hangman!");
        System.out.printf("The secret word has %d letters.%n", wordLength);

        // Keep playing until the word is guessed or attempts run out
        while (incorrectGuesses < maxAttempts && !wordGuessed) {

            System.out.print("\nWord: ");

            boolean allLettersGuessed = true;

            // Display the hidden word
            for (int i = 0; i < secretWord.length(); i++) {

                char letter = secretWord.charAt(i);

                if (guessedLetters.indexOf(letter) >= 0) {
                    System.out.print(letter + " ");
                } else {
                    System.out.print("_ ");
                    allLettersGuessed = false;
                }
            }

            // Check if the entire word was guessed
            if (allLettersGuessed) {
                wordGuessed = true;
                break;
            }

            // Calculate attempts remaining
            int remainingAttempts = maxAttempts - incorrectGuesses;

            System.out.printf("%nIncorrect guesses: %d%n", incorrectGuesses);
            System.out.printf("Attempts remaining: %d%n", remainingAttempts);

            // Ask player for a letter
            System.out.print("Guess a letter: ");
            String guessInput = input.nextLine().toUpperCase();

            // Make sure something was entered
            if (guessInput.length() == 0) {
                System.out.println("Please enter a letter.");
                continue;
            }

            char guess = guessInput.charAt(0);

            // Check if letter was already guessed
            if (guessedLetters.indexOf(guess) >= 0) {
                System.out.println("You already guessed that letter.");
            } else {

                guessedLetters += guess;

                // Check if guess is correct
                if (secretWord.indexOf(guess) >= 0) {
                    System.out.println("Good guess!");
                } else {
                    incorrectGuesses++;
                    System.out.println("Incorrect guess!");
                }
            }
        }

        // Display final result
        if (wordGuessed) {
            System.out.printf("%nCongratulations! You guessed the word: %s%n",
                    secretWord);
        } else {
            System.out.printf("%nGame Over! The word was: %s%n",
                    secretWord);
        }

        input.close();
    }
}