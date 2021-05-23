package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //Declare an array that will be the container of 3 numbers.
        int numbers[] = new int[3];

        //Use for loop to input number in array.
        for (int i=0; i<3;i++){
            System.out.println("Input number " + (i+1));
            numbers[i] = scanner.nextInt();
        }
        //Use Arrays sort method to sort the numbers from ascending order
        Arrays.sort(numbers);

        //Printout the output.
        for (int i=0; i<3;i++) {
            System.out.println(numbers[i]);
        }
    }
}
