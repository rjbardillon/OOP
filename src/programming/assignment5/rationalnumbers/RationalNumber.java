/*
Bardillon, Romeo Jr, M.
BSIT 2-2
RationalNumber.java
 */
package programming.assignment5.rationalnumbers;

public class RationalNumber {

    private final double number;

    public RationalNumber(String stringRational) {
        number = Double.parseDouble(stringRational);
    }

    public static boolean isRational(String possibleRational) {
        try {
            String separator ="√";
            int sepPos = possibleRational.indexOf(separator);
            if (sepPos == -1) {
                System.out.println("");
            }
            String radicand = possibleRational.substring(sepPos + separator.length());
            if ('√' == possibleRational.charAt(0)){
                return Math.sqrt(Double.parseDouble(radicand)) % 1 == 0;
            } else {
                double possibleRationalDouble = Double.parseDouble(possibleRational);
                double n = Double.parseDouble(String.valueOf(possibleRationalDouble));
                return true;
            }

        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    public double getNumber() {
        return number;
    }

    public int compareTo(RationalNumber toCompare) {
        Double numberDouble = number;
        return numberDouble.compareTo(toCompare.getNumber());
    }
}
