package programming.rationalnumbers;

public class RationalNumber {

    private final double number;

    public RationalNumber(String stringRational) {
        number = Double.parseDouble(stringRational);
    }

    public static boolean isRational(String possibleRational) {
        try {
            double possibleRationalDouble = Double.parseDouble(possibleRational);

            return possibleRationalDouble % 1.0 != 0.0;
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
