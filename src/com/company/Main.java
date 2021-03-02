package com.company;

public class Main {
    public static char[] shift(char[] array) {
        //create an empty array
        char[] shiftedArray = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                shiftedArray[i] = array[i + 1];
            } else {
                shiftedArray[i] = array[0];
            }
        }
        return shiftedArray;
    }
    //public static char[] rightShift (char [] array)
    public static void main (String[]args){
        char[] array = {'E', 'A', 'B', 'C', 'D'};
        //A B C D E
        char[] arr2 = shift(array);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
