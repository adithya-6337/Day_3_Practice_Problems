package com.bridgelabz;

public class AscendingOrderArray {
    public static void main(String[] args) {
        int[] array = new int[]{1, 9, 2, 8, 3, 5, 7, 4, 6};
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

