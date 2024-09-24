package com.company;

public class ArrayQues {
    public static void main(String[] args) {
        // problem 1) find the maximum value in an array

        int [] a = {4,6,8,223,556,78,1,9,34,48};
        int i, max;
        max = a[0];
        for (i = 0; i<a.length ; i++){
            if (a[i]> max){
                max = a[i];
            }
        }
        System.out.println("max array is " + max);

        // problem 2) Sum of Array Elements

        int [] b = {2,3,5,4,6,7,8,9,2,5,54,32,5};
        int sum = 0;
        for (int k : b) {               // advanced for loop
            sum = sum + k;
        }
        System.out.println(sum);

        // problem 3) Copying an Array

        int[] original = {1, 2, 3, 4, 5};
        int[] copy = new int[original.length];

        System.arraycopy(original, 0, copy, 0, original.length);

        System.out.print("Copied array: ");
        for (int number : copy) {
            System.out.print(number + " ");
        }
    }
}
