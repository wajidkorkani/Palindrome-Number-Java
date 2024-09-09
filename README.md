# Palindrome Number Checker

This Java program checks whether a given integer is a palindrome. A palindrome is a number that reads the same forwards and backwards, such as 121 or 12321.

## Overview

The program prompts the user to enter an integer and determines if the entered number is a palindrome. It handles both positive and negative numbers, as well as numbers ending in zero, which cannot be palindromes unless they are zero.

## Features

- Prompts the user for input.
- Checks if the given number is a palindrome.
- Handles negative numbers and numbers ending in zero correctly.

## Code Explanation

Here is the Java code for the Palindrome Number Checker:

```java
import java.util.Scanner;
public class PalindromeNumber{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = input.nextInt();
        boolean isPalindromeNumber = isPalindrome(number);
        System.out.println(isPalindromeNumber);
    }

    public static boolean isPalindrome(int x) {
        // Handle negative numbers and numbers ending in 0
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }

        String integerToString = Integer.toString(x);
        int left = 0;
        int right = integerToString.length() - 1;

        while (left < right) {
            if (integerToString.charAt(left) != integerToString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}