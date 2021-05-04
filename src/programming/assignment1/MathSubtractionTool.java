package programming.assignment1;/*
Bardillon, Romeo Jr, M.
BSIT 2-2
MathSubtractionTool.java
 */

import java.util.Random;
import java.util.Scanner;

public class MathSubtractionTool {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minuend, subtrahend, answer, correct = 0;
        long start;
        long end;
        long time;
        start = System.currentTimeMillis();
        for (int i = 1; i <= 5; i++) {
            do {
                minuend = getRandomNumber();
                subtrahend = getRandomNumber();
            } while (minuend < subtrahend);
            System.out.printf("%s. What is %s - %s ", i, minuend, subtrahend);
            answer = scanner.nextInt();
            int difference = minuend - subtrahend;
            if (difference == answer) {
                System.out.println("Your answer is correct!");
                correct++;
            } else {
                System.out.printf("Your answer is wrong.\n %s - %s = %s\n", minuend, subtrahend, difference);
            }
        }
        end = System.currentTimeMillis();
        time = end - start;
        System.out.printf("Correct count is %s\nTest Time is %s seconds", correct, time);
    }

    private static int getRandomNumber() {
        return new Random().nextInt(100 - 1) + 1;
    }
}
