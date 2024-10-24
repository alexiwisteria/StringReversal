package org.example;

/**
 * The Main class contains the main method to demonstrate reversing a sentence.
 * This class uses methods from the StringReversal class to:
 * 1. Convert the input string to an array of words.
 * 2. Reverse the array of words.
 * 3. Convert the reversed array back to a string.
 */
public class Main {

    /**
     * The entry point of the program. This method demonstrates how to reverse the
     * words in a sentence by calling helper methods from the StringReversal class.
     *
     * @param args command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // The input string we want to reverse
        String input = "Alexis is a good student";

        // Step 1: Convert the input string into an array of words
        // This breaks the sentence into words so we can reverse their order
        String[] wordsArray = StringReversal.stringToArray(input);

        // Step 2: Reverse the array of words
        // This swaps the words in place, reversing their order
        StringReversal.reverseArray(wordsArray, 0, wordsArray.length - 1);

        // Step 3: Convert the reversed array of words back to a single string
        // We now rebuild the sentence from the reversed array of words
        String reversedString = StringReversal.arrayToString(wordsArray);

        // Output the final result
        // This prints the reversed sentence to the console
        System.out.println(reversedString);
    }
}
