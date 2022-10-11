package com.bridgelabz;

public class Frequency {
    public static void main(String[] args) {

        int[] array = new int[]{4, 5, 2, 9, 4, 1, 9, 2, 9};
        int[] fr = new int[array.length];
        int visited = -1;
        for (int i = 0; i < array.length; i++) {
            int count = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    //To avoid counting same element again
                    fr[j] = visited;
                }
            }
            if (fr[i] != visited)
                fr[i] = count;
        }
        for (int i = 0; i < fr.length; i++) {
            if (fr[i] != visited)
                System.out.println(array[i] + "    |    " + fr[i]);
        }
    }
}
