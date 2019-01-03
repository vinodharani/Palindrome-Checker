package com.vino;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("\"Enter a word to check if it is Palindrome: ");
        Scanner scanner = new Scanner(System.in);

        String word = scanner.next();
        word = word.toLowerCase();

//        checkIfPalindrome(word);
        System.out.println(reverseString(word));
    }

    private static void checkIfPalindrome(String word) {
        boolean isPalindrome = true;

        int length = word.length();

        for (int i = 0; i < length ; i++) {
            if (word.charAt(i) == word.charAt(length-1-i)) {
                isPalindrome = true;
            } else {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome);
    }

//    Checking if the word is a palindrome by reversing a word
    private static void checkIfPalindrome2(String word) {

    }

    private static String reverseString(String input) {
        char[] inputArray = input.toCharArray();

        if (inputArray.length%2 == 0) {
            for (int i = 0; i < inputArray.length/2; i++) {
                char temp = inputArray[i];
                inputArray[i] = inputArray[inputArray.length-1-i];
                inputArray[inputArray.length-1-i] = temp;
            }
        } else {
            for (int i = 0; i < (inputArray.length/2) + 1; i++) {
                char temp = inputArray[i];
                inputArray[i] = inputArray[inputArray.length-1-i];
                inputArray[inputArray.length-1-i] = temp;
            }
        }

        return new String(inputArray);
    }
}
