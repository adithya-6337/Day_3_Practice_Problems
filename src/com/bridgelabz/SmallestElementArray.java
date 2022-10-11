package com.bridgelabz;

public class SmallestElementArray {
    public static void main(String[] args) {
        int[] array = new int[]{6, 3, 8, 1, 2, 9};
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < max)
                max = array[i];
        }
        System.out.println("Smallest Element Of An Array : " + max);
    }
}
