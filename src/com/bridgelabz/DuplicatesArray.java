package com.bridgelabz;

public class DuplicatesArray {
    public static void main(String[] args) {
        int[] array = new int[]{1, 9, 2, 4, 3, 8, 3, 5, 9, 4, 3};
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j])
                    System.out.print(array[j] + " ");
            }
        }
    }
}
