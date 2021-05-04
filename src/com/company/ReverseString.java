package com.company;

import java.util.*;

public class ReverseString {

    public static String FirstReverse(String str) {
        // code goes here
        int length = str.length();
        String reverseString = "";
        for (int i = length - 1; i >= 0; i--) {
            reverseString += str.charAt(i);
        }
        return reverseString;
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(FirstReverse(s.nextLine()));
    }

}
