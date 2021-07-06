/*
Bardillon, Romeo Jr, M.
BSIT 2-2
RationalOperationsImpl.java
 */
package programming.assignment5.rationalnumbers;

public class RationalOperationsImpl implements RationalOperations {

    private final RationalNumber firstNumber;
    private final RationalNumber secondNumber;

    public RationalOperationsImpl(RationalNumber firstNumber, RationalNumber secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    @Override
    public double add() {
        return firstNumber.getNumber() + secondNumber.getNumber();
    }

    @Override
    public double subtract() {
        return firstNumber.getNumber() - secondNumber.getNumber();
    }

    @Override
    public double multiply() {
        return firstNumber.getNumber() * secondNumber.getNumber();
    }

    @Override
    public double divide() {
        return firstNumber.getNumber() / secondNumber.getNumber();
    }

    @Override
    public String compare() {
        int compareResult = firstNumber.compareTo(secondNumber);
        if (compareResult == 0) {
            return firstNumber.getNumber() + " is equal to " + secondNumber.getNumber();
        } else if (compareResult == 1) {
            return firstNumber.getNumber() + " is greater than " + secondNumber.getNumber();
        } else {
            return firstNumber.getNumber() + " is less than " + secondNumber.getNumber();
        }
    }

    @Override
    public String lowestTerm() {
        String firstNumberLowestTerm = GetLowestTerm.getFraction(firstNumber);
        String secondNumberLowestTerm = GetLowestTerm.getFraction(secondNumber);

        return String.format("The lowest term of %s is %s.%nThe lowest term of %s is %s.", firstNumber.getNumber(),
                firstNumberLowestTerm, secondNumber.getNumber(), secondNumberLowestTerm);
    }

    @Override
    public double convertToFloatingPoint() {
        // ToDo:  implement floating point method
        return 0.0;
    }

    @Override
    public String absoluteValue() {
        String firstNumberAbsoluteValue = String.valueOf(Math.abs(firstNumber.getNumber()));
        String secondNumberAbsoluteValue = String.valueOf(Math.abs(secondNumber.getNumber()));

        return String.format("The absolute value of %s is %s.%nThe absolute value of %s is %s.", firstNumber.getNumber(),
                firstNumberAbsoluteValue, secondNumber.getNumber(), secondNumberAbsoluteValue);
    }

    @Override
    public String displayLine() {
        return firstNumber.getNumber() + " and " + secondNumber.getNumber();
    }
}
