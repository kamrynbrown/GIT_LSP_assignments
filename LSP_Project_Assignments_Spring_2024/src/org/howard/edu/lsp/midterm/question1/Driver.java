package org.howard.edu.lsp.midterm.question1;

/**
 * This class contains the main method to demonstrate the usage of the SecurityOps class.
 */
public class Driver {
    public static void main(String[] args) {
        // Input text to be encrypted
        String inputText = "I love CSCI363";

        // Encrypt the input text using the SecurityOps.encrypt method
        String encryptedText = SecurityOps.encrypt(inputText);

        // Display the encrypted text
        System.out.println("Encrypted text: " + encryptedText);
    }
}
