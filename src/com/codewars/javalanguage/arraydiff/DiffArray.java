package com.codewars.javalanguage.arraydiff;

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