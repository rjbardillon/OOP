package com.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        while (true) {
            System.out.print("Enter a number: ");
            try {
                number = scanner.nextInt();
                System.out.println(number);
                break;
            } catch (InputMismatchException E) {
                System.out.println("Not matching expected input");
                continue;
            }
        }
    }
}
