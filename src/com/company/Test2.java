package com.company;

import java.util.Scanner;

public class Test2 {
    int id;
    String name;
    public static void main(String[] args){
        Test2 test2 = new Test2();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hello World, What is your name? ");
        String name = scanner.nextLine();
        System.out.printf("I Love You %s ", name);
        test2.id = 100;
        test2.name = "times";
        System.out.println(test2.id + " " + test2.name);
    }
}
