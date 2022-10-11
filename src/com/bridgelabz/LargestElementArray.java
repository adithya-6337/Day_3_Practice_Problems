package com.bridgelabz;

public class LargestElementArray {
    public static void main(String[] args) {
        int [] arr = new int [] {6, 2, 10, 5, 1};
        //Initialize max with first element of array.
        int max = arr[0];
        //Loop through the array
        for (int i = 0; i < arr.length; i++) {
            //Compare elements of array with max
            if(arr[i] > max)
                max = arr[i];
        }
        System.out.println("Largest Element Of An Array : " + max);
    }
}

