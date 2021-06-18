/*
Bardillon, Romeo Jr, M.
BSIT 2-2
Average.java
 */
package programming.assignment4;

import java.util.InputMismatchException;
import java.util.Scanner;

class NonPositiveInteger extends Exception {
    NonPositiveInteger() {
        super("N must be positive.");
    }
}

class Average {
    void validInteger(int x) throws NonPositiveInteger {
        if (x < 1) {
            throw new NonPositiveInteger();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Average ob = new Average();
        int N;
        int number;
        float sum = 0;

        while (true) {
            System.out.println("How many integers? ");
            try {
                N = scanner.nextInt();
                ob.validInteger(N);
                break;
            } catch (NonPositiveInteger nonPositiveInteger) {
                System.out.println(nonPositiveInteger.getMessage());
            } catch (InputMismatchException e) {
                scanner.next();
                System.out.println("Numbers only. ");
            }
        }

        for (int i = 0; i < N; i++) {
            while (true) {
                System.out.printf("%s ", i + 1);
                try {
                    number = scanner.nextInt();
                    ob.validInteger(number);
                    break;
                } catch (NonPositiveInteger nonPositiveInteger) {
                    System.out.println(nonPositiveInteger.getMessage());
                } catch (InputMismatchException e) {
                    scanner.next();
                    System.out.println("Numbers only. ");
                }
            }
            sum += number;
        }
        System.out.printf("The Average is %s", sum / N);
    }
}
