package com.codewars.javalanguage.createphonenumber;

import java.util.Arrays;

// Write a function that accepts an array of 10 integers (between 0 and 9), that returns a string of those numbers in the form of a phone number.

// Example
// Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"
// The returned format must be correct in order to complete this challenge.
// Don't forget the space after the closing parentheses!

public class createPhoneNumber {

    static String getPhoneNumber(int[] numbers) {
        //String str = Arrays.toString(numbers).replaceAll("\\[|\\]|\\s|,", "");
        String str = "";
        for(int i = 0; i < 10; i++) str = str + numbers[i];
        return "(" + str.substring(0, 3) + ") " + str.substring(3, 6) + "-" + str.substring(6, 10);
    }

    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println(getPhoneNumber(number));
    }    
}
