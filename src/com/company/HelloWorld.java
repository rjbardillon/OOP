package com.company;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
        System.out.print("Input your name. ");
        String name = new Scanner(System.in).nextLine();
        System.out.printf("Hello %s, I Love You!", name);
    }
}
