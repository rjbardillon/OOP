/*
Bardillon, Romeo Jr, M.
BSIT 2-2
GetLowestTerm.java
 */
package programming.assignment5.rationalnumbers;

import java.math.BigDecimal;
import java.math.BigInteger;

public class GetLowestTerm {

    private GetLowestTerm() {
        // Unused constructor
    }

    public static String getFraction(RationalNumber rationalNumber) {
        int[] result = convertToFraction(String.valueOf(rationalNumber.getNumber()));
        return result[0] + "/" + result[1];
    }

    private static int[] convertToFraction(String numberStr) {
        String[] parts;
        BigDecimal number = new BigDecimal(numberStr);
        parts = number.toString().split("\\.");

        BigDecimal den = BigDecimal.TEN.pow(parts[1].length());
        BigDecimal num = (new BigDecimal(parts[0]).multiply(den)).add(new BigDecimal(parts[1]));

        return reduceFraction(num.intValue(), den.intValue());
    }

    private static int[] reduceFraction(int num, int den) {
        int gcd = BigInteger.valueOf(num).gcd(BigInteger.valueOf(den)).intValue();

        return new int[]{num / gcd, den / gcd};
    }
}
