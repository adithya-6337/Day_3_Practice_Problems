package com.bridgelabz;

public class SecondLargestArray {
    public static void main(String[] args) {
        int temp, size;
        int array[] = {91, 83, 78, 63, 96, 57};
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Second largest number is : " + array[array.length - 2]);
    }
}