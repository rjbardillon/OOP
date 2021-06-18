package programming.assignment4;

import java.util.Scanner;

class NonPositiveInteger extends Exception {
    NonPositiveInteger() {
        System.out.print("N Must be Positive");
    }
}

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 0;

        System.out.println("How many integers? ");
        N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            try {
                System.out.printf("%s ", i + 1);
                i = scanner.nextInt();
            }catch (NonPositiveInteger e){

            }
        }
    }
}
