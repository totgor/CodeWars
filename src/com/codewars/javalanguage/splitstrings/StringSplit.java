package com.codewars.javalanguage.splitstrings;

/*
Complete the solution so that it splits the string into pairs of two characters.
If the string contains an odd number of characters then it should replace the missing second character
of the final pair with an underscore ('_').

Examples:
    * 'abc' =>  ['ab', 'c_']
    * 'abcdef' => ['ab', 'cd', 'ef']
 */
public class StringSplit {
    public static String[] solution(String s) {
        if ((s.length() % 2) != 0) s = s + "_";
        String[] result = new String[s.length() / 2];

        for (int i = 0; i < s.length(); i+=2) {
            result[i/2] = s.substring(i, i + 2);
        }
        return result;
    }

    public static void main(String[] args) {
        String[] temp = StringSplit.solution("abcDdwe");
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }
    }

}
