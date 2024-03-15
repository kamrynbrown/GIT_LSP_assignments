package org.howard.edu.lsp.midterm.question1;

/**
 * This class provides methods for encrypting text using a simple algorithm.
 */
public class SecurityOps {

    /**
     * Encrypts the given text using a simple encryption algorithm.
     *
     * @param text The text to be encrypted.
     * @return The encrypted text.
     */
    public static String encrypt(String text) {
        // Initialize two StringBuilder objects to store even and odd characters separately
        StringBuilder evenChars = new StringBuilder();
        StringBuilder oddChars = new StringBuilder();

        // Remove punctuation and whitespace from the input text
        String cleanText = text.replaceAll("[^a-zA-Z0-9]", "");

        // Loop through the characters of the clean text
        for (int i = 0; i < cleanText.length(); i++) {
            char currentChar = cleanText.charAt(i);
            // Alternate between appending characters to evenChars and oddChars
            if (i % 2 == 0) {
                evenChars.append(currentChar);
            } else {
                oddChars.append(currentChar);
            }
        }

        // Concatenate even and odd characters and return the result
        return evenChars.toString() + oddChars.toString();
    }
}
