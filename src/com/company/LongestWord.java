package com.company;

import java.util.*;
import java.io.*;

class LongestWord {

    public static String LongestWord(String sen) {
        // code goes here
        String longest = "";
        sen = sen.replaceAll("[^a-zA-Z0-9]", " ");
        String[] words=sen.split(" ");
        for(int i=0; i<words.length; i++){
            if(words[i].length()>longest.length()){
                longest = words[i];
            }
        }
        return longest;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(LongestWord(s.nextLine()));
    }

}
