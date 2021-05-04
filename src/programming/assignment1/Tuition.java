package programming.assignment1;/*
Bardillon, Romeo Jr, M.
BSIT 2-2
Tuition.java
 */

import java.text.DecimalFormat;

public class Tuition {

    public static void main(String[] args) {
        double originalTuition = 12.00;
        double tuition = originalTuition;
        double percentRaiseEveryYear = 1.07;
        double tuitionAfter11Years = 0.00;
        int year = 0;

        while (tuition < (originalTuition * 2)) {
            tuition = tuition * percentRaiseEveryYear;
            year++;
            if (year == 11) {
                tuitionAfter11Years = tuition;
            }
        }

        System.out.printf("Tuition will be doubled in %d years\n", year);
        System.out.printf("Tuition will be PHP %s in 11 years", formatAmount(tuitionAfter11Years));
    }

    private static String formatAmount(double amount) {
        return new DecimalFormat("#,###.00").format(amount);
    }
}
