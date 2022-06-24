package com.codewars.javalanguage.splitstrings;

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
