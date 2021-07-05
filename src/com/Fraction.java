package com;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Fraction {
    //main method
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            //take user input
            System.out.println("Enter the decimal number");
            String input = scanner.nextLine();
            int[] result = convertToFraction(input);
            //output result
            System.out.println(result[0] + "/" + result[1]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }


    /**
     * Converts a number to fraction
     * @param numberStr
     * @return
     * @throws Exception
     */
    static int[] convertToFraction(String numberStr) throws Exception {
        String[] parts = null;
        try {
            //parse the string to convert to a number
            BigDecimal number = new BigDecimal(numberStr);
            parts = number.toString().split("\\.");
            //check if there was a decimal in the number
            if (parts.length < 2) {
                throw new ArrayIndexOutOfBoundsException("Error: Please ensure that"+
                        " the entered value has a decimal.");
            }
        } catch (NumberFormatException e) {
            throw new Exception(
                    "Error: Please enter the number in proper format.");
        } catch (ArrayIndexOutOfBoundsException ae){
            throw ae;
        }
        /*
         * Remove decimal
         */

        // determine the denominator
        BigDecimal den = BigDecimal.TEN.pow(parts[1].length());
        // determine the numerator
        BigDecimal num = (new BigDecimal(parts[0]).multiply(den))
                .add(new BigDecimal(parts[1]));
        return reduceFraction(num.intValue(), den.intValue());
    }

    /**
     * Convert the numerator and denominator to their minimum values where no
     * further cancellations are possible. For this we need to determine the
     * common divisor of numerator and denominator elements
     *
     * @param num
     * @param den
     * @return
     */
    static int[] reduceFraction(int num, int den) {
        // get the gcd
        int gcd = BigInteger.valueOf(num).gcd(BigInteger.valueOf(den))
                .intValue();
        // divide the numerator and denominator by gcd
        int[] fractionElements = { num / gcd, den / gcd };
        return fractionElements;
    }
}
