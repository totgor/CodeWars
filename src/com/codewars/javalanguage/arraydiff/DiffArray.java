package com.codewars.javalanguage.arraydiff;
/*
Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.

It should remove all values from list a, which are present in list b keeping their order.

Kata.arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2}
If a value is present in b, all of its occurrences must be removed from the other:

Kata.arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new int[] {1, 3}
 */

//Разность массивов. Убрать из массива A все вхождения элементов массива В.
public class DiffArray {
    public static int[] arrayDiff(int[] a, int[] b) {
        int[] result = new int[a.length];
        boolean flag = false;
        int result_index = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) result[result_index++] = a[i];
            flag = false;
        }
        a = new int[result_index];
        for (int i = 0; i < result_index; i++) a[i] = result[i];
        return a;
    }

    public static void main(String[] args) {
        int[] a  = {1, 2, 4, 4, 2, 6, 4};
        int[] b  = {1, 6, 4};
        int[] result = arrayDiff(a, b);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}