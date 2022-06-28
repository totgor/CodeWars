package com.codewars.javalanguage.pyramid;
/*
You have to build a pyramid.

This pyramid should be built from characters from a given string.

You have to create the code for these four methods:

public static String watchPyramidFromTheSide(String characters)

public static String watchPyramidFromAbove(String characters)

public static int countVisibleCharactersOfThePyramid(String characters)

public static int countAllCharactersOfThePyramid(String characters)
The first method ("FromTheSide") shows the pyramid as you would see from the side.
The second method ("FromAbove") shows the pyramid as you would see from above.
The third method ("CountVisibleCharacters") should return the count of all characters, that are visible from outside the pyramid.
The forth method ("CountAllCharacters") should count all characters of the pyramid. Consider that the pyramid is completely
solid and has no holes or rooms in it.

Every character will be used for building one layer of the pyramid. So the length of the given string will be the height
of the pyramid. Every layer will be built with stones from the given character. There is no limit of stones.
The pyramid should have perfect angles of 45 degrees.


Example: Given string: "abc"

Pyramid from the side:

  c
 bbb
aaaaa
Pyramid from above:

aaaaa
abbba
abcba
abbba
aaaaa
Count of visible stones/characters:

25
Count of all used stones/characters:

35

There is no meaning in the order or the choice of the characters. It should work the same for example "aaaaa" or "54321".
Hint: Your output for the side must always be a rectangle! So spaces at the end of a line must not be deleted or trimmed!
If the string is null or empty, you should exactly return this value for the watch-methods and -1 for the count-methods.

Have fun coding it and please don't forget to vote and rank this kata! :-)
I have created other katas. Have a look if you like coding and challenges.
*/

public class Pyramid {
    public static String watchPyramidFromTheSide(String characters) {
        if (characters == null) return null;
        if (characters.length() == 0) return "";

        String s = new String();

        int temp = 1;
        for (int i = (characters.length() - 1); i >= 0; i--) {
            for (int j = i; j > 0; j--) s = s + " ";
            for (int j = temp; j > 0; j--)
                s = s + characters.charAt(i);
            for (int j = i; j > 0; j--) s = s + " ";
            if ( i != 0) s = s + "\n";
            temp = temp + 2;
        }

        return s;
    }

    public static String watchPyramidFromAbove(String characters) {
        if (characters == null) return null;
        if (characters.length() == 0) return "";

        String s = new String();
        int maxNumberChar = 1;
        for (int i = (characters.length() - 1); i > 0; i--) maxNumberChar = maxNumberChar + 2;
        char[][] pyramidFromAbove = new char[maxNumberChar][maxNumberChar];

        for (int i = 0; i < characters.length(); i++) {
            for (int j = i; j < (maxNumberChar - i); j++) {
                pyramidFromAbove[i][j] = characters.charAt(i);
                pyramidFromAbove[j][i] = characters.charAt(i);
            }
        }

        int nextChar = 0;
        for (int k = maxNumberChar - 1; k >= characters.length(); k--) {
            for (int l = k; l > nextChar; l--) {
                pyramidFromAbove[l][k] = characters.charAt(nextChar);
                pyramidFromAbove[k][l] = characters.charAt(nextChar);
            }
            nextChar++;
        }

        for (int i = 0; i < maxNumberChar; i++) {
            for (int j = 0; j < maxNumberChar; j++) s = s + pyramidFromAbove[i][j];
            if (i < (maxNumberChar - 1)) s = s + "\n";
        }

        return s;
    }

    public static int countVisibleCharactersOfThePyramid(String characters) {
        if (characters == null || characters.length() == 0) return -1;

        int arithmProg = 0;
        if (characters.length() != 0) arithmProg = 1;

        for (int i = 1; i < characters.length(); i++) arithmProg = arithmProg + 2;

        return arithmProg * arithmProg;
    }

    public static int countAllCharactersOfThePyramid(String characters) {
        if (characters == null || characters.length() == 0) return -1;

        int result = 0, arithmProg = 1;

        for (int i = 0; i < characters.length(); i++) {
            result = result + arithmProg * arithmProg;
            arithmProg = arithmProg + 2;
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "abcdef";
        System.out.println(watchPyramidFromTheSide(str));
        System.out.println(watchPyramidFromAbove(str));
        System.out.println("Всего всех символов в пирамиде: " + countAllCharactersOfThePyramid(str));
        System.out.println("Колличество видимых символов: " + countVisibleCharactersOfThePyramid(str));
    }
}
